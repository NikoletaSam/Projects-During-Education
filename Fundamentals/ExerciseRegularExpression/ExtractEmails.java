package ExerciseRegularExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "[A-Za-z\\d]+[-._]?[A-Za-z\\d]+@[A-za-z]+\\-?[A-Za-z]+(\\.[A-za-z]+-?[A-za-z]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
