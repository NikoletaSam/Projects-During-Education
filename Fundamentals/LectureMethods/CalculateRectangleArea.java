package LectureMethods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double area = CalculationgAreaOfRectangle(height, width);
        System.out.printf("%.0f", area);
    }

    private static double CalculationgAreaOfRectangle(double height, double width) {
        return height * width;
    }
}
