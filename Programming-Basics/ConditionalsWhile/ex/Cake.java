package ConditionalsWhile.ex;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        int totalPieces = cakeLength * cakeWidth;
        int takenPieces = 0;

        while (takenPieces < totalPieces){
            String input = scanner.nextLine();
            if (input.equals("STOP")){
                break;
            } else {
                int piecesPerPerson = Integer.parseInt(input);
                takenPieces += piecesPerPerson;
            }
        }

        if (takenPieces < totalPieces){
            int piecesLeft = totalPieces - takenPieces;
            System.out.println(piecesLeft + " pieces are left.");
        } else {
            int piecesMore = takenPieces - totalPieces;
            System.out.println("No more cake left! You need " + piecesMore + " pieces more.");
        }
    }
}
