package FirstStepsInCoding.ex;
import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm = length * width * height;
        double volumeInLitres = volumeInCm * 0.001;
        double neededLitres = volumeInLitres - volumeInLitres * percent / 100;

        System.out.printf("%.2f", neededLitres);
    }
}
