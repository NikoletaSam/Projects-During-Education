package ExamPrreparation4;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudentsFirstPerson = Integer.parseInt(scanner.nextLine());
        int numOfStudentsSecondPerson = Integer.parseInt(scanner.nextLine());
        int numOfStudentsThirdPerson = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int totalStudentsPerHour = numOfStudentsFirstPerson + numOfStudentsSecondPerson + numOfStudentsThirdPerson;
        int timeNeeded = (int) Math.ceil( 1.0 * studentsCount / totalStudentsPerHour);
        if(timeNeeded > 3){
            int constantHours = timeNeeded;
            for (int i = 1; i < constantHours; i++) {
                if(i % 3 == 0){
                    timeNeeded++;
                }
            }
        }

        System.out.printf("Time needed: %dh.", timeNeeded);
    }
}
