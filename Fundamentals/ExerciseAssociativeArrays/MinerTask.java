package ExerciseAssociativeArrays;

import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> miner = new LinkedHashMap<>();
        int counter = 0;
        String line = "";

        while (!input.equals("stop")){
            line += input + " ";
            input = scanner.nextLine();
        }

        String[] arrayStrings = line.split(" ");
        for (int i = 0; i < arrayStrings.length - 1; i++) {
            String minerName = arrayStrings[i];
            int quantity = Integer.parseInt(arrayStrings[i + 1]);
            if (miner.containsKey(minerName)){
                quantity += miner.get(minerName);
            }
            miner.put(minerName, quantity);
            i++;
        }


        for (Map.Entry<String, Integer> entry : miner.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
