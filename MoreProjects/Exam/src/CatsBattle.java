import java.util.Random;
import java.util.Scanner;

public class CatsBattle {

    public static int numOfTraps = 7;
    public static int numOfInvest = 3;
    public static int numOfPartyHard = 3;
    public static int numOfChance = 3;
    public static int numOfSteal = 3;

    public static int numOfTaxesForEachRoundFirstPlayer = 0;
    public static int numOfTaxesForEachRoundSecondPlayer = 0;

    public static boolean firstPlayerDivorce = false;
    public static boolean secondPlayerDivorce = false;

    public static boolean isFirstPlayerAbleToPutTrap = true;
    public static boolean isSecondPlayerAbleToPutTrap = true;

    public static boolean canFirstPlayerSteal = true;
    public static boolean canSecondPlayerSteal = true;

    public static boolean getFirstPlayerMoneyWhenOnChance = false;
    public static boolean getSecondPlayerMoneyWhenOnChance = false;

    public static boolean getFirstPlayerMoneyWhenOnInvest = false;
    public static boolean getSecondPlayerMoneyWhenOnInvest = false;

    public static boolean getFirstPlayerMoneyWhenOnSteal = false;
    public static boolean getSecondPlayerMoneyWhenOnSteal = false;

    public static boolean canFirstPlayerChanceBeGood = true;
    public static boolean canSecondPlayerChanceBeGood = true;

    public static boolean hasFirstPlayerEvilPlan = false;
    public static boolean hasSecondPlayerEvilPlan = false;

    public static int firstPlayerInvestEvelCo = 0;
    public static int firstPlayerInvestBombsAway = 0;
    public static int firstPlayerInvestClockWorkOrange = 0;
    public static int firstPlayerInvestMaroders = 0;
    public static int firstPlayerInvestFatCat = 0;
    public static int firstPlayerInvestMacrosoft = 0;

    public static int secondPlayerInvestEvelCo = 0;
    public static int secondPlayerInvestBombsAway = 0;
    public static int secondPlayerInvestClockWorkOrange = 0;
    public static int secondPlayerInvestMaroders = 0;
    public static int secondPlayerInvestFatCat = 0;
    public static int secondPlayerInvestMacrosoft = 0;

    public static final String TRAPS_SIGN = "T";
    public static final String INVEST_SIGN = "I";
    public static final String PARTY_HARD_SIGN = "P";
    public static final String CHANCE_SIGN = "C";
    public static final String STEAL_SIGN = "S";
    public static final String START_SIGN = "Y";
    public static final String FIRST_PLAYER_SIGN = "1";
    public static final String SECOND_PLAYER_SIGN = "2";

    public static final int NUM_OF_ROWS = 4;
    public static final int NUM_OF_COLS = 8;

