package ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<Character> nonNumberSymbols = new ArrayList<>();

        //Разпределяме символите в два списъка: числа и всички останали
        for (int i = 0; i < input.length(); i++) {
            char currentDigit = input.charAt(i);
            if (currentDigit >= 48 && currentDigit <= 57){
                int currentNumber = Character.getNumericValue(currentDigit);
                numbers.add(currentNumber);
            } else {
                nonNumberSymbols.add(currentDigit);
            }
        }

        //Разпределяме числата в два отделни списъка
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int currentDigit = numbers.get(i);
            if (i % 2 == 0){
                takeList.add(currentDigit);
            } else {
                skipList.add(currentDigit);
            }
        }

        List<Character> result = new ArrayList<>();
        while (nonNumberSymbols.size() > 0 && takeList.size() > 0 && skipList.size() > 0){
            for (int i = 0; i < takeList.size(); i++) {
                int currentTakes = takeList.get(i);
                if (currentTakes > 0 && currentTakes <= nonNumberSymbols.size()){
                    for (int j = 0; j < currentTakes; j++) {
                        char currentSymbolToTake = nonNumberSymbols.get(j);
                        result.add(currentSymbolToTake);
                    }
                    for (int j = currentTakes - 1; j >= 0; j--) {
                        nonNumberSymbols.remove(j);
                    }
                } else if (currentTakes > 0 && currentTakes > nonNumberSymbols.size()){
                    currentTakes = nonNumberSymbols.size();
                    for (int j = 0; j < currentTakes; j++) {
                        char currentSymbolToTake = nonNumberSymbols.get(j);
                        result.add(currentSymbolToTake);
                    }
                    for (int j = currentTakes - 1; j >= 0; j--) {
                        nonNumberSymbols.remove(j);
                    }
                }
                if(nonNumberSymbols.size() > 0){
                    int currentSkips = skipList.get(i);
                    for (int j = currentSkips - 1; j >= 0 ; j--) {
                        nonNumberSymbols.remove(j);
                    }
                }
                takeList.remove(takeList.get(i));
                skipList.remove(skipList.get(i));
                i--;
            }
        }

        for (char symbol : result){
            System.out.print(symbol);
        }
    }
}
