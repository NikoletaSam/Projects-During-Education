package NestedLoop.ex;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int lineCounter = 0;
        boolean flag = false;
        for (int i = 1; i <= n; i++){
            for (int line = 1; line <= i; line++){
                lineCounter++;
                if (lineCounter > n){
                    flag = true;
                    break;
                }

                System.out.printf("%d ", lineCounter);
            }
            if (flag){
                break;
            }
            System.out.println();
        }
    }
}
