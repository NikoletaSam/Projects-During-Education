package Generics.Ex.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> elements = new CustomList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String[] current = input.split("\\s+");
            String command = current[0];

            switch (command){
                case "Add":
                    elements.add(current[1]);
                    break;
                case "Remove":
                    int index = Integer.parseInt(current[1]);
                    elements.remove(index);
                    break;
                case "Contains":
                    System.out.println(elements.contains(current[1]));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(current[1]);
                    int secondIndex = Integer.parseInt(current[2]);
                    elements.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    System.out.println(elements.countGreaterThan(current[1]));
                    break;
                case "Max":
                    System.out.println(elements.getMax());
                    break;
                case "Min":
                    System.out.println(elements.getMin());
                    break;
                case "Print":
                    System.out.print(elements);
                    break;
                case "Sort":
                    Sorter.sort(elements);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
