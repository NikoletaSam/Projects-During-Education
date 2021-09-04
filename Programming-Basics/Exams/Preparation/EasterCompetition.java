package Exams.Preparation;
import java.util.Scanner;

public class EasterCompetition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int pointsPerBaker = 0;
        int currentPoints = 0;
        int biggestPoints = 0;
        String bestChef = "";
        for (int i = 1; i<= cakes; i++){
            String name = scanner.nextLine();
            String enough = scanner.nextLine();

            while (!enough.equals("Stop")){
                int result = Integer.parseInt(enough);
                pointsPerBaker += result;
                enough = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, pointsPerBaker);
            if (pointsPerBaker > currentPoints){
                biggestPoints = pointsPerBaker;
                bestChef = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
            currentPoints = pointsPerBaker;
            pointsPerBaker = 0;
        }
        System.out.printf("%s won competition with %d points!", bestChef, biggestPoints);
    }
}
