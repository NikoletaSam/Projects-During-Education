package FinalExamPreparation1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(?<delimater>[=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;

        while (matcher.find()){
            String destination = matcher.group("destination");
            destinations.add(destination);
            travelPoints += destination.length();
        }

        System.out.println("Destinations: "
                + destinations.toString().replace("[", "").replace("]", ""));

        System.out.println("Travel Points: " + travelPoints);
    }
}
