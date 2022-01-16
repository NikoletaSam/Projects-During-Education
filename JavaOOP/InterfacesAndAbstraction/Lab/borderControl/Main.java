package InterfacesAndAbstraction.Lab.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> peopleAndRobots = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] information = command.split("\\s+");

            if (information.length == 2){
                String model = information[0];
                String id = information[1];

                Robot robot = new Robot(id, model);
                peopleAndRobots.add(robot);

            } else if (information.length == 3){
                String name = information[0];
                int age = Integer.parseInt(information[1]);
                String id = information[2];

                Citizen citizen = new Citizen(name, age, id);
                peopleAndRobots.add(citizen);
            }
            command = scanner.nextLine();
        }

        String ending = scanner.nextLine();

        peopleAndRobots
                .stream()
                .filter(e -> e.getId().endsWith(ending))
                .forEach(e -> System.out.println(e.getId()));
    }
}
