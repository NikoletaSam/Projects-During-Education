package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class HighQualityMistakes {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;

        Arrays.stream(reflectionClass.getDeclaredFields())
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(field -> System.out.printf("%s must be private!%n", field.getName()));

        Arrays.stream(reflectionClass.getDeclaredMethods())
                .filter(g -> g.getName().startsWith("get") &&
                        !Modifier.isPublic(g.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(getter -> System.out.printf("%s have to be public!%n", getter.getName()));

        Arrays.stream(reflectionClass.getDeclaredMethods())
                .filter(g -> g.getName().startsWith("set") &&
                        !Modifier.isPrivate(g.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(setter -> System.out.printf("%s have to be private!%n", setter.getName()));
    }
}
