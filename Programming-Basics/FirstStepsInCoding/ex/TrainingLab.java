package FirstStepsInCoding.ex;
import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wInMetres = Double.parseDouble(scanner.nextLine());
        double hInMetres = Double.parseDouble(scanner.nextLine());

        double wInCm = wInMetres * 100;
        double hInCm = hInMetres * 100;
        double hWithoutAisle = hInCm - 100;
        double seatsAtOneLine = hWithoutAisle % 70;
        double totalSeatsOneLine = (hWithoutAisle - seatsAtOneLine) / 70;
        double numLines = wInCm % 120;
        double totalLines = (wInCm - numLines) / 120;
        double seats = totalSeatsOneLine * totalLines;
        double totalSeats = seats - 3;

        System.out.printf("%.0f", totalSeats);
    }
}
