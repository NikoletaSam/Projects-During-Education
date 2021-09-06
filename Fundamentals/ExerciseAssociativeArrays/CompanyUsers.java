package ExerciseAssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companies = new TreeMap<>();

        while (!input.equals("End")){
            String[] array = input.split(" -> ");
            String companyName = array[0];
            String personID = array[1];

            companies.putIfAbsent(companyName, new ArrayList<>());
            if (!companies.get(companyName).contains(personID)){
                companies.get(companyName).add(personID);
            }

            input = scanner.nextLine();
        }

        companies.entrySet().stream()
                .forEach((entry) -> {
                    System.out.println(entry.getKey());
                    entry.getValue().stream().forEach(ID -> System.out.printf("-- %s%n", ID));});
    }
}
