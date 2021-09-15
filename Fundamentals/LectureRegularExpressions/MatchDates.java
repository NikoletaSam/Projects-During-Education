package LectureRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b(?<Day>[\\d]{2})(?<Separator>[.|\\/|-])(?<Month>[A-Z][a-z]{2})\\2(?<Year>[\\d]{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("Day: " + matcher.group("Day") + ", Month: " + matcher.group("Month") +
                    ", Year: " + matcher.group("Year"));
        }
    }
}
