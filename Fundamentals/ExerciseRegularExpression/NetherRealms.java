package ExerciseRegularExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> names = Arrays.stream(input.split("[, ]+")).collect(Collectors.toList());
        names =  names.stream().sorted().collect(Collectors.toList());

        for (String name : names){
            int health = getCurrentHealth(name);
            double damage = getCurrentDamage(name);
            System.out.printf("%s - %d health, ", name, health);
            String damageString = String.format(Locale.US, "%.2f", damage);
            System.out.println(damageString + " damage");
        }
    }


    private static double getCurrentDamage(String name) {
        double damage = 0;
        String regex = "-?\\+?[\\d]+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()){
            double currentDamage = Double.parseDouble(matcher.group());
            damage += currentDamage;
        }

        for (int i = 0; i < name.length(); i++) {
            char current = name.charAt(i);
            if (current == '*'){
                damage = damage * 2;
            }
            if (current == '/'){
                damage = damage / 2;
            }
        }
        return damage;
    }

    private static int getCurrentHealth(String name) {
        int health = 0;
        String output = "";
        String regex = "[^\\d+\\/*-\\.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()){
            output += matcher.group();
        }
        char[] array = output.toCharArray();
        for (char symbol : array){
            health += symbol;
        }
        return health;
    }
}
