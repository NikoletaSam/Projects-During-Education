package ExerciseRegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            String input = scanner.nextLine();
            char[] array = input.toCharArray();
            int numberToSubtract = getNumberToSubtract(array);
            String newText = "";
            for (char symbol : array){
                symbol = (char) ((int)symbol - numberToSubtract);
                newText += symbol;
            }

            String regexAttackedPlanets = "(.*)?@(?<planetName>[A-Za-z]+)([^@\\-!:>]+)?:(?<population>[\\d]+)([^@\\-!:>]+)?!(?<typeOfAttack>A)!([^@\\-!:>]+)?->(?<soldierCount>[\\d]+)([^@\\-!:>]+)?";
            Pattern patternAttack = Pattern.compile(regexAttackedPlanets);
            Matcher matcherAttack = patternAttack.matcher(newText);
            if (matcherAttack.find()){
                String planet = matcherAttack.group("planetName");
                attackedPlanets.add(planet);
            }

            String regexDestroyedPlanets = "(.*)?@(?<planetName>[A-Za-z]+)([^@\\-!:>]+)?:(?<population>[\\d]+)([^@\\-!:>]+)?!(?<typeOfAttack>D)!([^@\\-!:>]+)?->(?<soldierCount>[\\d]+)([^@\\-!:>]+)?";
            Pattern patternDestroyed = Pattern.compile(regexDestroyedPlanets);
            Matcher matcherDestroyed = patternDestroyed.matcher(newText);
            if (matcherDestroyed.find()){
                String planet = matcherDestroyed.group("planetName");
                destroyedPlanets.add(planet);
            }
        }

        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets
                .stream()
                .sorted()
                .forEach(planet -> System.out.printf("-> %s%n", planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets
                .stream()
                .sorted()
                .forEach(planet -> System.out.printf("-> %s%n", planet));
    }

    private static int getNumberToSubtract(char[] array) {
        int counter = 0;
        for (char symbol : array){
            symbol = Character.toLowerCase(symbol);
            if (symbol == 's' || symbol == 'a' || symbol == 't' || symbol == 'r'){
                counter++;
            }
        }
        return counter;
    }
}
