package LectureLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);

        if (numbers.size() <= 0){
            System.out.println("empty");
        } else {
            String output = "";
            for (int element : numbers){
                output += (element + " ");
            }
            System.out.println(output);
        }
    }
}