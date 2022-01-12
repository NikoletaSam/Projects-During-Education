package Inheritance.Ex.animals;

public class Kitten extends Cat{
    private final static String KITTEN_GENDER = "Female";

    public Kitten(String name, int age) throws IllegalAccessException {
        super(name, age, KITTEN_GENDER);
    }

    @Override
    public String produceSound(){
        return "Meow";
    }
}
