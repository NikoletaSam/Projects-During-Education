package LectureLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] splitInput = command.split(" ");
            switch (splitInput[0]){
                case "Contains":
                    int containingNumber =Integer.parseInt(splitInput[1]);
                    boolean doesTheListContainIt = DoesTheListContainTheNumber(numbers, containingNumber);
                    if (doesTheListContainIt){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (splitInput[1].equals("even")){
                        List<Integer> evenNumbersList = numbers;
                        String evenNumbers = FindingEvenNumbers(evenNumbersList);
                        System.out.println(evenNumbers);
                    } else if (splitInput[1].equals("odd")){
                        List<Integer> oddNumbersList = numbers;
                        String oddNumbers = FindingOddNumbers(oddNumbersList);
                        System.out.println(oddNumbers);
                    }
                    break;
                case "Get":
                    int sum = GetSum(numbers);
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = splitInput[1];
                    int numOfCondition =Integer.parseInt(splitInput[2]);
                    if (condition.equals("<")){
                        String lessNumbers = GetLessNumbers(numbers, numOfCondition);
                        System.out.println(lessNumbers);
                    } else if (condition.equals(">")){
                        String biggerNumbers = GetBiggerNumbers(numbers, numOfCondition);
                        System.out.println(biggerNumbers);
                    } else if (condition.equals(">=")){
                        String biggerOrEven = GetBiggerOrEvenNumbers(numbers, numOfCondition);
                        System.out.println(biggerOrEven);
                    } else if (condition.equals("<=")){
                        String smallerOrEven = GetSmallerOrEvenNumbers(numbers, numOfCondition);
                        System.out.println(smallerOrEven);
                    }
                    break;
            }

            numbers = Arrays.stream(input.split(" "))
                    .map(Integer :: parseInt).collect(Collectors.toList());
            command = scanner.nextLine();
        }
    }

    private static String GetSmallerOrEvenNumbers(List<Integer> numbers, int numOfCondition) {
        String output = "";
        for (int element : numbers){
            if (element <= numOfCondition){
                output += (element + " ");
            }
        }
        return output;
    }

    private static String GetBiggerOrEvenNumbers(List<Integer> numbers, int numOfCondition) {
        String output = "";
        for (int element : numbers){
            if (element >= numOfCondition){
                output += (element + " ");
            }
        }
        return output;
    }

    private static String GetBiggerNumbers(List<Integer> numbers, int numOfCondition) {
        String output = "";
        for (int element : numbers){
            if (element > numOfCondition){
                output += (element + " ");
            }
        }
        return output;
    }

    private static String GetLessNumbers(List<Integer> numbers, int numOfCondition) {
        String output = "";
        for (int element : numbers){
            if (element < numOfCondition){
                output += (element + " ");
            }
        }
        return output;
    }

    private static int GetSum(List<Integer> numbers) {
        int sum = 0;
        for (int element : numbers){
            sum += element;
        }
        return sum;
    }

    private static String FindingOddNumbers(List<Integer> oddNumbersList) {
        String output = "";
        for (int i = 0; i < oddNumbersList.size(); i++) {
            if (oddNumbersList.get(i) % 2 == 0){
                oddNumbersList.remove(i);
                i =-1;
            }
        }

        for (int element : oddNumbersList){
            output += (element + " ");
        }
        return output;
    }

    private static String FindingEvenNumbers(List<Integer> evenNumbersList) {
        String output = "";
        for (int i = 0; i < evenNumbersList.size(); i++) {
            if (evenNumbersList.get(i) % 2 != 0){
                evenNumbersList.remove(i);
                i =-1;
            }
        }

        for (int element : evenNumbersList){
            output += (element + " ");
        }
        return output;
    }

    private static boolean DoesTheListContainTheNumber(List<Integer> numbers, int containingNumber) {
        boolean flag = false;
        for (int element : numbers){
            if (element == containingNumber){
                flag =  true;
                break;
            } else {
                flag =  false;
            }
        }
        return flag;
    }
}
