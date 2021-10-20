package ExamPreparationSeventh;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> bombs = new TreeMap<>();
        bombs.put("Datura Bombs", 0);
        bombs.put("Cherry Bombs", 0);
        bombs.put("Smoke Decoy Bombs", 0);

        ArrayDeque<Integer> effects = new ArrayDeque<>();
        String[] firstInput = scanner.nextLine().split(",\\s+");
        for (String current : firstInput){
            effects.offer(Integer.parseInt(current));
        }

        ArrayDeque<Integer> casings = new ArrayDeque<>();
        String[] secondInput = scanner.nextLine().split(",\\s+");
        for (String current : secondInput){
            casings.push(Integer.parseInt(current));
        }

        boolean hasEnoughBombs = false;

        while (!casings.isEmpty() && !effects.isEmpty()){
            int currentEffect = effects.peek();
            int currentCasing = casings.peek();

            if (currentCasing + currentEffect == 40){
                effects.poll();
                casings.pop();
                int numDaturaBombs = bombs.get("Datura Bombs");
                bombs.put("Datura Bombs", numDaturaBombs + 1);
            } else if (currentCasing + currentEffect == 60){
                effects.poll();
                casings.pop();
                int numCherryBombs = bombs.get("Cherry Bombs");
                bombs.put("Cherry Bombs", numCherryBombs + 1);
            } else if (currentCasing + currentEffect == 120){
                effects.poll();
                casings.pop();
                int numSmokeBombs = bombs.get("Smoke Decoy Bombs");
                bombs.put("Smoke Decoy Bombs", numSmokeBombs + 1);
            } else {
                int casing = casings.pop();
                casings.push(casing - 5);
            }

            if (bombs.get("Smoke Decoy Bombs") >= 3 && bombs.get("Cherry Bombs") >= 3 && bombs.get("Datura Bombs") >= 3){
                hasEnoughBombs = true;
                break;
            }
        }

        if (hasEnoughBombs){
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        if (effects.isEmpty()){
            System.out.println("Bomb Effects: empty");
        } else {
            String output = effects.toString().replace("[", "").replace("]", "");
            System.out.println("Bomb Effects: " + output);
        }

        if (casings.isEmpty()){
            System.out.println("Bomb Casings: empty");
        } else {
            String output = casings.toString().replace("[", "").replace("]", "");
            System.out.println("Bomb Casings: " + output);
        }

        bombs.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
