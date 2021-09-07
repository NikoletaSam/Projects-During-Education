package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> line = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] command = input.split(" ");
            if (command[0].equals("Delete")){
                for (int i = 0; i < line.size(); i++) {
                    if (line.get(i).equals(Integer.parseInt(command[1]))){
                        line.remove(i);
                    }
                }
            } else if (command[0].equals("Insert")){
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                line.add(index, number);
            }

            input = scanner.nextLine();
        }

        String output = "";
        for (int element : line){
            output += element + " ";
        }
        System.out.println(output);
    }
}