    public static void main(String[] args) {

        //въвеждане на бойното поле
        Figures[][] battleField = new Figures[NUM_OF_ROWS][NUM_OF_COLS];

        //генериране на случайни числа
        Random random = new Random();

        //инициализация на бойното поле
        for (int row = 0; row < NUM_OF_ROWS; row++) {
            for (int col = 0; col < NUM_OF_COLS; col++) {
                if ((row > 0 && row < NUM_OF_ROWS - 1) && (col > 0 && col < NUM_OF_COLS - 1)){
                    battleField[row][col] = null;
                }else if (row == 3 && col == 7){
                    Start start = new Start("start", START_SIGN);
                    battleField[row][col] = start;
                } else {
                    int randomNumberToChoose = random.nextInt(5);
                    switch (randomNumberToChoose){
                        case 0:
                            if (numOfTraps > 0){
                                Traps trap = new Traps("normal", TRAPS_SIGN, false, false);
                                battleField[row][col] = trap;
                                numOfTraps--;
                            } else {
                                if (col == 0){
                                    row--;
                                } else {
                                    col--;
                                }
                            }
                            break;
                        case 1:
                            if (numOfInvest > 0){
                                Invest invest = new Invest("normal", INVEST_SIGN, "nobody");
                                battleField[row][col] = invest;
                                numOfInvest--;
                            } else {
                                if (col == 0){
                                    row--;
                                } else {
                                    col--;
                                }
                            }
                            break;
                        case 2:
                            if (numOfPartyHard > 0){
                                PartyHard partyHard = new PartyHard("party", PARTY_HARD_SIGN);
                                battleField[row][col] = partyHard;
                                numOfPartyHard--;
                            } else {
                                if (col == 0){
                                    row--;
                                } else {
                                    col--;
                                }
                            }
                            break;
                        case 3:
                            if (numOfChance > 0){
                                Chance chance = new Chance("chance", CHANCE_SIGN, true);
                                battleField[row][col] = chance;
                                numOfChance--;
                            } else {
                                if (col == 0){
                                    row--;
                                } else {
                                    col--;
                                }
                            }
                            break;
                        case 4:
                            if (numOfSteal > 0){
                                Steal steal = new Steal("normal", STEAL_SIGN);
                                battleField[row][col] = steal;
                                numOfSteal--;
                            } else {
                                if (col == 0){
                                    row--;
                                } else {
                                    col--;
                                }
                            }
                            break;
                    }
                }
            }
        }

        //първия и втория играч се намират на старт полето
        Player firstPlayer = new Player("firstPlayer", FIRST_PLAYER_SIGN, 3, 7, NumOfPlayerEnum.FIRST, false);
        Player secondPlayer = new Player("secondPlayer", SECOND_PLAYER_SIGN, 3, 7, NumOfPlayerEnum.SECOND, false);

        //визуализация на бойното поле
        System.out.println("Вашето бойно поле:");
        printBattleField(battleField);

        int firstPlayerMoney = 1000;
        int secondPlayerMoney = 1000;

        while (firstPlayerMoney > 0 && secondPlayerMoney > 0){
            int firstPlayerMove = random.nextInt(2) + 1;
            System.out.println("Първият играч е преместен с " + firstPlayerMove + " хода.");

            int currentFirstRow = firstPlayer.getRow();
            int currentFirstCol = firstPlayer.getCol();

            int movesRemained = 0;

            //преместване из дъската
            if ((currentFirstRow == NUM_OF_ROWS - 1) && (currentFirstCol >= 0)){
                currentFirstCol -= firstPlayerMove;
                if (currentFirstCol < 0){
                    movesRemained = Math.abs(currentFirstCol);
                    currentFirstCol = 0;
                    currentFirstRow -= movesRemained;
                }
            } else if ((currentFirstRow >= 0) && (currentFirstCol == 0)){
                currentFirstRow -= firstPlayerMove;
                if (currentFirstRow < 0){
                    movesRemained = Math.abs(currentFirstRow);
                    currentFirstRow = 0;
                    currentFirstCol += movesRemained;
                }
            } else if ((currentFirstRow == 0) && (currentFirstCol >= 0)){
                currentFirstCol += firstPlayerMove;
                if (currentFirstCol >= NUM_OF_COLS){
                    movesRemained = currentFirstCol - (NUM_OF_COLS - 1);
                    currentFirstCol = NUM_OF_COLS - 1;
                    currentFirstRow += movesRemained;
                }
            } else if ((currentFirstRow >= 0) && (currentFirstCol == NUM_OF_COLS - 1)){
                currentFirstRow += firstPlayerMove;
                if (currentFirstRow >= NUM_OF_ROWS){
                    movesRemained = currentFirstRow - (NUM_OF_ROWS - 1);
                    currentFirstRow = NUM_OF_ROWS - 1;
                    currentFirstCol -= movesRemained;
                }
            }

            firstPlayer.setRow(currentFirstRow);
            firstPlayer.setCol(currentFirstCol);

            int rowForOutput = currentFirstRow + 1;
            int colForOutput = currentFirstCol + 1;

            System.out.println("Първи играч: Вие се намирате на поле с ред:" + rowForOutput  + " и колона:" + colForOutput);

            Scanner scanner = new Scanner(System.in);

            //намираме на кое квадратче сме се преместили след хвърлянето на зарчето
            Figures currentField = battleField[currentFirstRow][currentFirstCol];
            String player = "first";
            if (currentField instanceof Start || (firstPlayerMove == 2 && currentFirstRow == 3 && currentFirstCol == 6)){
                if (currentField instanceof Start ){
                    System.out.println("Поле: СТАРТ");
                }
                firstPlayerMoney = stepOnStart(player, firstPlayerMoney);
                System.out.println("Вие разполагате с " + firstPlayerMoney + " шоколадови паричкк!");

            }
            if (currentField instanceof Traps){
                firstPlayerMoney = stepOnTrap(player, battleField, currentFirstRow, currentFirstCol, firstPlayerMoney);
                System.out.println("Вашите пари са: " + firstPlayerMoney);

            }
            if (currentField instanceof PartyHard){
                firstPlayerMoney = stepOnPartyHard(firstPlayerMoney);

            }
            if (currentField instanceof Chance){
                firstPlayerMoney = stepOnChance(player, battleField, currentFirstRow, currentFirstCol, firstPlayerMoney);

            }
            if (currentField instanceof Steal){
                firstPlayerMoney = stepOnSteal(player, battleField, currentFirstRow, currentFirstCol, firstPlayerMoney);
                System.out.println("Вие разполагате с " + firstPlayerMoney + " шоколадови парички!");

            }
            if (currentField instanceof Invest){
                firstPlayerMoney = stepOnInvest(player, firstPlayerMoney, battleField, currentFirstRow, currentFirstCol);
            }
            if (firstPlayerMoney <= 0){
                System.out.println("Първи играч: Вие останахте без пари и изгубихте играта!");
                break;
            }

            System.out.println();
            //Преместване на втори играч през бойното поле
            int secondPlayerMove = random.nextInt(2) + 1;
            System.out.println("Вторият играч е преместен с " + secondPlayerMove + " хода.");

            int currentSecondRow = secondPlayer.getRow();
            int currentSecondCol = secondPlayer.getCol();

            int movesRemainedSecond = 0;

            if ((currentSecondRow == NUM_OF_ROWS - 1) && (currentSecondCol >= 0)){
                currentSecondCol -= secondPlayerMove;
                if (currentSecondCol < 0){
                    movesRemainedSecond = Math.abs(currentSecondCol);
                    currentSecondCol = 0;
                    currentSecondRow -= movesRemainedSecond;
                }
            } else if ((currentSecondRow >= 0) && (currentSecondCol == 0)){
                currentSecondRow -= secondPlayerMove;
                if (currentSecondRow < 0){
                    movesRemainedSecond = Math.abs(currentSecondRow);
                    currentSecondRow = 0;
                    currentSecondCol += movesRemainedSecond;
                }
            } else if ((currentSecondRow == 0) && (currentSecondCol >= 0)){
                currentSecondCol += secondPlayerMove;
                if (currentSecondCol >= NUM_OF_COLS){
                    movesRemainedSecond = currentSecondCol - (NUM_OF_COLS - 1);
                    currentSecondCol = NUM_OF_COLS - 1;
                    currentSecondRow += movesRemainedSecond;
                }
            } else if ((currentSecondRow >= 0) && (currentSecondCol == NUM_OF_COLS - 1)){
                currentSecondRow += secondPlayerMove;
                if (currentSecondRow >= NUM_OF_ROWS){
                    movesRemainedSecond = currentSecondRow - (NUM_OF_ROWS - 1);
                    currentSecondRow = NUM_OF_ROWS - 1;
                    currentSecondCol -= movesRemainedSecond;
                }
            }

            secondPlayer.setRow(currentSecondRow);
            secondPlayer.setCol(currentSecondCol);

            int rowForOutputSecond = currentSecondRow + 1;
            int colForOutputSecond = currentSecondCol + 1;

            System.out.println("Втори играч: Вие се намирате на поле с ред:" + rowForOutputSecond  + " и колона:" + colForOutputSecond);

            //намираме на кое квадратче сме се преместили след хвърлянето на зарчето
            currentField = battleField[currentSecondRow][currentSecondCol];
            player = "second";
            if (currentField instanceof Start || (secondPlayerMove == 2 && currentSecondRow == 3 && currentSecondCol == 6)){
                if (currentField instanceof Start){
                    System.out.println("Поле: СТАРТ");
                }
                secondPlayerMoney = stepOnStart(player, secondPlayerMoney);
                System.out.println("Вие разполагате с " + secondPlayerMoney + " шоколадови паричкк!");


            }
            if (currentField instanceof Traps){
                secondPlayerMoney = stepOnTrap(player, battleField, currentSecondRow, currentSecondCol, secondPlayerMoney);
                System.out.println("Вашите пари са: " + secondPlayerMoney);

            }
            if (currentField instanceof PartyHard){
                secondPlayerMoney = stepOnPartyHard(secondPlayerMoney);

            }
            if (currentField instanceof Chance){
                secondPlayerMoney = stepOnChance(player, battleField, currentSecondRow, currentSecondCol, secondPlayerMoney);

            }
            if (currentField instanceof Steal){
                secondPlayerMoney = stepOnSteal(player, battleField, currentSecondRow, currentSecondCol, secondPlayerMoney);
                System.out.println("Вие разполагате с " + secondPlayerMoney + " шоколадови парички!");

            }
            if (currentField instanceof Invest){
                secondPlayerMoney = stepOnInvest(player, secondPlayerMoney, battleField, currentSecondRow, currentSecondCol);
            }

            System.out.println();
            if (secondPlayerMoney <= 0){
                System.out.println("Втори играч: Вие останахте без пари и изгубихте играта!");
                break;
            }
            printBattleField(battleField);
        }
    }

