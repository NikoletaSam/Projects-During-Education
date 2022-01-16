package ExeptionsAndErrorHandling.person;

import java.util.Scanner;

public class CreatePerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        Person person;

        try {
            person = new Person(firstName, lastName, age);
            System.out.println(person);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
