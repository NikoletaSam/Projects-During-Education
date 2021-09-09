package FundamentalsEx2;
import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numSnowBalls = Byte.parseByte(scanner.nextLine());
        int bestSnowball = Integer.MIN_VALUE;
        short snowballSnow = 0;
        short snowballTime = 0;
        byte snowballQuality = 0;
        int snowballValue = 0;
        short bestSnowballSnow = 0;
        short bestSnowballTime = 0;
        byte bestSnowballQuality = 0;
        for (byte i = 1; i <= numSnowBalls; i++) {
            snowballSnow = Short.parseShort(scanner.nextLine());
            snowballTime = Short.parseShort(scanner.nextLine());
            snowballQuality = Byte.parseByte(scanner.nextLine());
            snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > bestSnowball){
                bestSnowball = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%s : %s = %d ", bestSnowballSnow, bestSnowballTime, bestSnowball);
        System.out.println("(" + bestSnowballQuality + ")");
    }
}
