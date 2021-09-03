package NestedLoop.lab;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String movieType = "";
        boolean flag = false;
        double totalTickets = 0;
        double counter = 0;
        int kidsTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;

        while (!movie.equals("Finish")){
            int freeSeats = Integer.parseInt(scanner.nextLine());
            for (int seatsLeft = freeSeats; seatsLeft >= 0; seatsLeft--){
                movieType = scanner.nextLine();
                if (movieType.equals("End")){
                    break;
                }
                if (movieType.equals("student")){
                    studentTickets++;
                } else if (movieType.equals("standard")){
                    standardTickets++;
                } else if (movieType.equals("kid")){
                    kidsTickets++;
                } else if (movieType.equals("Finish")){
                    flag = true;
                    break;
                }
                counter++;
            }
            totalTickets += counter;
            double percentageLeftFree = (counter / freeSeats) * 100;
            System.out.printf("%s - %.2f", movie, percentageLeftFree);
            System.out.println("% full.");
            if (flag){
                break;
            }
            counter = 0;
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        double percentStudentTickets = (studentTickets / totalTickets) * 100;
        System.out.printf("%.2f", percentStudentTickets);
        System.out.println("% student tickets.");
        double percentStandardTickets = (standardTickets / totalTickets) * 100;
        System.out.printf("%.2f", percentStandardTickets);
        System.out.println("% standard tickets.");
        double percentKidsTickets = (kidsTickets / totalTickets) * 100;
        System.out.printf("%.2f", percentKidsTickets);
        System.out.println("% kids tickets.");
    }
}
