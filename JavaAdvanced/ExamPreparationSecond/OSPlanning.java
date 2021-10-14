package ExamPreparationSecond;

import java.util.ArrayDeque;
import java.util.Scanner;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(",\\s+");
        for (String element : input){
            tasks.push(Integer.parseInt(element));
        }

        ArrayDeque<Integer> threads = new ArrayDeque<>();
        String[] secondInput = scanner.nextLine().split("\\s+");
        for (String element :secondInput){
            threads.offer(Integer.parseInt(element));
        }

        int taskToKill = Integer.parseInt(scanner.nextLine());
        boolean isKilled = false;

        while (!isKilled){
            int currentTask = tasks.peek();
            int currentThread = threads.peek();

            if (currentTask == taskToKill){
                isKilled = true;
                System.out.printf("Thread with value %d killed task %d%n", currentThread, currentTask);
            } else if (currentThread >= currentTask){
                tasks.pop();
                threads.poll();
            } else {
                threads.poll();
            }
        }

        for (Integer current : threads){
            System.out.print(current + " ");
        }
    }
}
