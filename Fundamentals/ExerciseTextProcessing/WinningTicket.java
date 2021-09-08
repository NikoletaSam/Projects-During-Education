package ExerciseTextProcessing;

import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tickets = input.split(", ");

        for (String currentTicket : tickets){
            currentTicket = currentTicket.trim();
            boolean validTicket = isTicketValid(currentTicket);
            if (!validTicket){
                System.out.println("invalid ticket");
            } else {
                StringBuilder result = new StringBuilder();
                StringBuilder secondResult = new StringBuilder();

                result = getFirstHalfResult(currentTicket);
                secondResult = getSecondHalfResult(currentTicket);

                if (result.length() == 0 || secondResult.length() == 0){
                    System.out.printf("ticket \"%s\" - no match%n", currentTicket);
                } else {
                    if ((result.length() == 10) && (secondResult.length() == 10)){
                        System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", currentTicket, result.length(), result.charAt(0));
                    } else {
                        System.out.printf("ticket \"%s\" - %d%c%n", currentTicket, Math.min(result.length(), secondResult.length()), result.charAt(0));
                    }
                }
            }
        }
    }

    private static StringBuilder getSecondHalfResult(String currentTicket) {
        StringBuilder secondResult = new StringBuilder();
        int counterSymbols = 1;
        int beginIndex = 0;
        for (int i = ((currentTicket.length()) / 2) + 1; i < currentTicket.length(); i++) {
            char current = currentTicket.charAt(i);
            boolean isSymbolValid = isCurrentSymbolValid(current);
            if (current == currentTicket.charAt(i - 1) && isSymbolValid){
                counterSymbols++;
                if (counterSymbols == 6){
                    for (int j = beginIndex; j < beginIndex + counterSymbols; j++) {
                        secondResult.append(currentTicket.charAt(j));
                    }
                } else if (counterSymbols > 6){
                    secondResult.append(current);
                }
            } else {
                counterSymbols = 1;
                beginIndex = i;
            }
        }
        return secondResult;
    }

    private static StringBuilder getFirstHalfResult(String currentTicket) {
        StringBuilder result = new StringBuilder();
        int counterSymbols = 1;
        int beginIndex = 0;
        for (int i = 1; i < (currentTicket.length()) / 2; i++) {
            char current = currentTicket.charAt(i);
            boolean isSymbolValid = isCurrentSymbolValid(current);
            if (current == currentTicket.charAt(i - 1) && isSymbolValid){
                counterSymbols++;
                if (counterSymbols == 6){
                    for (int j = beginIndex; j < beginIndex + counterSymbols; j++) {
                        result.append(currentTicket.charAt(j));
                    }
                } else if (counterSymbols > 6){
                    result.append(current);
                }
            } else {
                counterSymbols = 1;
                beginIndex = i;
            }
        }
        return result;
    }

    private static boolean isCurrentSymbolValid(char currentSymbol) {
        return currentSymbol == '@' || currentSymbol == '#' || currentSymbol == '$' || currentSymbol == '^';
    }

    private static boolean isTicketValid(String ticket) {
        return ticket.length() == 20;
    }
}
