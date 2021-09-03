package ConditionalsWhile.lab;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String newPass = scanner.nextLine();
        while (!newPass.equals(password)){
            newPass = scanner.nextLine();

        }
        System.out.printf("Welcome %s!", name);
    }
}
