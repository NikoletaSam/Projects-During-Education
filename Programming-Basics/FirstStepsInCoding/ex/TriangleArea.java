package FirstStepsInCoding.ex;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = length * height / 2;

        System.out.printf("%.2f", area);
    }
}
