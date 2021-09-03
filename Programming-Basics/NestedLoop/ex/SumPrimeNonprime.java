package NestedLoop.ex;
import java.util.Scanner;

public class SumPrimeNonprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enough = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
         while (!enough.equals("stop")){
             int num = Integer.parseInt(enough);

             if (num < 0){
                 System.out.println("Number is negative.");
             } else if ((num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) && num != 0 && num != 2 && num != 3 && num != 5 && num != 7){
                 sumNonPrime += num;
             } else {
                 sumPrime += num;
             }
             enough = scanner.nextLine();
         }

         System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
         System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
