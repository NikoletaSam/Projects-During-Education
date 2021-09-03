package NestedLoop.lab;
import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 23; i++){
            for (int n = 0; n <= 59; n++){
                System.out.printf("%d:%d%n", i, n);
            }
        }
    }
}
