package ExerciseAssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        String input = scanner.nextLine();

        boolean flag = false;
        while (keyMaterials.get("shards") < 250 || keyMaterials.get("fragments") < 250 || keyMaterials.get("motes") < 250){
            String[] array = input.split("\\s+");
            for (int i = 0; i < array.length - 1; i++) {
                int quantity = Integer.parseInt(array[i]);
                String material = array[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    if (!keyMaterials.containsKey(material)){
                        keyMaterials.put(material, quantity);
                    } else {
                        quantity += keyMaterials.get(material);
                        keyMaterials.put(material, quantity);
                        if (quantity >= 250){
                            flag = true;
                            break;
                        }
                    }
                } else {
                    if (!junk.containsKey(material)){
                        junk.put(material, quantity);
                    } else {
                        quantity += junk.get(material);
                        junk.put(material, quantity);
                    }
                }
                i++;
            }
            if (flag){
                break;
            }
            input = scanner.nextLine();
        }

        if (keyMaterials.get("motes") >= 250){
            System.out.println("Dragonwrath obtained!");
            int current =keyMaterials.get("motes") - 250;
            keyMaterials.put("motes", current);
        } else if (keyMaterials.get("shards") >= 250){
            System.out.println("Shadowmourne obtained!");
            int current =keyMaterials.get("shards") - 250;
            keyMaterials.put("shards", current);
        } else if (keyMaterials.get("fragments") >= 250){
            System.out.println("Valanyr obtained!");
            int current =keyMaterials.get("fragments") - 250;
            keyMaterials.put("fragments", current);
        }

        keyMaterials.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach((entry) -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junk.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