       private static void printBattleField(Figures[][] battleField){
        for (int row = 0; row < NUM_OF_ROWS; row++) {
            for (int col = 0; col < NUM_OF_COLS; col++) {
                if (battleField[row][col] == null){
                    System.out.print("X" + "   ");
                } else {
                    System.out.print(battleField[row][col].getSign() + "   ");
                }
            }
            System.out.println();
        }
    }

    private static void deactivateTrap(Figures[][] battleField, int currentFirstRow, int currentFirstCol){
        ((Traps) battleField[currentFirstRow][currentFirstCol]).setTrapActive(false);
        ((Traps) battleField[currentFirstRow][currentFirstCol]).setPutByFirstPlayer(false);
        ((Traps) battleField[currentFirstRow][currentFirstCol]).setName("normal");
    }

    private static int getTaxAuditTrap(String player, int playerMoney){
        System.out.println("Данъчна ревизия! Губите част от парите си!");
        if (player.equals("first")){
            for (int i = 0; i <= numOfTaxesForEachRoundFirstPlayer; i++) {
                playerMoney -= (0.10 * playerMoney);
            }
            numOfTaxesForEachRoundFirstPlayer = 0;
        } else {
            for (int i = 0; i <= numOfTaxesForEachRoundSecondPlayer; i++) {
                playerMoney -= (0.10 * playerMoney);
            }
            numOfTaxesForEachRoundSecondPlayer = 0;
        }

        if (playerMoney < 0){
            playerMoney = 0;
        }
        return playerMoney;
    }

