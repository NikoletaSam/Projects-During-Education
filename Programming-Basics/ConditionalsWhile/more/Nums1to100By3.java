package ConditionalsWhile.more;
import java.util.Scanner;

public class Nums1to100By3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 100;
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0){
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
