package barracksWars.core;

import barracksWars.core.commands.Command;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class Engine implements Runnable {
	private final String PATH_NAME = "barracksWars.core.commands.";

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | ExecutionControl.NotImplementedException | ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		/*
		String result;
		switch (commandName) {
			case "add":
				AddCommand addCommand = new AddCommand(data, repository, unitFactory);
				result =  addCommand.execute();
				break;
			case "report":
				ReportCommand reportCommand = new ReportCommand(data, repository, unitFactory);
				result = reportCommand.execute();
				break;
			case "fight":
				FightCommand fightCommand = new FightCommand(data, repository, unitFactory);
				result = fightCommand.execute();
				break;
			default:
				throw new RuntimeException("Invalid command!");
		}
		return result;
		 */
		String className = commandName.substring(0, 1).toUpperCase() + commandName.substring(1);
		Class clazz = Class.forName(PATH_NAME + className);
		Constructor constructor = clazz.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
		constructor.setAccessible(true);
		Command myClass = (Command) constructor.newInstance(data, this.repository, this.unitFactory);

		return myClass.execute();
	}
}
