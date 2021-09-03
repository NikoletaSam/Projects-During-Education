package ConditionalsWhile.lab;
import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int room = width * height * length;
        int numBoxes = 0;
        String packageNum = scanner.nextLine();

        while (!packageNum.equals("Done")){
            int packages = Integer.parseInt(packageNum);
            numBoxes += packages;

            if(numBoxes >= room){
                break;
            }

            packageNum = scanner.nextLine();
        }
        if (numBoxes >= room){
            int cubicNeeded = numBoxes - room;
            System.out.println("No more free space! You need " + cubicNeeded + " Cubic meters more.");
        } else {
            int cubicLeft = room - numBoxes;
            System.out.println(cubicLeft + " Cubic meters left.");
        }
    }
}
