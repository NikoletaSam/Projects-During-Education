package ExamPreparation5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] array = input.split("\\s+");
            String command = array[0];
            int index = Integer.parseInt(array[1]);
            switch (command){
                case "Shoot":
                    if (index >= 0 && index < targets.size()){
                        int power = Integer.parseInt(array[2]);
                        int newCurrent = targets.get(index) - power;
                        if (newCurrent > 0){
                            targets.set(index, newCurrent);
                        } else {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targets.size()){
                        int value = Integer.parseInt(array[2]);
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(array[2]);
                    int before = index - radius;
                    int after = index + radius;
                    if (before >= 0 && before < targets.size() && after >= 0 && after < targets.size()){
                        for (int i = after; i >= before ; i--) {
                            targets.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.print(targets.get(i) + "|");
        }

        System.out.print(targets.get(targets.size() - 1));
    }
}
