package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Field[] fields = RichSoilLand.class.getDeclaredFields();

		String command = scanner.nextLine();

		while (!command.equals("HARVEST")){

			if (command.equals("all")){
				Arrays.stream(fields)
						.forEach(Main::printField);

			} else {
				String finalCommand = command;
				Arrays.stream(fields)
						.filter(f -> Modifier.toString(f.getModifiers()).equals(finalCommand))
						.forEach(Main::printField);

			}

			command = scanner.nextLine();
		}
	}

	private static void printField(Field fieldToPrint){
		System.out.printf("%s %s %s%n", Modifier.toString(fieldToPrint.getModifiers()), fieldToPrint.getType().getSimpleName(), fieldToPrint.getName());
	}
}
