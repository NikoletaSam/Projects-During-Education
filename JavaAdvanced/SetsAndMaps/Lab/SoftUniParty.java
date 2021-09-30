package SetsAndMaps.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> party = new TreeSet<>();

        while (!input.equals("PARTY")){
            party.add(input);

            input = scanner.nextLine();
        }

        String peopleComingToParty = scanner.nextLine();
        while (!peopleComingToParty.equals("END")){
            party.remove(peopleComingToParty);

            peopleComingToParty = scanner.nextLine();
        }

        System.out.println(party.size());
        for (String people : party){
            System.out.println(people);
        }
    }
}
