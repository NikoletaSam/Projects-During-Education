package FirstStepsInCoding.ex;
import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double oneRectangleRoof = x * y;
        double oneTriangleRoof = x * h / 2;
        double areaRoof = 2 * oneRectangleRoof + 2 * oneTriangleRoof;
        double litresRoofNeeded = areaRoof / 4.3;

        double areaDoor = 1.2 * 2;
        double backWall = x * x;
        double frontWall = backWall - areaDoor;
        double areaSmallWalls = backWall + frontWall;
        double areaWindow = 1.5 * 1.5;
        double bigWall = x * y - areaWindow;
        double areaBigWalls = 2 * bigWall;
        double totalAreaWalls = areaBigWalls + areaSmallWalls;
        double litresWallsNeeded = totalAreaWalls / 3.4;

        System.out.printf("%.2f %n", litresWallsNeeded);
        System.out.printf("%.2f", litresRoofNeeded);
    }
}
