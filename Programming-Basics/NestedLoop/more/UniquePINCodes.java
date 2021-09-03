package NestedLoop.more;
import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFirst = Integer.parseInt(scanner.nextLine());
        int maxSecond = Integer.parseInt(scanner.nextLine());
        int maxThird = Integer.parseInt(scanner.nextLine());

        //цикъл за първо число
        for (int first = 1; first <= maxFirst; first++){
            if (first % 2 != 0){
                continue;
            }
            //цикъл за второ число
            for (int second = 1; second <= maxSecond; second++){
                if (second != 2 && second != 3 && second != 5 && second != 7){
                    continue;
                }
                //цикъл за трето число
                for (int third = 1; third <= maxThird; third++){
                    if (third % 2 != 0){
                        continue;
                    }
                    System.out.printf("%d %d %d%n", first, second, third);
                }
            }
        }
    }
}
