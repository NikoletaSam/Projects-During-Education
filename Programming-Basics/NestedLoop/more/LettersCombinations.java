package NestedLoop.more;
import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char maxFirst = scanner.nextLine().charAt(0);
        char maxSecond = scanner.nextLine().charAt(0);
        char maxThird = scanner.nextLine().charAt(0);
        int counter = 0;

        //цикъл за първа буква
        for (char first = maxFirst; first <= maxSecond; first++){
            if (first == maxThird){
                continue;
            }
            //цикъл за втора буква
            for (char second = maxFirst; second <= maxSecond; second++){
                if (second == maxThird){
                    continue;
                }
                //цикъл за трета буква
                for (char third = maxFirst; third <= maxSecond; third++){
                    if (third == maxThird){
                        continue;
                    }

                    System.out.printf("%c%c%c ", first, second, third);
                    counter++;
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
