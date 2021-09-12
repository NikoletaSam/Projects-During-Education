package LectureLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfProducts = Integer.parseInt(scanner.nextLine());
        List<String> listOfProducts = new ArrayList<>();
        for (int i = 0; i < numOfProducts; i++) {
            String productName = scanner.nextLine();
             listOfProducts.add(productName);
        }

        Collections.sort(listOfProducts);
        int counter = 1;
        for (String element : listOfProducts){
            System.out.printf("%d.%s%n", counter, element);
            counter++;
        }
    }
}
