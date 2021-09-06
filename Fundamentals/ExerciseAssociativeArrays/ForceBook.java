package ExerciseAssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> sides = new TreeMap<>();

        while (!input.equals("Lumpawaroo")){
            if (input.contains("|")){
                String[] array = input.split(" \\| ");
                String forceSide = array[0];
                String forceUser = array[1];
                boolean flag = false;
                sides.putIfAbsent(forceSide, new ArrayList<>());
                for (Map.Entry<String, List<String>> element : sides.entrySet()){
                    if (element.getValue().contains(forceUser)){
                        flag = true;
                        break;
                    }
                }

                if (!flag){
                    sides.get(forceSide).add(forceUser);
                }
            } else {
                String[] array = input.split(" \\-> ");
                String forceUser = array[0];
                String forceSide = array[1];
                for (Map.Entry<String, List<String>> element : sides.entrySet()){
                    if (element.getValue().contains(forceUser)){
                        element.getValue().remove(forceUser);
                        break;
                    }
                }
                if (!sides.containsKey(forceSide)) {
                    sides.put(forceSide, new ArrayList<>());
                }
                sides.get(forceSide).add(forceUser);
                System.out.println(forceUser + " joins the " + forceSide + " side!");
            }

            input = scanner.nextLine();
        }

        sides
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, List<String>>comparingByValue(Comparator.comparing(List::size)).reversed().thenComparing(Map.Entry.comparingByKey()))
                .filter(e -> e.getValue().size() > 0)
                .forEach(entry -> {System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));});
    }
}
