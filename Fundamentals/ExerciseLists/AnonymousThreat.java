package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("3:1")){
            String[] command = input.split("\\s+");
            switch (command[0]){
                case "merge":
                    int startingIndex = Integer.parseInt(command[1]);
                    int endingIndex = Integer.parseInt(command[2]);
                    int beginning = Math.max(0, startingIndex);
                    int ending = Math.min(endingIndex, line.size() - 1);
                    boolean isStartingIndexValid = IsIndexValid(beginning, line);
                    boolean isEndingIndexValid = IsIndexValid(ending, line);
                    if (isEndingIndexValid && isStartingIndexValid){
                        StringBuilder str = new StringBuilder();
                        for (int i = beginning; i <= ending; i++) {
                            str.append(line.get(i));
                        }
                        for (int i = beginning; i <= ending; i++) {
                            line.remove(beginning);
                        }
                        line.add(beginning, str.toString());
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);
                    String stringToDivide = line.get(index);
                    line.remove(index);
                    int partSize = stringToDivide.length() / partitions;
                    int begin = 0;
                    for (int i = 1; i < partitions; i++) {
                        line.add(index, stringToDivide.substring(begin, begin + partSize));
                        index++;
                        begin += partSize;
                    }
                    line.add(index, stringToDivide.substring(begin));
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", line));
    }

    private static boolean IsIndexValid(int beginning, List<String> line) {
        return 0 <= beginning && beginning <= line.size() - 1;
    }

}