    private static void getWhatTrapIsPut(String player, Figures[][] battleField, int currentFirstRow, int currentFirstCol){
        System.out.println("Ще трябва да изпълните текущия капан!");
        String currentTrapName = battleField[currentFirstRow][currentFirstCol].getName();
        switch (currentTrapName){
            case "taxAudit":
                System.out.println("В края на цикъла ще изгубите 10% от приходите си!");
                if (player.equals("first")){
                    numOfTaxesForEachRoundFirstPlayer++;
                } else {
                    numOfTaxesForEachRoundSecondPlayer++;
                }
                break;
            case "divorce":
                System.out.println("В края на цикъла ще се завърти 10-стенен зар и ако се падне 2 или 8 няма да " +
                        "получите нито печалба, нито загуба от цикъла!");
                if (player.equals("first")){
                    firstPlayerDivorce = true;
                } else {
                    secondPlayerDivorce = true;
                }
                break;
            case "propaganda":
                System.out.println("Не можете да поставяте повече капани в текущия цикъл!");
                if (player.equals("first")){
                    isFirstPlayerAbleToPutTrap = false;
                } else {
                    isSecondPlayerAbleToPutTrap = false;
                }
                break;
            case "seeing":
                System.out.println("При попадане на квадратче Steal няма да имате право да изпълните злия си план!");
                if (player.equals("first")){
                    canFirstPlayerSteal = false;
                } else {
                    canSecondPlayerSteal = false;
                }
                break;
            case "gamblingBoss":
                System.out.println("При следащото квадратче ШАНС ще имате право само на негативни последици!");
                if (player.equals("first")){
                    canFirstPlayerChanceBeGood = false;
                } else {
                    canSecondPlayerChanceBeGood = false;
                }
                break;
        }
        deactivateTrap(battleField, currentFirstRow, currentFirstCol);
    }

    private static void printTrapChoices(){
        System.out.println("Изкарахте късмет, няма заложени капани!");
        System.out.println("Вариянти за залагане на капани:");
        System.out.println("1. Данъчна ревизия - 10 шоколадови парички инвестиция");
        System.out.println("2. Развод по котешки - 20 шоколадови парички инвестиция");
        System.out.println("3. Пропаганда - 100 шоколадови парички инвестиция");
        System.out.println("4. Проглеждане - 50 шоколадови парички инвестиция");
        System.out.println("5. Хазартен бос - 100 шоколадови парички инвестиция");
        System.out.println("6. Не желая да залагам капан");
    }

    private static int putTrap(String player, int playerMoney, Figures[][] battleField, int currentRow, int currentCol, String trapName, int money){
        if (playerMoney - money >= 0){
            ((Traps) battleField[currentRow][currentCol]).setTrapActive(true);
            if (player.equals("first")){
                ((Traps) battleField[currentRow][currentCol]).setPutByFirstPlayer(true);
            }

            battleField[currentRow][currentCol].setName(trapName);
            playerMoney -= money;
            System.out.println("Вие заложихте капан " + battleField[currentRow][currentCol].getName().toUpperCase() + " успешно!");
        } else {
            System.out.println("Нямате достатъчно шоколадови парички!");
        }

        return playerMoney;
    }

    private static String getChanceName(boolean isChancePositive){
        Random random = new Random();
        int randomChanceNumber = random.nextInt(100) + 1;
        System.out.println("Падна Ви се числото " + randomChanceNumber);
        String name = "";
        if (isChancePositive){
            if (randomChanceNumber <= 39){
                name =  "bigHopes";
            } else if (randomChanceNumber <= 64){
                name = "lolitta";
            } else if (randomChanceNumber <= 79){
                name = "prideAndPrejudice";
            } else if (randomChanceNumber <= 94){
                name = "flyMaster";
            } else {
                name = "hobit";
            }
        } else {
            if (randomChanceNumber <= 39){
                name = "1001Night";
            } else if (randomChanceNumber <= 64){
                name = "fairiesProm";
            } else if (randomChanceNumber <= 79){
                name = "warAndPeace";
            } else if (randomChanceNumber <= 94){
                name = "crimeAndPunishment";
            } else {
                name = "anger";
            }
        }
        return name;
    }

