package Inheritance.Ex.animals;

public class Cat extends Animal{
    public Cat(String name, int age, String gender) throws IllegalAccessException {
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
        return "Meow meow";
    }
}
