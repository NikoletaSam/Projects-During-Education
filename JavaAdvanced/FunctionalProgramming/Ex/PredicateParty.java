package FunctionalProgramming.Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayList::new));

        String command = scanner.nextLine();
        while (!command.equals("Party!")){
            String typeOfCommand = command.split("\\s+")[0];
            String whereToApplyCommand = command.split("\\s+")[1];
            String symbol = command.split("\\s+")[2];

            Predicate<String> beginSymbol = current -> !current.startsWith(symbol);
            Predicate<String> endSymbol = current -> !current.endsWith(symbol);
            Predicate<String> length = current -> current.length() != Integer.parseInt(symbol);

            switch (typeOfCommand){
                case "Remove":
                    if (whereToApplyCommand.equals("StartsWith")){
                        names = names.stream().filter(beginSymbol).collect(Collectors.toList());
                    } else if (whereToApplyCommand.equals("EndsWith")){
                        names = names.stream().filter(endSymbol).collect(Collectors.toList());
                    } else {
                        names = names.stream().filter(length).collect(Collectors.toList());
                    }
                    break;
                case "Double":
                    if (whereToApplyCommand.equals("StartsWith")){
                        List<String> doubleNames = new ArrayList<>();
                        for (String name : names){
                            if (!beginSymbol.test(name)){
                                doubleNames.add(name);
                            }
                        }
                        names.addAll(doubleNames);
                    } else if (whereToApplyCommand.equals("EndsWith")){
                        List<String> doubleNames = new ArrayList<>();
                        for (String name : names){
                            if (!endSymbol.test(name)){
                                doubleNames.add(name);
                            }
                        }
                        names.addAll(doubleNames);
                    } else {
                        List<String> doubleNames = new ArrayList<>();
                        for (String name : names){
                            if (!length.test(name)){
                                doubleNames.add(name);
                            }
                        }
                        names.addAll(doubleNames);
                    }
                    break;

            }

            command = scanner.nextLine();
        }
        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            names = names.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.print(names.toString().replace("[", "").replace("]", ""));
            System.out.println(" are going to the party!");
        }
    }
}