    private static void printInvestOptions(){
        System.out.println("Желаете ли да инвестирате в някоя от следните компании?");
        System.out.println("1. EvelCo | min: 500 | risk/reward 0.2");
        System.out.println("2. BombsAway | min: 400 | risk/reward 0.5");
        System.out.println("3. ClockWorkOrange | min: 300 | risk/reward 1.5");
        System.out.println("4. MarodersUnited | min: 200 | risk/reward 2.0");
        System.out.println("5. FatCat | min: 100 | risk/reward 2.5");
        System.out.println("6. Macrosoft | min: 50 | risk/reward 5.0");
        System.out.println("7. Не желая да инвестирам!");
    }

    private static int invest(String player, String firmName, int moneyNeeded, int playerMoney, Figures[][] battleField, int currentRow, int currenCol){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вие избрахте да инвестирате в " + firmName);
        System.out.println("Моля посочете каква сума искате да инвестирате!");
        int moneyToInvest = Integer.parseInt(scanner.nextLine());
        if (moneyToInvest < moneyNeeded){
            System.out.println("Сумата не е достатъчна.");
        } else if (playerMoney - moneyToInvest >= 0){
            System.out.println("Вие инвестирахте успешно в " + firmName);
            battleField[currentRow][currenCol].setName(firmName);
            if (player.equals("first")){
                ((Invest) battleField[currentRow][currenCol]).setPersonWhoInvests("firstPerson");
                switch (firmName){
                    case "EvelCo": firstPlayerInvestEvelCo++;  break;
                    case "bombsAway": firstPlayerInvestBombsAway++; break;
                    case "clockWorkOrange": firstPlayerInvestClockWorkOrange++; break;
                    case "marodersUnited": firstPlayerInvestMaroders++; break;
                    case "fatCat": firstPlayerInvestFatCat++; break;
                    case "macrosoft": firstPlayerInvestMacrosoft++; break;
                }
            } else {
                ((Invest) battleField[currentRow][currenCol]).setPersonWhoInvests("secondPerson");
                switch (firmName){
                    case "EvelCo": secondPlayerInvestEvelCo++;  break;
                    case "bombsAway": secondPlayerInvestBombsAway++; break;
                    case "clockWorkOrange": secondPlayerInvestClockWorkOrange++; break;
                    case "marodersUnited": secondPlayerInvestMaroders++; break;
                    case "fatCat": secondPlayerInvestFatCat++; break;
                    case "macrosoft": secondPlayerInvestMacrosoft++; break;
                }
            }

            playerMoney -= moneyToInvest;
        } else {
            System.out.println("Нямате достатъчно пари да инвестирате в тази фирма!");
        }

        return playerMoney;
    }

    private static int stepOnTrap(String player, Figures[][] battleField, int currentRow, int currentCol, int playerMoney){
        System.out.println("Поле: КАПАН");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        if (!((Traps) battleField[currentRow][currentCol]).isTrapActive()){
            boolean canPlayerPutTrap = true;
            if (player.equals("first")){
                if (!isFirstPlayerAbleToPutTrap){
                    canPlayerPutTrap = false;
                }
            } else {
                if (!isSecondPlayerAbleToPutTrap){
                    canPlayerPutTrap = false;
                }
            }
            if (!canPlayerPutTrap){
                System.out.println("Не можете да залагате капани през това обхождане на дъската!");
            } else {
                printTrapChoices();

                int putTrap = Integer.parseInt(scanner.nextLine());
                switch (putTrap){
                    case 1:
                        playerMoney = putTrap(player, playerMoney, battleField, currentRow, currentCol, "taxAudit", 10);
                        break;
                    case 2:
                        playerMoney = putTrap(player, playerMoney, battleField, currentRow, currentCol, "divorce", 20);
                        break;
                    case 3:
                        playerMoney = putTrap(player, playerMoney, battleField, currentRow, currentCol, "propaganda", 100);
                        break;
                    case 4:
                        playerMoney = putTrap(player, playerMoney, battleField, currentRow, currentCol, "seeing", 50);
                        break;
                    case 5:
                        playerMoney = putTrap(player, playerMoney, battleField, currentRow, currentCol, "gamblingBoss", 100);
                        break;
                    case 6:
                        System.out.println("Не заложихте капан!");
                        break;
                    default:
                        System.out.println("Не съществува такава опция!");
                        break;
                }
            }

        } else {
            System.out.println("Нямате късмет, има заложен капан!");
            // ако е заложен от същия играч
            boolean isPutBySamePlayer = true;
            if (player.equals("first")){
                if (!((Traps) battleField[currentRow][currentCol]).isPutByFirstPlayer()){
                    isPutBySamePlayer = false;
                }
            } else {
                if (((Traps) battleField[currentRow][currentCol]).isPutByFirstPlayer()){
                    isPutBySamePlayer = false;
                }
            }
            if (isPutBySamePlayer){
                System.out.println("Капанът е бил заложен от Вас!");
                System.out.println("Моля хвърлете 10-стенно зарче!");
                int randomNumber = random.nextInt(10) + 1;
                System.out.println("Падна ви се число " + randomNumber);
                if (randomNumber % 3 == 0){
                    System.out.println("Честито, Вие сте спасен от собствения си късмет!");
                } else {
                    getWhatTrapIsPut(player, battleField, currentRow, currentCol);
                }
            } else {
                System.out.println("Вашият опонент вече е заложил капан тук!");
                getWhatTrapIsPut(player, battleField, currentRow, currentCol);
            }
        }
        return playerMoney;
    }

