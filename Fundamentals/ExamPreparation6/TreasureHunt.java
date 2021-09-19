package ExamPreparation6;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")){
            String[] array = input.split("\\s+");
            String command = array[0];
            switch (command){
                case "Loot":
                    for (int i = 1; i < array.length; i++) {
                        String item = array[i];
                        if (!loot.contains(item)){
                            loot.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(array[1]);
                    if (index >= 0 && index < loot.size()){
                        String current = loot.get(index);
                        loot.remove(index);
                        loot.add(current);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(array[1]);
                    if (count >= loot.size()){
                        for (int i = 0; i < loot.size() - 1; i++) {
                            System.out.print(loot.get(i) + ", ");
                        }
                        System.out.println(loot.get(loot.size() - 1));
                        for (int i = loot.size() - 1; i >= 0 ; i--) {
                            loot.remove(i);
                        }
                    } else {
                        List<String> removedItems = new ArrayList<>();
                        for (int i = 1; i <= count ; i++) {
                            removedItems.add(loot.get(loot.size() - 1));
                            loot.remove(loot.size() - 1);
                        }
                        for (int i = removedItems.size() - 1; i > 0; i--) {
                            System.out.print(removedItems.get(i) + ", ");
                        }
                        System.out.println(removedItems.get(0));
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        int lootCount = loot.size();
        if (lootCount == 0){
            System.out.println("Failed treasure hunt.");
        } else {
            int totalCount = 0;
            for (int i = 0; i < lootCount; i++) {
                int currentCount = loot.get(i).length();
                totalCount += currentCount;
            }
            double averageGain = (1.0 * totalCount) / lootCount;
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain);
        }

    }
}
