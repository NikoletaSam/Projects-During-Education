package NestedLoop.more;
import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;

        for (int first = 1; first <= 9; first++){
            for (int second = 1; second <= 9; second++){
                for (int third = 1; third <= 9; third++){
                    for (int fourth = 1; fourth <= 9; fourth++){

                        double sum = first * second + third * fourth;
                        if (first < second && third > fourth && sum == controlNum){
                            System.out.printf("%d%d%d%d ", first, second, third, fourth);
                            counter++;
                            if (counter == 4){
                                one = first;
                                two = second;
                                three = third;
                                four = fourth;
                            }
                        }
                    }
                }
            }
        }
        if (counter < 4){
            System.out.println();
            System.out.println("No!");
        } else {
            System.out.println();
            System.out.printf("Password: %d%d%d%d", one, two, three, four);
        }
    }
}