    private static int stepOnPartyHard(int playerMoney){
        System.out.println("Добре дошли на най-готиното парти!");
        System.out.println("Вход: 25 шоколадови парички");
        playerMoney -= 25;
        System.out.println("Вашите парички вече са: " + playerMoney);

        return playerMoney;
    }

    private static int stepOnSteal(String player, Figures[][] battleField, int currentRow, int currentCol, int playerMoney){
        Figures currentField = battleField[currentRow][currentCol];
        Random random = new Random();

        if (player.equals("first") && getFirstPlayerMoneyWhenOnSteal){
            playerMoney += 100;
            System.out.println("Изпълнявате зъл план! Получавате 100 шоколадови парички!");
        }
        if (player.equals("second") && getSecondPlayerMoneyWhenOnSteal){
            playerMoney += 100;
            System.out.println("Изпълнявате зъл план! Получавате 100 шоколадови парички!");
        }

        if ((player.equals("first") && !canFirstPlayerSteal) || (player.equals("second") && !canSecondPlayerSteal)){
            System.out.println("За Ваше съжаление, не можете да изпълнявате зли планове, заради по-рано паднал се капан!");
        } else {
            if ((player.equals("first") && !hasFirstPlayerEvilPlan) || (player.equals("second") && !hasSecondPlayerEvilPlan)){
                    System.out.println("Вече е време и за ваш зъл план!");
                    int randomEvilPlan = random.nextInt(3);
                    if (randomEvilPlan == 0){
                        currentField.setName("conquestTheWorld");
                        if (player.equals("first")){
                            getFirstPlayerMoneyWhenOnChance = true;
                        } else {
                            getSecondPlayerMoneyWhenOnChance = true;
                        }
                    } else if (randomEvilPlan == 1){
                        currentField.setName("hostages");
                        if (player.equals("first")){
                            getFirstPlayerMoneyWhenOnInvest = true;
                        } else {
                            getSecondPlayerMoneyWhenOnInvest = true;
                        }
                    } else {
                        currentField.setName("bigBankRobbery");
                        if (player.equals("first")){
                            getFirstPlayerMoneyWhenOnSteal = true;
                        } else {
                            getSecondPlayerMoneyWhenOnSteal = true;
                        }
                    }
                    System.out.println(((Steal) currentField).getDescription());
            }
        }
        return playerMoney;
    }

