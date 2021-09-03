package NestedLoop.more;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        //цикъл за първо число
        for (int first = 1; first <= 9; first++){
            //цикъл за второ число
            for (int second = 1; second <= 9; second++){
                //цикъл за трето число
                for (int third = 1; third <= 9; third++){
                    //цикъл за четвърто число
                    for (int fourth = 1; fourth <= 9; fourth++){
                        int sumFirstNumbers = first + second;
                        int sumSecondNumbers = third + fourth;

                        //проверка за щастливо число
                        if (sumFirstNumbers == sumSecondNumbers && num % sumFirstNumbers == 0){
                            System.out.printf("%d%d%d%d ", first, second, third, fourth);
                        }
                    }
                }
            }
        }
    }
}
