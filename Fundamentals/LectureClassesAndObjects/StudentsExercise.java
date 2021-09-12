package LectureClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Students> students = new ArrayList<>();

        while (!input.equals("end")){
            String[] command = input.split("\\s+");
            String firstName = command[0];
            String lastName = command[1];
            int age = Integer.parseInt(command[2]);
            String hometown = command[3];
            Students student = new Students(firstName, lastName, age, hometown);
            boolean flagFirstName = false;
            boolean flagLastName = false;
            if (students.size() >= 1){
                for (Students person : students){
                    if(person.getFirstName().equals(student.getFirstName()))
                        flagFirstName = true;
                    if(person.getLastName().equals(student.getLastName())){
                        flagLastName = true;
                    }
                    if(flagFirstName && flagLastName){
                        person.setAge(student.getAge());
                        person.setHometown(student.getHometown());
                        break;
                    }
                }
                if(!flagFirstName || !flagLastName){
                    students.add(student);
                }
            } else {
                students.add(student);
            }
            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Students person : students){
            if(person.getHometown().equals(city)){
                System.out.println(person);
            }
        }
    }

    public static class Students {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Students(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
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

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " is " + age + " years old";
        }
    }

}
