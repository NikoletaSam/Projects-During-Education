package ConditionalsWhile.ex;
import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedBadMarks = Integer.parseInt(scanner.nextLine());
        int badMarks = 0;
        double sum = 0.0;
        int totalMarks = 0;
        String lastProblem = "";

        while (badMarks < allowedBadMarks){
            String name = scanner.nextLine();
            if (name.equals("Enough")){
                break;
            } else {
                lastProblem = name;
            }
            double mark = Double.parseDouble(scanner.nextLine());
            sum += mark;
            totalMarks++;
            if (mark <= 4){
                badMarks++;
            }

        }

        if (badMarks >= allowedBadMarks){
            System.out.println("You need a break, " + badMarks + " poor grades.");
        } else {
            double average = sum / totalMarks;
            System.out.printf("Average score: %.2f %n", average);
            System.out.println("Number of problems: " + totalMarks);
            System.out.println("Last problem: " + lastProblem);
        }
    }
}
