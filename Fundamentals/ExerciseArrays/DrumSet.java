package ExerciseArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        String lineOfDrums = scanner.nextLine();
        List<Integer> drumSet = Arrays.stream(lineOfDrums.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] arrayOfDrums = Arrays.stream(lineOfDrums.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")){
            int drumPower = Integer.parseInt(input);
            for (int i = 0; i < drumSet.size(); i++) {
                int current = drumSet.get(i) - drumPower;
                if (current <= 0){
                    int price = arrayOfDrums[i] * 3;
                    if ((savings - price) > 0){
                        savings = savings - price;
                        drumSet.set(i, arrayOfDrums[i]);
                    } else {
                        drumSet.set(i, 0);
                    }
                } else {
                    drumSet.set(i, current);
                }
            }

            input = scanner.nextLine();
        }

        for (int i = drumSet.size() - 1; i >= 0 ; i--) {
            if (drumSet.get(i) == 0){
                drumSet.remove(i);
            }
        }
        for (int drum : drumSet){
            System.out.print(drum + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.%n", savings);
    }
}
