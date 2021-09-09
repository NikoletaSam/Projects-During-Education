package FundamentalsEx1;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char symbol = username.charAt(position);
            password += symbol;
        }

        String tryPassword = scanner.nextLine();
        int counter = 0;
        boolean flag = false;
        while (!tryPassword.equals(password)){
            counter++;
            if (counter == 4){
                flag = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            tryPassword = scanner.nextLine();
        }
        if (!flag){
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
