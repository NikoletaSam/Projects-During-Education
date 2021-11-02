package WorkingWithAbstraction.Ex.TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrafficLight[] currentTrafficLight = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(TrafficLight::valueOf).toArray(TrafficLight[]::new);

        int numOfRepetition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfRepetition; i++) {
            for (int j = 0; j < currentTrafficLight.length; j++) {
                NextTrafficLight traffic = new NextTrafficLight(currentTrafficLight[j]);
                System.out.print(traffic.getNextLight() + " ");
                currentTrafficLight[j] = traffic.getNextLight();
            }
            System.out.println();
        }
    }
}
