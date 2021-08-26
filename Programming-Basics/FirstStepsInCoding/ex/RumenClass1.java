package FirstStepsInCoding.ex;
import java.util.Scanner;

public class RumenClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length1 = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = length1 * height / 2;

        System.out.println("The area is " + area);

    }
}
