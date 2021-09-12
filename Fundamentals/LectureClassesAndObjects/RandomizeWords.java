package LectureClassesAndObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        while (input.size() > 0){
            Random random = new Random();
            String current = input.get(random.nextInt(input.size()));
            System.out.println(current);
            input.remove(current);
        }
    }
}
