package FunfamentalsLec2;
import java.util.Scanner;

public class MetresToKilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMetres = Integer.parseInt(scanner.nextLine());
        double distanceInKm = (distanceInMetres * 1.0) / 1000;
        System.out.printf("%.2f", distanceInKm);
    }
}
