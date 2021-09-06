import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkWeek4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMBER_OF_ROWS = 15;
        final int NUMBER_OF_COLS = 15;
        final String BOARD_SIGN = ".";
        final String SMALL_HOUSE_SIGN = "*";
        final String MIDDLE_HOUSE_SIGN = "%";
        final String BIG_HOUSE_SIGN = "&";

        String[][] board = getBattleField(NUMBER_OF_COLS, NUMBER_OF_ROWS, BOARD_SIGN, SMALL_HOUSE_SIGN, MIDDLE_HOUSE_SIGN, BIG_HOUSE_SIGN);

        System.out.println("Your Battle Field:");
        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Choose direction:\n 1. A -> Left\n 2. S -> Down\n 3. D -> Right\n 4. W -> Up");

        String direction = scanner.nextLine();
        while (!direction.equals("Stop")){

            int firstFighterRow = 0;
            int firstFighterCol = 0;
            int secondFighterRow = 0;
            int secondFighterCol = 0;
            for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                for (int col = 0; col < NUMBER_OF_COLS; col++) {
                    if (board[row][col].equals("1 ")){
                        firstFighterRow = row;
                        firstFighterCol = col;
                    } else if (board[row][col].equals("2 ")){
                        secondFighterRow = row;
                        secondFighterCol = col;
                    }
                }
            }

            switch (direction){
                case "W":
                    firstFighterRow--;
                    if (firstFighterRow < 0){
                        System.out.println("ERROR!YOU HAVE REACHED THE END OF THE BATTLE FIELD!");
                    } else {
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                if (board[row][col].equals("1 ")){
                                    board[row][col] = 2 + " ";
                                } else if (board[row][col].equals("2 ")){
                                    board[row][col] = 3 + " ";
                                } else if (board[row][col].equals("3 ")){
                                    board[row][col] = 4 + " ";
                                } else if (board[row][col].equals("4 ")){
                                    board[row][col] = BOARD_SIGN + " ";
                                }
                            }
                        }
                        board[firstFighterRow][firstFighterCol] = 1 + " ";
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                System.out.print(board[row][col] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "S":
                    if (firstFighterRow == 14){
                        System.out.println("ERROR! YOU ARE AT THE END OF THE BATTLE FIELD!");
                    } else {
                        firstFighterRow++;
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                if (board[row][col].equals("1 ")){
                                    board[row][col] = 2 + " ";
                                } else if (board[row][col].equals("2 ")){
                                    board[row][col] = 3 + " ";
                                } else if (board[row][col].equals("3 ")){
                                    board[row][col] = 4 + " ";
                                } else if (board[row][col].equals("4 ")){
                                    board[row][col] = BOARD_SIGN + " ";
                                }
                            }
                        }
                        board[firstFighterRow][firstFighterCol] = 1 + " ";
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                System.out.print(board[row][col] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                case "D":
                    if ((firstFighterRow == secondFighterRow && firstFighterCol < secondFighterCol)
                        || firstFighterCol == 14){
                        System.out.println("ERROR! MOVEMENT NOT POSSIBLE!");
                    } else {
                        firstFighterCol++;
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                if (board[row][col].equals("1 ")){
                                    board[row][col] = 2 + " ";
                                } else if (board[row][col].equals("2 ")){
                                    board[row][col] = 3 + " ";
                                } else if (board[row][col].equals("3 ")){
                                    board[row][col] = 4 + " ";
                                } else if (board[row][col].equals("4 ")){
                                    board[row][col] = BOARD_SIGN + " ";
                                }
                            }
                        }
                        board[firstFighterRow][firstFighterCol] = 1 + " ";
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                System.out.print(board[row][col] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case "A":
                    if ((firstFighterRow == secondFighterRow && firstFighterCol > secondFighterCol)
                        || firstFighterCol == 0){
                        System.out.println("ERROR! MOVEMENT NOT POSSIBLE!");
                    } else {
                        firstFighterCol--;
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                if (board[row][col].equals("1 ")){
                                    board[row][col] = 2 + " ";
                                } else if (board[row][col].equals("2 ")){
                                    board[row][col] = 3 + " ";
                                } else if (board[row][col].equals("3 ")){
                                    board[row][col] = 4 + " ";
                                } else if (board[row][col].equals("4 ")){
                                    board[row][col] = BOARD_SIGN + " ";
                                }
                            }
                        }
                        board[firstFighterRow][firstFighterCol] = 1 + " ";
                        for (int row = 0; row < NUMBER_OF_ROWS; row++) {
                            for (int col = 0; col < NUMBER_OF_COLS; col++) {
                                System.out.print(board[row][col] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("ERROR! SUCH DIRECTION DOES NOT EXIST!");
                    break;
            }

            direction = scanner.nextLine();
        }

    }

    private static String[][] getBattleField(int number_of_cols, int number_of_rows, String board_sign, String small_house_sign, String middle_house_sign, String big_house_sign) {
        String[][] board = new String[number_of_rows][number_of_rows];
        for (int row = 0; row < number_of_rows; row++) {
            for (int col = 0; col < number_of_cols; col++) {
                board[row][col] = board_sign + " ";
            }
        }

        int firstTankRow = 14;
        int firstTankCol = 11;

        Random random = new Random();
        int smallRandomNumberRow = random.nextInt(12) + 1;
        int smallRandomNumberCol = random.nextInt(12) + 1;

        while (!((smallRandomNumberRow < firstTankRow - 4) || (smallRandomNumberCol < firstTankCol - 4))){
            smallRandomNumberRow = random.nextInt(12) + 1;
            smallRandomNumberCol = random.nextInt(12) + 1;
        }

        for (int i = smallRandomNumberRow; i <= smallRandomNumberRow + 1; i++) {
            for (int j = smallRandomNumberCol; j <= smallRandomNumberCol + 1; j++) {
                board[i][j] = small_house_sign + " ";
            }
        }

        int middleHouseNumberRow = random.nextInt(12) + 1;
        int middleHouseNumberCol = random.nextInt(11) + 1;

        while (!(((middleHouseNumberRow > smallRandomNumberRow + 4) || (middleHouseNumberRow < smallRandomNumberRow - 4)
                || (middleHouseNumberCol > smallRandomNumberCol + 4) || (middleHouseNumberCol < smallRandomNumberCol - 5))
                && ((middleHouseNumberRow < firstTankRow - 4) || (middleHouseNumberCol < firstTankCol - 5)))){
            middleHouseNumberRow = random.nextInt(12) + 1;
            middleHouseNumberCol = random.nextInt(11) + 1;
        }

        for (int i = middleHouseNumberRow; i <= middleHouseNumberRow + 1; i++) {
            for (int j = middleHouseNumberCol; j <= middleHouseNumberCol + 2; j++) {
                board[i][j] = middle_house_sign + " ";
            }
        }

        int bigHouseNumberRow = random.nextInt(11) + 1;
        int bigHouseNumberCol = random.nextInt(11) + 1;

        while (!(((bigHouseNumberRow > smallRandomNumberRow + 4) || (bigHouseNumberRow < smallRandomNumberRow - 5)
                || (bigHouseNumberCol > smallRandomNumberCol + 4) || (bigHouseNumberCol < smallRandomNumberCol - 5)) &&
                ((bigHouseNumberRow > middleHouseNumberRow + 4) || (bigHouseNumberRow < middleHouseNumberRow - 5)
                        || (bigHouseNumberCol > middleHouseNumberCol + 5) || (bigHouseNumberCol < middleHouseNumberCol - 5))
                  && ((bigHouseNumberRow < firstTankRow - 5) || (bigHouseNumberCol < firstTankCol - 5)))){
            bigHouseNumberRow = random.nextInt(11) + 1;
            bigHouseNumberCol = random.nextInt(11) + 1;
        }

        for (int i = bigHouseNumberRow; i <= bigHouseNumberRow + 2; i++) {
            for (int j = bigHouseNumberCol; j <= bigHouseNumberCol + 2; j++) {
                board[i][j] = big_house_sign + " ";
            }
        }

        int counterFighters = 1;
        for (int col = 11; col < 15; col++) {
            board[14][col] = counterFighters + " ";
            counterFighters++;
        }

        return board;
    }
}
