package AssociativeArrays;

import java.util.*;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Map<String, Integer> countOfElements = new LinkedHashMap<>();

        for (String element : words){
            String wordLowerCase = element.toLowerCase();
            if (countOfElements.containsKey(wordLowerCase)){
                int counts = countOfElements.get(wordLowerCase);
                counts++;
                countOfElements.put(wordLowerCase, counts);
            }
            countOfElements.putIfAbsent(wordLowerCase, 1);
        }

        List<String> filtered = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countOfElements.entrySet()){
            if (entry.getValue() % 2 != 0){
                filtered.add(entry.getKey());
            }
        }

        System.out.println(filtered.toString().replaceAll("\\[", "")
                .replaceAll("\\]", ""));
    }
}
