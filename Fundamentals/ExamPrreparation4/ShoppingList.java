package ExamPrreparation4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")){
            String[] array = input.split("\\s+");
            String command = array[0];
            String item = array[1];
            switch (command){
                case "Urgent":
                    if(!products.contains(item)){
                        products.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(item)){
                        products.remove(item);
                    }
                    break;
                case "Correct":
                    if (products.contains(item)){
                        String newItem = array[2];
                        int index = 0;
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).equals(item)){
                                index = i;
                                break;
                            }
                        }
                        products.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(item)){
                        products.remove(item);
                        products.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < products.size() - 1; i++) {
            String current = products.get(i);
            System.out.print(current + ", ");
        }
        System.out.print(products.get(products.size() - 1));
    }
}
