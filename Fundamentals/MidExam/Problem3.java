package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();

        int startingIndex = entryPoint;
        int border = priceRatings.get(entryPoint);
        switch (typeOfItems){
            case "cheap":
                int leftSumCheap = 0;
                for (int i = 0; i < startingIndex; i++) {
                    int current = priceRatings.get(i);
                    if (current < border){
                        leftSumCheap += priceRatings.get(i);
                    }
                }
                int rightSumCheap = 0;
                for (int i = startingIndex + 1; i < priceRatings.size() ; i++) {
                    int current = priceRatings.get(i);
                    if (current < border){
                        rightSumCheap += priceRatings.get(i);
                    }
                }
                if (rightSumCheap > leftSumCheap){
                    System.out.printf("Right - %d%n", rightSumCheap);
                } else {
                    System.out.printf("Left - %d%n", leftSumCheap);
                }
                break;
            case "expensive":
                int leftSumExpensive = 0;
                for (int i = 0; i < startingIndex; i++) {
                    int current = priceRatings.get(i);
                    if (current >= border){
                        leftSumExpensive += priceRatings.get(i);
                    }
                }
                int rightSumExpensive = 0;
                for (int i = startingIndex + 1; i < priceRatings.size() ; i++) {
                    int current = priceRatings.get(i);
                    if (current >= border){
                        rightSumExpensive += priceRatings.get(i);
                    }
                }
                if (rightSumExpensive > leftSumExpensive){
                    System.out.printf("Right - %d%n", rightSumExpensive);
                } else {
                    System.out.printf("Left - %d%n", leftSumExpensive);
                }
                break;
        }
    }
}
