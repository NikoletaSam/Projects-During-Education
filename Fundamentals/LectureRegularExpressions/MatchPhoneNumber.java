package LectureRegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\+359(?<Separator>[ ]|[-])2\\1([\\d]){3}\\1([\\d]){4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> numbers = new ArrayList<>();

        while (matcher.find()){
            String current = matcher.group();
            numbers.add(current);
        }

        String output = numbers.toString().replace("[", "").replace("]", "");
        System.out.println(output);
    }
}
