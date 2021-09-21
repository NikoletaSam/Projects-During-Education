package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> pagesBack = new ArrayDeque<>();
        ArrayDeque<String> pagesNext = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")){
            if (input.equals("forward")){
                if (pagesNext.isEmpty()){
                    System.out.println("no next URLs");
                } else {
                    String lastNext = pagesNext.pop();
                    System.out.println(lastNext);
                    pagesBack.push(lastNext);
                }
            } else if (input.equals("back")){
                if (pagesBack.size() <= 1){
                    System.out.println("no previous URLs");
                } else {
                    String removed = pagesBack.pop();
                    System.out.println(pagesBack.peek());
                    pagesNext.push(removed);
                }
            } else {
                System.out.println(input);
                pagesBack.push(input);
                pagesNext.clear();
            }

            input = scanner.nextLine();
        }
    }
}
