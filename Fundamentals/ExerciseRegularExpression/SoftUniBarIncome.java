package ExerciseRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<customer>[A-Z][a-z]*)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>[\\d]+)\\|[^|$%.]*?(?<price>[\\d]+.?[\\d]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                totalIncome += totalPrice;
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                System.out.printf("%s: %s - %.2f%n", customer, product, totalPrice);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f%n", totalIncome);
    }
}
