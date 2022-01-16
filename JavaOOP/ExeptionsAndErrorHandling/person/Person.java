package ExeptionsAndErrorHandling.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    private void setFirstName(String firstName){
        if (firstName.isBlank()){
            throw new IllegalArgumentException("First name cannot be null or empty.");
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName){
        if (lastName.isBlank()){
            throw new IllegalArgumentException("Last name cannot be null or empty.");
        }
        this.lastName = lastName;
    }

    private void setAge(int age){
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Current person " + this.firstName + " " + this.lastName + ", age " + this.age + ".";
    }
}
