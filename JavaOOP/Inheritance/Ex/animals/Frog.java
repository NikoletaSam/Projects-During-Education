package Inheritance.Ex.animals;

public class Frog extends Animal{
    public Frog(String name, int age, String gender) throws IllegalAccessException {
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
        return "Ribbit";
    }
}
