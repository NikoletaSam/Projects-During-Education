package Inheritance.Ex.animals;

public class Tomcat extends Cat{
    private final static String TOMCAT_GENDER = "Male";

    public Tomcat(String name, int age) throws IllegalAccessException {
        super(name, age, TOMCAT_GENDER);
    }

    @Override
    public String produceSound(){
        return "MEOW";
    }
}
