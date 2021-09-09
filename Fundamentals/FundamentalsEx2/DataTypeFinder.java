package FundamentalsEx2;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String dataType = "";

            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
                dataType = "boolean";
            } else if (input.length() == 1){
                char symbol = input.charAt(0);
                if (symbol < 47 || symbol > 58){
                    dataType = "character";
                } else {
                    dataType = "integer";
                }
            } else {
                int length = input.length();
                boolean isFloating = false;
                boolean isString = false;
                for (int i = 0; i < length; i++) {
                    char symbol = input.charAt(i);
                    if (symbol == 46) {
                        isFloating = true;
                    }
                    if (symbol < 45 || symbol > 57){
                        isString = true;
                    }
                }
                if (isString){
                    dataType = "string";
                } else {
                    if (isFloating){
                        dataType = "floating point";
                    }else {
                        dataType = "integer";
                    }
                }
            }
            System.out.println(input + " is " + dataType + " type");
            input = scanner.nextLine();
        }
    }
}
