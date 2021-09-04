package Exams;
import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBalls = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

       int i = 0;
       while ( i < numBalls){
           String colour = scanner.nextLine();
           if (colour.equals("red")){
               totalPoints += 5;
               redBalls++;
           } else if (colour.equals("orange")){
               totalPoints += 10;
               orangeBalls++;
           } else if (colour.equals("yellow")){
               totalPoints += 15;
               yellowBalls++;
           } else if (colour.equals("white")){
               totalPoints += 20;
               whiteBalls++;
           } else if (colour.equals("black")){
               totalPoints = totalPoints / 2;
               blackBalls++;
           } else {
               otherBalls++;
           }
           i++;
       }

       System.out.println("Total points: " + totalPoints);
       System.out.println("Points from red balls: " + redBalls);
       System.out.println("Points from orange balls: " + orangeBalls);
       System.out.println("Points from yellow balls: " + yellowBalls);
       System.out.println("Points from white balls: " + whiteBalls);
       System.out.println("Other colors picked: " + otherBalls);
       System.out.println("Divides from black balls: " + blackBalls);
    }
}
