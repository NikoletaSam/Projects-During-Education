package Exams.EarlyExam;
import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthSpaceship = Double.parseDouble(scanner.nextLine());
        double lengthSpaceship = Double.parseDouble(scanner.nextLine());
        double heightSpaceship = Double.parseDouble(scanner.nextLine());
        double averageHeightAstronauts = Double.parseDouble(scanner.nextLine());

        double volumeSpaceship = widthSpaceship * lengthSpaceship * heightSpaceship;
        double volumeLittleRoom = (averageHeightAstronauts + 0.40) * 2 * 2;
        double people = Math.floor(volumeSpaceship / volumeLittleRoom);

        if (people < 3){
            System.out.println("The spacecraft is too small.");
        } else if (people <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", people);
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
