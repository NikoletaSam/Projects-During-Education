package DefiningClasses.Ex.CatLady;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cat> catsInformation = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] array = input.split("\\s+");
            String breed = array[0];
            String name = array[1];
            double specialInformation = Double.parseDouble(array[2]);
            Cat cat = new Cat(breed, name, specialInformation);

            catsInformation.put(name, cat);

            input = scanner.nextLine();
        }

        String catToOutput = scanner.nextLine();
        System.out.println(catsInformation.get(catToOutput));
    }
}
