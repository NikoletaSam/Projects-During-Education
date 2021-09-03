package NestedLoop.more;
import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int numLinesFirstSector = Integer.parseInt(scanner.nextLine());
        int numSeatsOddLines = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        int numSeatsEvenLine = numSeatsOddLines + 2;

        for (char first = 65; first <= lastSector; first++){
            for (int lines = 1; lines <= numLinesFirstSector; lines++){
                if (lines % 2 != 0){
                    for (char seats = 97; seats < 97 + numSeatsOddLines; seats++){
                        System.out.printf("%c%d%c", first, lines, seats);
                        System.out.println();
                        counter++;
                    }
                } else {
                    for (char seats = 97; seats < 97 + numSeatsEvenLine; seats++){
                        System.out.printf("%c%d%c", first, lines, seats);
                        System.out.println();
                        counter++;
                    }
                }
            }
            numLinesFirstSector +=1;
        }
        System.out.println(counter);
    }
}
