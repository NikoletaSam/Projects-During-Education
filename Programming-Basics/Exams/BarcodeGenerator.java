package Exams;
import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginningNum = Integer.parseInt(scanner.nextLine());
        int endingNum = Integer.parseInt(scanner.nextLine());

        int firstDigitBegin = beginningNum / 1000;
        int secondDigitBegin = beginningNum / 100 % 10;
        int thirdDigitBegin = beginningNum / 10 % 10;
        int fourthDigitBegin = beginningNum % 10;

        int firstEndingDigit = endingNum / 1000;
        int secondEndingDigit = endingNum / 100 % 10;
        int thirdEndingDigit = endingNum / 10 % 10;
        int fourthEndingDigit = endingNum % 10;

        for (int first = firstDigitBegin; first <= firstEndingDigit; first++){
            for (int second = secondDigitBegin; second <= secondEndingDigit; second++){
                for (int third = thirdDigitBegin; third <= thirdEndingDigit; third++){
                    for (int fourth = fourthDigitBegin; fourth <= fourthEndingDigit; fourth++){

                        if (first % 2 == 0 || second % 2 == 0 || third % 2 == 0 || fourth % 2 == 0){
                            continue;
                        }
                        System.out.printf("%d%d%d%d ", first, second, third, fourth);
                    }
                }
            }
        }
    }
}
