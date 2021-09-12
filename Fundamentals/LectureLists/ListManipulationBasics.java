package LectureLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] splitInput = command.split(" ");
            switch (splitInput[0]){
                case "Add":
                    int addingNumber = Integer.parseInt(splitInput[1]);
                    numbers.add(addingNumber);
                    break;
                case "Remove":
                    int removingNumber = Integer.parseInt(splitInput[1]);
                    numbers.remove((Integer) removingNumber);
                    break;
                case "RemoveAt":
                    int removingIndex = Integer.parseInt(splitInput[1]);
                    numbers.remove(removingIndex);
                    break;
                case "Insert":
                    int insertingNumber = Integer.parseInt(splitInput[1]);
                    int insertingIndex = Integer.parseInt(splitInput[2]);
                    numbers.add(insertingIndex, insertingNumber);
            }

            command = scanner.nextLine();
        }

        String output = "";
        for (int element : numbers){
            output += (element + " ");
        }
        System.out.println(output);
    }
}
