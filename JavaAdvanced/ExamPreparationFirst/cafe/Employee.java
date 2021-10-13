package ExamPreparationFirst.cafe;

public class Employee {
    private String name;
    private int age;
    private String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + ", " + this.age + " from " + this.country;
    }
}
