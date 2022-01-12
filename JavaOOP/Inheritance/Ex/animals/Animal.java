package Inheritance.Ex.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) throws IllegalAccessException {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) throws IllegalAccessException {
        name = name.trim();
        if (name.length() == 0){
            throw new IllegalAccessException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) throws IllegalAccessException {
        if (age < 0){
            throw new IllegalAccessException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) throws IllegalAccessException {
        if (gender.trim().isEmpty()){
            throw new IllegalAccessException("Invalid input!");
        }
        this.gender = gender;
    }

    public String produceSound(){
        return "Sound";
    }

    @Override
    public String toString() {
        return String.format("%s%n" +
                            "%s %d %s%n"
                            + "%s", this.getClass().getSimpleName(), this.name, this.age, this.gender, this.produceSound());
    }
}
