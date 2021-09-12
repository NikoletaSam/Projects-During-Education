package LectureLists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLineOfInput = scanner.nextLine();
        String secondLineOfInput = scanner.nextLine();

        List<Double> firstLine = Arrays.stream(firstLineOfInput.split(" "))
                .map(Double ::parseDouble).collect(Collectors.toList());
        List<Double> secondLine = Arrays.stream(secondLineOfInput.split(" "))
                .map(Double ::parseDouble).collect(Collectors.toList());


        String beginningOutput = GetBeginningOutput(firstLine, secondLine);
        System.out.println(beginningOutput);
    }

    private static String GetBeginningOutput(List<Double> firstLine, List<Double> secondLine) {
        String output = "";
        if (firstLine.size() > secondLine.size()){
            int counter = 0;
            for (int i = 1; i <= 2 * secondLine.size(); i++) {
                if (i % 2 != 0){
                    firstLine.add(i, secondLine.get(counter));
                    counter++;
                }
            }
            for (double element : firstLine){
                output += (new DecimalFormat("0.##").format(element) + " ");
            }
        } else if (firstLine.size() < secondLine.size()){
            int counter = 0;
            for (int i = 0; i < 2 * firstLine.size(); i++) {
                if (i % 2 == 0){
                    secondLine.add(i, firstLine.get(counter));
                    counter++;
                }
            }
            for (double element : secondLine){
                output += (new DecimalFormat("0.##").format(element) + " ");
            }
        } else {
            int counter = 0;
            for (int i = 1; i <= 2 * secondLine.size(); i++) {
                if (i % 2 != 0){
                    firstLine.add(i, secondLine.get(counter));
                    counter++;
                }
            }
            for (double element : firstLine){
                output += (new DecimalFormat("0.##").format(element) + " ");
            }
        }
        return output;
    }
}
