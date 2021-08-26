package FirstStepsInCoding.ex;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());
        double cakePrice = rentHall * 0.2;
        double drinks = cakePrice * 0.55;
        double animator = rentHall / 3.0;
        double budget = cakePrice + drinks + animator + rentHall;

        System.out.printf("%.2f lv.", budget);
    }
}
