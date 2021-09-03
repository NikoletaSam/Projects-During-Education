package NestedLoop.more;
import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginningNum = Integer.parseInt(scanner.nextLine());
        int endingNum = Integer.parseInt(scanner.nextLine());

        //цикъл за първо число
        for (int first = beginningNum; first <= endingNum; first++){
            //цикъл за второ число
            for (int second = beginningNum; second <= endingNum; second++){
                //цикъл за трето число
                for (int third = beginningNum; third <= endingNum; third++){
                    //цикъл за четвърто число
                    for (int fourth = beginningNum; fourth <= endingNum; fourth++){
                        int sum = second + third;

                        //проверки за специални числа
                        if (first % 2 == 0 && fourth % 2 == 0){
                            continue;
                        } else if (first % 2 != 0 && fourth % 2 != 0){
                            continue;
                        }

                        if (first <= fourth){
                            continue;
                        }

                        if (sum % 2 != 0){
                            continue;
                        }

                        System.out.printf("%d%d%d%d ", first, second, third, fourth);
                    }
                }
            }
        }
    }
}