    private static int stepOnStart(String player, int playerMoney){
        Random random = new Random();

        int playerPreviousMoney = playerMoney;
        if (player.equals("first") && !isFirstPlayerAbleToPutTrap){
            isFirstPlayerAbleToPutTrap = true;
            System.out.println("Вече Ви е разрешено да поставяте капани!");
        }
        if (player.equals("second") && !isSecondPlayerAbleToPutTrap){
            isSecondPlayerAbleToPutTrap = true;
            System.out.println("Вече Ви е разрешено да поставяте капани!");
        }

        if (player.equals("first") && hasFirstPlayerEvilPlan){
            hasFirstPlayerEvilPlan = false;
        }
        if (player.equals("second") && hasSecondPlayerEvilPlan){
            hasSecondPlayerEvilPlan = false;
        }

        int randomNumInvest = 0;
        if (player.equals("first")){
            while (firstPlayerInvestEvelCo > 0 || firstPlayerInvestMacrosoft > 0 || firstPlayerInvestFatCat > 0
                    || firstPlayerInvestMaroders > 0 || firstPlayerInvestClockWorkOrange > 0 || firstPlayerInvestBombsAway > 0) {
                if (firstPlayerInvestEvelCo > 0){
                    randomNumInvest = random.nextInt(106) - 5;
                    if (randomNumInvest > 0){
                        playerMoney += 0.2 * playerMoney;
                    } else {
                        playerMoney -= 0.2 * playerMoney;
                    }
                    firstPlayerInvestEvelCo--;
                }
                if (firstPlayerInvestBombsAway > 0){
                    randomNumInvest = random.nextInt(61) - 10;
                    if (randomNumInvest > 0){
                        playerMoney += 0.5 * playerMoney;
                    } else {
                        playerMoney -= 0.5 * playerMoney;
                    }
                    firstPlayerInvestBombsAway--;
                }
                if (firstPlayerInvestClockWorkOrange > 0){
                    randomNumInvest = random.nextInt(51) - 15;
                    if (randomNumInvest > 0){
                        playerMoney += 1.5 * playerMoney;
                    } else {
                        playerMoney -= 1.5 * playerMoney;
                    }
                    firstPlayerInvestClockWorkOrange--;
                }
                if (firstPlayerInvestMaroders > 0){
                    randomNumInvest = random.nextInt(69) - 18;
                    if (randomNumInvest > 0){
                        playerMoney += 2 * playerMoney;
                    } else {
                        playerMoney -= 2 * playerMoney;
                    }
                    firstPlayerInvestMaroders--;
                }
                if (firstPlayerInvestFatCat > 0){
                    randomNumInvest = random.nextInt(126) - 25;
                    if (randomNumInvest > 0){
                        playerMoney += 2.5 * playerMoney;
                    } else {
                        playerMoney -= 2.5 * playerMoney;
                    }
                    firstPlayerInvestFatCat--;
                }
                if (firstPlayerInvestMacrosoft > 0){
                    randomNumInvest = random.nextInt(31) - 20;
                    if (randomNumInvest > 0){
                        playerMoney += 5 * playerMoney;
                    } else {
                        playerMoney -= 5 * playerMoney;
                    }
                    firstPlayerInvestMacrosoft--;
                }
            }
        } else {
            while (secondPlayerInvestEvelCo > 0 || secondPlayerInvestMacrosoft > 0 || secondPlayerInvestFatCat > 0
                    || secondPlayerInvestMaroders > 0 || secondPlayerInvestClockWorkOrange > 0 || secondPlayerInvestBombsAway > 0) {
                if (secondPlayerInvestEvelCo > 0){
                    randomNumInvest = random.nextInt(106) - 5;
                    if (randomNumInvest > 0){
                        playerMoney += 0.2 * playerMoney;
                    } else {
                        playerMoney -= 0.2 * playerMoney;
                    }
                    secondPlayerInvestEvelCo--;
                }
                if (secondPlayerInvestBombsAway > 0){
                    randomNumInvest = random.nextInt(61) - 10;
                    if (randomNumInvest > 0){
                        playerMoney += 0.5 * playerMoney;
                    } else {
                        playerMoney -= 0.5 * playerMoney;
                    }
                    secondPlayerInvestBombsAway--;
                }
                if (secondPlayerInvestClockWorkOrange > 0){
                    randomNumInvest = random.nextInt(51) - 15;
                    if (randomNumInvest > 0){
                        playerMoney += 1.5 * playerMoney;
                    } else {
                        playerMoney -= 1.5 * playerMoney;
                    }
                    secondPlayerInvestClockWorkOrange--;
                }
                if (secondPlayerInvestMaroders > 0){
                    randomNumInvest = random.nextInt(69) - 18;
                    if (randomNumInvest > 0){
                        playerMoney += 2 * playerMoney;
                    } else {
                        playerMoney -= 2 * playerMoney;
                    }
                    secondPlayerInvestMaroders--;
                }
                if (secondPlayerInvestFatCat > 0){
                    randomNumInvest = random.nextInt(126) - 25;
                    if (randomNumInvest > 0){
                        playerMoney += 2.5 * playerMoney;
                    } else {
                        playerMoney -= 2.5 * playerMoney;
                    }
                    secondPlayerInvestFatCat--;
                }
                if (secondPlayerInvestMacrosoft > 0){
                    randomNumInvest = random.nextInt(31) - 20;
                    if (randomNumInvest > 0){
                        playerMoney += 5 * playerMoney;
                    } else {
                        playerMoney -= 5 * playerMoney;
                    }
                    secondPlayerInvestMacrosoft--;
                }
            }
        }
        System.out.println("Заради заложените инвестиции Вие разполагате с: " + playerMoney);

        if ((player.equals("first") && firstPlayerDivorce) || (player.equals("second") && secondPlayerDivorce)){
            System.out.println("За ваше съжаление са Ви поискали развод!");
            System.out.println("Хвърляне на зарче, за да се изчислят финансите Ви!");
            int randomNumberDivorce = random.nextInt(10) + 1;
            System.out.println("Вашето число е " + randomNumberDivorce);
            if (randomNumberDivorce == 2 || randomNumberDivorce == 8){
                System.out.println("Не получавате и не Ви таксуват никакви пари!");
                playerMoney = playerPreviousMoney;
                System.out.println("Вашите пари остават " + playerMoney + " шоколадови паричи!");
            } else {
                if ((player.equals("first") && numOfTaxesForEachRoundFirstPlayer > 0) || (player.equals("second") && numOfTaxesForEachRoundSecondPlayer > 0)){
                    playerMoney = getTaxAuditTrap(player, playerMoney);
                }
                System.out.println("Честито! Обиколихте цялата игрова дъска! Получавате 1000 шоколадови парички!");
                playerMoney += 1000;
            }

        } else {
            System.out.println("Честито! Обиколихте цялата игрова дъска! Получавате 1000 шоколадови парички!");
            playerMoney += 1000;
        }

        return playerMoney;
    }

