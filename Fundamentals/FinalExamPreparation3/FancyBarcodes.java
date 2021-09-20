package FinalExamPreparation3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfBarcodes = Integer.parseInt(scanner.nextLine());
        String regex = "^@[#]+([A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numOfBarcodes; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (!matcher.find()){
                System.out.println("Invalid barcode");
            } else {
                String digitsRegex = "\\d";
                Pattern digitPattern = Pattern.compile(digitsRegex);
                Matcher digitMatcher = digitPattern.matcher(input);
                List<Integer> digitGroup = new ArrayList<>();
                System.out.print("Product group: ");
                while (digitMatcher.find()){
                    int digit = Integer.parseInt(digitMatcher.group());
                    digitGroup.add(digit);
                }
                if (!digitGroup.isEmpty()){
                    digitGroup.forEach(System.out::print);
                } else {
                    System.out.print("00");
                }
                System.out.println();
            }
        }
    }
}
