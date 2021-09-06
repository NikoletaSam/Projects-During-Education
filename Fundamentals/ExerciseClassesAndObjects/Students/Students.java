package ExerciseClassesAndObjects.Students;

public class Students {
    private String firstName;
    private String lastName;
    private String grade;

    public Students (String firstName, String lastName, String grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

public String getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + ": " + this.grade;
    }

}
