package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPeopleInEachWagon = 4;
        int numOfPeopleWaiting = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < wagons.size(); i++) {
            int currentWagon = wagons.get(i);
            while ((currentWagon < maxPeopleInEachWagon) && numOfPeopleWaiting > 0){
                currentWagon++;
                wagons.set(i, currentWagon);
                numOfPeopleWaiting--;
            }
            if(numOfPeopleWaiting <= 0){
                break;
            }
        }

        if((wagons.get(wagons.size() - 1) < maxPeopleInEachWagon) && numOfPeopleWaiting == 0){
            System.out.println("The lift has empty spots!");
            for (Integer wagon : wagons){
                System.out.print(wagon + " ");
            }
        } else if((numOfPeopleWaiting > 0) && (wagons.get(wagons.size() - 1) == maxPeopleInEachWagon)){
            System.out.printf("There isn't enough space! %d people in a queue!%n", numOfPeopleWaiting);
            for (Integer wagon : wagons){
                System.out.print(wagon + " ");
            }
        } else if ((wagons.get(wagons.size() - 1) == maxPeopleInEachWagon) && numOfPeopleWaiting == 0){
            for (Integer wagon : wagons){
                System.out.print(wagon + " ");
            }
        }
    }
}
