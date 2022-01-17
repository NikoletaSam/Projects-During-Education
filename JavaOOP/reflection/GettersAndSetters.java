package reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GettersAndSetters {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;

        Method[] allMethods = reflectionClass.getDeclaredMethods();

        List<Method> getters = Arrays.stream(allMethods)
                .filter(m -> m.getName().startsWith("get"))
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toList());

        List<Method> setters = Arrays.stream(allMethods)
                .filter(m -> m.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toList());

        printGetters(getters);

        printSetters(setters);

    }

    public static void printGetters(List<Method> getters){
        getters.forEach(g -> System.out.printf("%s will return class %s%n", g.getName(), g.getReturnType().getName()));
    }

    public static void printSetters(List<Method> setters){
        setters.forEach(s -> System.out.printf("%s and will set field of class %s%n", s.getName(), s.getParameterTypes()[0].getName()));
    }
}
