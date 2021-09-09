package FundamentalsEx2;

import java.math.BigDecimal;
import java.util.Scanner;

public class PokeMon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenPokeTargets = Integer.parseInt(scanner.nextLine());
        short exhaustionFactor = Short.parseShort(scanner.nextLine());
        short pokes = 0;
        BigDecimal exhaustionPrecise = BigDecimal.valueOf(0.5 * pokePower);

        while (pokePower >= distanceBetweenPokeTargets){
            pokePower -= distanceBetweenPokeTargets;
            pokes ++;

            if (exhaustionPrecise.compareTo(BigDecimal.valueOf(pokePower)) == 0){
                pokePower = pokePower / exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
