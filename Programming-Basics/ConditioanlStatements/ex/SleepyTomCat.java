package ConditioanlStatements.ex;
import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        int minutes = 0;

        int playTime = (365 - freeDays) * 63 + freeDays * 127;
        if (playTime > 30000){
            int timeMore = playTime - 30000;
            hours = timeMore / 60;
            minutes = timeMore % 60;
            System.out.println("Tom will run away");
            System.out.print(hours + " hours and " + minutes + " minutes more for play");
        } else {
            int timeLess = 30000 - playTime;
            hours = timeLess / 60;
            minutes = timeLess % 60;
            System.out.println("Tom sleeps well");
            System.out.println(hours + " hours and " + minutes + " minutes less for play");
        }
    }
}
