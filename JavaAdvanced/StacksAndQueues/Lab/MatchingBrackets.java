package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stackBegin = new ArrayDeque<>();
        ArrayDeque<String> queueEnd = new ArrayDeque<>();

        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '('){
                beginIndex = i;
                stackBegin.push(String.valueOf(beginIndex));
            } else if (currentChar == ')'){
                endIndex = i;
                queueEnd.offer(input.substring(Integer.parseInt(stackBegin.pop()), endIndex + 1));
                endIndex = 0;
            }
        }

        for (String substring : queueEnd){
            System.out.println(substring);
        }
    }
}