    private static int stepOnInvest(String player, int playerMoney, Figures[][] battleField, int currentRow, int currentCol){
        Scanner scanner = new Scanner(System.in);

        if ((player.equals("first") && getFirstPlayerMoneyWhenOnInvest) || player.equals("second") && getSecondPlayerMoneyWhenOnInvest){
            playerMoney += 100;
            System.out.println("Получавате 100 парички благодарение на злия Ви план!");
        }
        printInvestOptions();

        int investment = Integer.parseInt(scanner.nextLine());
        int investmenCounter = 0;
        while (investment != 7){
            switch (investment){
                case 1:
                    playerMoney = invest(player, "EvelCo", 500, playerMoney, battleField, currentRow, currentCol);
                    break;
                case 2:
                    playerMoney = invest(player, "bombsAway", 400, playerMoney, battleField, currentRow, currentCol);
                    break;
                case 3:
                    playerMoney = invest(player, "clockWorkOrange", 300, playerMoney, battleField, currentRow, currentCol);
                    break;
                case 4:
                    playerMoney = invest(player, "marodersUnited", 200, playerMoney, battleField, currentRow, currentCol);
                    break;
                case 5:
                    playerMoney = invest(player, "fatCat", 100, playerMoney, battleField, currentRow, currentCol);
                    break;
                case 6:
                    playerMoney = invest(player, "macrosoft", 50, playerMoney, battleField, currentRow, currentCol);
                    break;
            }
            System.out.println("Вие разполагате с " + playerMoney + " шоколадови парички.");
            investmenCounter++;
            if (investmenCounter == 3){
                System.out.println("Нямате право на повече от 3 залагания!");
                break;
            } else {
                printInvestOptions();
            }

            investment = Integer.parseInt(scanner.nextLine());
        }

        return playerMoney;
    }

    private static int stepOnChance(String player, Figures[][] battleField, int currentRow, int currentCol, int playerMoney){
        Random random = new Random();
        Figures currentField = battleField[currentRow][currentCol];

        int randomChanceNumber = random.nextInt(100) + 1;
        int moneyPunishmentOrWin = 0;
        String chanceName = "";
        System.out.println("Попаднахте на поле ШАНС!");
        if ((player.equals("first") && getFirstPlayerMoneyWhenOnChance) || player.equals("second") && getSecondPlayerMoneyWhenOnChance){
            playerMoney += 100;
            System.out.println("Изпълнявате зъл план! Получавате 100 шоколадови парички!");
        }


        if ((player.equals("first") && !canFirstPlayerChanceBeGood) || player.equals("second") && !canSecondPlayerChanceBeGood){
            System.out.println("За съжаление нямате право на положителна карта ШАНС (заради изтеглен вече капан)!");
            System.out.println("Хвърлете 100-стенен зар, за да се определи картата ШАНС!");
            chanceName = getChanceName(false);
            currentField.setName(chanceName);
            System.out.println(((Chance) currentField).getDescription());
            moneyPunishmentOrWin = ((Chance) currentField).getMoney();
            System.out.println("Вашите парички се променят с: " + moneyPunishmentOrWin);
            playerMoney += moneyPunishmentOrWin;
            System.out.println("Вашие парички вече са: " + playerMoney);
        } else {
            System.out.println("Хвърлете 10-стенен зар, за да се определи вида на вашата ШАНС карта!");
            int chanceCard = random.nextInt(10) + 1;
            if (chanceCard % 2 == 0){
                System.out.println("Изкарахте късмет! Вашето число е: " + chanceCard + "\nПада ви се положителна карта!");
                System.out.println("Хвърлете 100-стенен зар, за да се определи картата ШАНС!");
                chanceName = getChanceName(true);
                currentField.setName(chanceName);
            } else {
                System.out.println("Нямате късмет! Вашето число е: " + chanceCard);
                System.out.println("Пада ви се негативна карта!");
                System.out.println("Хвърлете 100-стенен зар, за да се определи картата ШАНС!");
                chanceName = getChanceName(false);
                ((Chance) currentField).setName(chanceName);
            }
            System.out.println("Ващата ШАНС карта е: " + chanceName);
            System.out.println(((Chance) currentField).getDescription());
            moneyPunishmentOrWin = ((Chance) currentField).getMoney();
            System.out.println("Вашите парички се променят с: " + moneyPunishmentOrWin);
            playerMoney += moneyPunishmentOrWin;
            System.out.println("Вашие парички вече са: " + playerMoney);
        }

        return playerMoney;
    }
}
