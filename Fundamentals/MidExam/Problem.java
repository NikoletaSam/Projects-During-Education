package MidExam;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine());
        double foodInGrams = quantityFood * 1000;
        double quantityHay = Double.parseDouble(scanner.nextLine());
        double hayInGrams = quantityHay * 1000;
        double quantityCover = Double.parseDouble(scanner.nextLine());
        double coverInGrams = quantityCover * 1000;
        double weight = Double.parseDouble(scanner.nextLine());
        double weightInGrams = weight * 1000;

        boolean flag = false;

        for (int i = 1; i <= 30; i++) {
            foodInGrams = foodInGrams - 300;
            if (i % 2 == 0){
                hayInGrams = hayInGrams - (0.05 * foodInGrams);
            }
            if (i % 3 == 0){
                coverInGrams = coverInGrams - (weightInGrams / 3);
            }
            if (hayInGrams <= 0 || foodInGrams <= 0 || coverInGrams <= 0){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Merry must go to the pet store!");
        } else {
            quantityFood = foodInGrams / 1000;
            quantityCover = coverInGrams / 1000;
            quantityHay = hayInGrams / 1000;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood, quantityHay, quantityCover);
        }
    }
}
