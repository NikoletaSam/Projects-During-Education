package FinalExamPreparation3;

import java.util.*;

public class Heroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new TreeMap<>();

        for (int i = 1; i <= numOfHeroes; i++) {
            String input = scanner.nextLine();
            String[] array = input.split("\\s+");

            String heroName = array[0];
            int hitPoints = Integer.parseInt(array[1]);
            int manaPoints = Integer.parseInt(array[2]);

            heroes.putIfAbsent(heroName, new ArrayList<>());
            heroes.get(heroName).add(hitPoints);
            heroes.get(heroName).add(manaPoints);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] array = input.split(" - ");
            String command = array[0];
            String name = array[1];

            switch (command){
                case "CastSpell":
                    int manaPointsNeeded = Integer.parseInt(array[2]);
                    String spellName = array[3];
                    int currentManaPoints = heroes.get(name).get(1);
                    if (currentManaPoints >= manaPointsNeeded){
                        int newManaPoints = currentManaPoints - manaPointsNeeded;
                        heroes.get(name).set(1, newManaPoints);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, newManaPoints);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(array[2]);
                    String attacker = array[3];
                    int currentHPower = heroes.get(name).get(0);
                    int newHPower = currentHPower - damage;
                    if (newHPower > 0){
                        heroes.get(name).set(0, newHPower);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, newHPower);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                        heroes.remove(name);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(array[2]);
                    int currentMPower = heroes.get(name).get(1);
                    int newMonoPower = amount + currentMPower;
                    if (newMonoPower > 200){
                        newMonoPower = 200;
                        amount = 200 - currentMPower;
                    }
                    heroes.get(name).set(1, newMonoPower);
                    System.out.printf("%s recharged for %d MP!%n", name, amount);
                    break;
                case "Heal":
                    int amountHitPoints = Integer.parseInt(array[2]);
                    int current = heroes.get(name).get(0);
                    int newHitPoints = amountHitPoints + current;
                    if (newHitPoints > 100){
                        newHitPoints = 100;
                        amountHitPoints = 100 - current;
                    }
                    heroes.get(name).set(0, newHitPoints);
                    System.out.printf("%s healed for %d HP!%n", name, amountHitPoints);
                    break;
            }

            input = scanner.nextLine();
        }

        heroes
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().get(0), a.getValue().get(0)))
                .forEach((entry) -> System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
