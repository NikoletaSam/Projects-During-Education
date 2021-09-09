package FundamentalsEx2;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String model = "";
        String biggestKeg = "";
        double maxVolume = Double.MIN_VALUE;
        double volume = 0.0;
        for (int i = 1; i <= n; i++) {
            model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume){
                maxVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
