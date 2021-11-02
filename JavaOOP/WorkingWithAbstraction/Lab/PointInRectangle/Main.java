package WorkingWithAbstraction.Lab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bottomLeftX = firstInput[0];
        int bottomLeftY = firstInput[1];
        int topRightX = firstInput[2];
        int topRightY = firstInput[3];

        Point bottomLeft = new Point(bottomLeftX, bottomLeftY);
        Point topRight = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int numOfPointsToCheck = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfPointsToCheck; i++) {
            int[] currentInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int x = currentInput[0];
            int y = currentInput[1];
            Point currentPoint = new Point(x, y);
            System.out.println(rectangle.contains(currentPoint));
        }
    }
}
