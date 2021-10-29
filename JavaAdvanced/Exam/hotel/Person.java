package Exam.hotel;

public class Person {
    private String name;
    private int id;
    private int age;
    private String hometown = "n/a";

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public String getHometown() {
        return this.hometown;
    }

    @Override
    public String toString() {
        return "Person " + this.name + ": " + this.id + ", Age: " + this.age + ", Hometown: " + this.hometown;
    }
}
