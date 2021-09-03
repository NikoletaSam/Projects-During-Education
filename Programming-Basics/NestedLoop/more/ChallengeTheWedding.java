package NestedLoop.more;
import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxMen = Integer.parseInt(scanner.nextLine());
        int maxWomen = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int men = 1; men <= maxMen; men++){
            for (int women = 1; women <= maxWomen; women++){
                System.out.printf("(%d <-> %d) ", men, women);
                counter++;

                if (counter >= maxTables){
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
    }
}
