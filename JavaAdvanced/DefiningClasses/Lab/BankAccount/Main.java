package DefiningClasses.Lab.BankAccount;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] arr = input.split("\\s+");
            String command = arr[0];

            switch (command){
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);
                    System.out.println("Account ID" + bankAccount.getId() + " created");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(arr[1]);
                    double amount = Double.parseDouble(arr[2]);
                    if (bankAccounts.containsKey(id)){
                        bankAccounts.get(id).deposit(amount);
                        DecimalFormat df = new DecimalFormat("0.####");
                        System.out.println("Deposited " + df.format(amount) + " to ID" + id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(arr[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int idNum = Integer.parseInt(arr[1]);
                    int years = Integer.parseInt(arr[2]);
                    if (bankAccounts.containsKey(idNum)){
                        double interestPerAccount = bankAccounts.get(idNum).getInterestRate(years);
                        System.out.printf("%.2f%n", interestPerAccount);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
