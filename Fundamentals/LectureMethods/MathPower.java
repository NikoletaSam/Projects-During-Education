package LectureMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        String result = FindingNumberToItsPower(number, power);
        System.out.println(result);
    }

    private static String FindingNumberToItsPower(double number, int power) {
        return new DecimalFormat("0.####").format(Math.pow(number, power));
    }
}
