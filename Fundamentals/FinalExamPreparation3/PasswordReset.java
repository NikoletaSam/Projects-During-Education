package FinalExamPreparation3;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")){
            if (input.equals("TakeOdd")){
                StringBuilder password = new StringBuilder();
                char[] array = text.toString().toCharArray();
                for (int i = 0; i < text.length(); i++) {
                    if (i % 2 != 0){
                        password.append(text.charAt(i));
                    }
                }
                text = password;
                System.out.println(text);
            } else {
                String[] array = input.split(" ");
                String command = array[0];
                switch (command){
                    case "Cut":
                        int index = Integer.parseInt(array[1]);
                        int length = Integer.parseInt(array[2]);
                        String substring = text.substring(index, index + length);
                        int firstIndex = text.indexOf(substring);
                        for (int i = firstIndex + length - 1; i >= firstIndex ; i--) {
                            text.deleteCharAt(i);
                        }
                        System.out.println(text);
                        break;
                    case "Substitute":
                        String substringToReplace = array[1];
                        String substitute = array[2];
                        if (!text.toString().contains(substringToReplace)){
                            System.out.println("Nothing to replace!");
                        } else {
                            while (text.toString().contains(substringToReplace)){
                                int start = text.indexOf(substringToReplace);
                                int lengthToReplace = substringToReplace.length();
                                text.replace(start, start + lengthToReplace, substitute);
                            }
                            System.out.println(text);
                        }
                        break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Your password is: " + text);
    }
}
