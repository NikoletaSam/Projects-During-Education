package ExamPreparationThird.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public int getStudentCount(){
        return this.students.size();
    }

    public String registerStudent(Student student){
        if (this.students.contains(student)){
            return "Student is already in the ExamPreparationThird.university";
        } else if (this.students.size() >= this.capacity){
            return "No seats in the ExamPreparationThird.university";
        }
        this.students.add(student);
        return "Added student " + student.getFirstName() + " " + student.getLastName();
    }

    public String dismissStudent(Student student){
        if (this.students.contains(student)){
            this.students.remove(student);
            return "Removed student " + student.getFirstName() + " " + student.getLastName();
        }
        return "Student not found";
    }

    public Student getStudent(String firstName, String lastName){
        Student toGet = null;
        for (Student student : this.students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                toGet = student;
            }
        }
        return toGet;
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        for (Student st : this.students){
            builder.append("==Student: First Name = ").append(st.getFirstName()).append(", Last Name = ")
                    .append(st.getLastName()).append(", Best Subject = ").append(st.getBestSubject())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }
}
