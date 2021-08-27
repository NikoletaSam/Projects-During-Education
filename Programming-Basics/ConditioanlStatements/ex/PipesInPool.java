package ConditioanlStatements.ex;
import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int debitPipe1 = Integer.parseInt(scanner.nextLine());
        int debitPipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double totalDebit = debitPipe1 * hours + debitPipe2 * hours;

        if(totalDebit > v){
            double overflewLitres = totalDebit - v;
            System.out.print("For " + hours + " hours the pool overflows with ");
            System.out.printf("%.2f", overflewLitres);
            System.out.println(" litres.");
        } else {
            double litresInPercentage = (totalDebit / v) * 100;
            double percentagePipe1 = ((debitPipe1 * hours) / totalDebit) * 100;
            double percentagePipe2 = ((debitPipe2 * hours) / totalDebit) * 100;
            System.out.print("The pool is ");
            System.out.printf("%.2f", litresInPercentage);
            System.out.print("% full. Pipe 1: ");
            System.out.printf("%.2f", percentagePipe1);
            System.out.print("%. Pipe 2: ");
            System.out.printf("%.2f", percentagePipe2);
            System.out.println("%.");
        }
    }
}
