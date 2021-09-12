package LectureLists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Double> numbers = Arrays.stream(input.split(" "))
                .map(Double :: parseDouble).collect(Collectors.toList());

        int length = numbers.size() / 2;
        for (int i = 0; i < length; i++) {
            numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
            numbers.remove(numbers.size() - 1);
        }

        String outout = "";
        for (double element : numbers){
            outout += (new DecimalFormat("0.##").format(element) + " ");
        }
        System.out.println(outout);
    }
}
