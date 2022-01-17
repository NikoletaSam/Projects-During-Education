package reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;

public class ReflectionFirst {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Class<Reflection> reflectionClass = Reflection.class;
        System.out.println(reflectionClass);

        Class superClass = reflectionClass.getSuperclass();
        System.out.println(superClass);

        Class[] interfaces = reflectionClass.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        Object newInstance = reflectionClass.getDeclaredConstructor().newInstance();
        System.out.println(newInstance);
    }
}
