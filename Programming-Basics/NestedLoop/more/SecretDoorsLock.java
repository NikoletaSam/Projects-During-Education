package NestedLoop.more;
import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxHundreds = Integer.parseInt(scanner.nextLine());
        int maxDozens = Integer.parseInt(scanner.nextLine());
        int maxUnits = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= maxHundreds; first++){
            if (first % 2 != 0){
                continue;
            }
            for (int second = 1; second <= maxDozens; second++){
                if (second != 2 && second != 3 && second != 5 && second != 7){
                    continue;
                }
                for (int third = 1; third <= maxUnits; third++){
                    if (third % 2 != 0){
                        continue;
                    }

                    System.out.printf("%d %d %d%n", first, second, third);
                }
            }
        }
    }
}
