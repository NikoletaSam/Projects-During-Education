package Inheritance.Ex.animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) throws IllegalAccessException {
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
        return "Woof!";
    }
}
