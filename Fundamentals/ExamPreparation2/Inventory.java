package ExamPreparation2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Craft!")){
            String[] array = input.split(" - ");
            String command = array[0];
            String item = array[1];
            switch (command){
                case "Collect":
                    if(!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if(items.contains(item)){
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] elements = item.split(":");
                    String oldElement = elements[0];
                    String newElement = elements[1];
                    if(items.contains(oldElement)){
                        int index = 0;
                        for (int i = 0; i < items.size(); i++) {
                            String current = items.get(i);
                            if(current.equals(oldElement)){
                                index = i + 1;
                                break;
                            }
                        }
                        items.add(index, newElement);
                    }
                    break;
                case "Renew":
                    if(items.contains(item)){
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < items.size() - 1; i++) {
            String current = items.get(i);
            System.out.print(current + ", ");
        }
        System.out.print(items.get(items.size() - 1));
    }
}
