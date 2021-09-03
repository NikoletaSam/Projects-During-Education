package NestedLoop.more;
import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждане от клавиатурата
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int maxNumberPasswords = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        //цикъл за първи символ
        for (char first = 35; first < 127; first++) {
            if (first > 55 && first < 110) {
                first = (char) (35 + (first - 55));
            } else if (first >= 110){
                char diff = (char) (first - 55);
                first = (char) (35 + (first - diff));
            }
            //цикъл за втори символ
            for (char second = 64; second < 127; second++) {
                if (second > 96) {
                    second = (char) (64 + (second - 96));
                }
                //цикъл за трети символ
                for (int third = 1; third <= num1; third++) {
                    //цикъл за четвърти символ
                    for (int fourth = 1; fourth <= num2; fourth++) {
                        System.out.printf("%c%c%d%d%c%c|", first, second, third, fourth, second, first);

                        first = (char) (first + 1);
                        second = (char) (second + 1);
                        counter++;

                        if (third >= num1 && fourth >= num2){
                            flag = true;
                            break;
                        }
                        if (counter >= maxNumberPasswords){
                            flag = true;
                            break;
                        }
                    }
                    if(flag){
                        break;
                    }
                }
                if (flag){
                    break;
                }
            }
            if (flag){
                break;
            }
        }
    }
}