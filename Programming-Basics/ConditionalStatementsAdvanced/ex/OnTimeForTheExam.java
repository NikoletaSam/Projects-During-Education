package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        if(examHour == arrivalHour && examMinute == arrivalMinute){
            System.out.println("On time");
        }
        double examHourInMinutes = examHour * 60;
        double examTotalTime = examHourInMinutes + examMinute;
        double arrivalHourInMinutes = arrivalHour * 60;
        double arrivalTotalTime = arrivalHourInMinutes + arrivalMinute;
        double onTime = examTotalTime - 30;

        if (arrivalTotalTime >= onTime && arrivalTotalTime <examTotalTime){
            double minutesBeforeTheExam = examTotalTime - arrivalTotalTime;
            System.out.println("On time");
            System.out.printf("%.0f minutes before the start", minutesBeforeTheExam);
        } else if (arrivalTotalTime > examTotalTime){
            double minutesLate = arrivalTotalTime - examTotalTime;
            if(minutesLate <= 59){
                System.out.println("Late");
                System.out.printf("%.0f minutes after the start", minutesLate);
            } else {
                double hoursLate = Math.floor(minutesLate / 60);
                double minutes = minutesLate % 60;
                if ( minutes == 0){
                    System.out.println("Late");
                    System.out.printf("%.0f:00 hours after the start", hoursLate);
                } else {
                    System.out.println("Late");
                    System.out.printf("%.0f:%.0f hours after the start", hoursLate, minutes);
                }
            }
        } else {
            double minutesEarly = examTotalTime - arrivalTotalTime;
            if (minutesEarly <= 59){
                System.out.println("Early");
                System.out.printf("%.0f minutes before the start", minutesEarly);
            } else {
                double hoursEarly = Math.floor(minutesEarly / 60);
                double totalMinutesEarly = minutesEarly % 60;
                if( totalMinutesEarly == 0){
                    System.out.println("Early");
                    System.out.printf("%.0f:00 hours before the start", hoursEarly);
                } else {
                    System.out.println("Early");
                    System.out.printf("%.0f:%.0f hours before the start", hoursEarly, totalMinutesEarly);
                }
            }
        }
    }
}