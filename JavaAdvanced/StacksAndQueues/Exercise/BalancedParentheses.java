package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class BalancedParentheses{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openingBraces = new ArrayDeque<>();

        boolean areEqual = false;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '(' || current == '[' || current == '{'){
                openingBraces.push(current);
            } else {
                if (openingBraces.isEmpty()){
                    areEqual = false;
                    break;
                } else {
                    char lastOpeningBrace = openingBraces.pop();
                    if (current == ')' && lastOpeningBrace == '('){
                        areEqual = true;
                    } else if (lastOpeningBrace == '[' && current == ']'){
                        areEqual = true;
                    } else if (lastOpeningBrace == '{' && current == '}'){
                        areEqual = true;
                    } else {
                        areEqual = false;
                        break;
                    }
                }
            }
        }

        if (areEqual){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
