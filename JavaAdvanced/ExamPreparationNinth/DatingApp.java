package ExamPreparationNinth;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> males = new ArrayDeque<>();
        String[] firstInput = scanner.nextLine().split("\\s+");
        for (String current : firstInput){
            int num = Integer.parseInt(current);
            if (num > 0){
                males.push(num);
            }
        }

        ArrayDeque<Integer> females = new ArrayDeque<>();
        String[] secondInput = scanner.nextLine().split("\\s+");
        for (String current : secondInput){
            int num = Integer.parseInt(current);
            if (num > 0){
                females.offer(num);
            }
        }

        int counterMatches = 0;

        while (males.size() > 0 && females.size() > 0){
            int currentFemale = females.peek();
            int currentMale = males.peek();

            if (currentFemale <= 0){
                females.poll();
            } else if (currentMale <= 0){
                males.pop();
            } else {
                if (currentFemale % 25 == 0){
                    if (females.size() > 1){
                        females.poll();
                        females.poll();
                    }
                } else if (currentMale % 25 == 0){
                    if (males.size() > 1){
                        males.pop();
                        males.pop();
                    }
                } else
                if (currentFemale == currentMale){
                    counterMatches++;
                    males.pop();
                    females.poll();
                } else {
                    females.poll();
                    males.pop();
                    males.push(currentMale - 2);
                }
            }
        }

        System.out.println("Matches: " + counterMatches);
        if (males.isEmpty()){
            System.out.println("Males left: none");
        } else {
            System.out.print("Males left: ");
            String output = males.toString().replace("[", "").replace("]", "");
            System.out.println(output);
        }

        if (females.isEmpty()){
            System.out.println("Females left: none");
        } else {
            System.out.print("Females left: ");
            String output = females.toString().replace("[", "").replace("]", "");
            System.out.println(output);
        }
    }
}
