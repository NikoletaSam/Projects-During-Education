package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class clazz = BlackBoxInt.class;
        Constructor clazzConstructor = clazz.getDeclaredConstructor();
        clazzConstructor.setAccessible(true);
        BlackBoxInt myBox = (BlackBoxInt) clazzConstructor.newInstance();

        String command = scanner.nextLine();
        while (!command.equals("END")){
            String[] commandInfo = command.split("_");

            String methodName = commandInfo[0];
            int value = Integer.parseInt(commandInfo[1]);

            Method method = clazz.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(myBox, value);

            Field innerValue = myBox.getClass().getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.get(myBox));

            command = scanner.nextLine();
        }
    }
}
