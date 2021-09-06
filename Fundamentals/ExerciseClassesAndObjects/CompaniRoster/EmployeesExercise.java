package ExerciseClassesAndObjects.CompaniRoster;

import java.util.*;

public class EmployeesExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> listOfEmployees = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String[] command = input.split("\\s+");
            String name = command[0];
            double salary = Double.parseDouble(command[1]);
            String position = command[2];
            String department = command[3];
            if(command.length <= 4){
                Employee employee = new Employee(name, salary, position, department);
                listOfEmployees.add(employee);
            } else if (command.length == 5){
                String email = command[4];
                Employee employee = new Employee(name, salary , position, department, email);
                listOfEmployees.add(employee);
            } else if (command.length == 6){
                String email = command[4];
                int age = Integer.parseInt(command[5]);
                Employee employee = new Employee(name, salary, position, department, email, age);
                listOfEmployees.add(employee);
            }
        }

        double biggestSalary = 0;
        for (int i = 0; i < listOfEmployees.size() - 1; i++) {
            biggestSalary = Math.max(listOfEmployees.get(i).getSalary(), listOfEmployees.get(i+1).getSalary());
        }

        String biggestDepartment = "";
        for (Employee person : listOfEmployees){
            if(person.getSalary() == biggestSalary){
                biggestDepartment = person.getDepartment().toString();
                System.out.println("Highest Average Salary: " + biggestDepartment);
                break;
            }
        }

        List<Employee> employeesFromBiggestDepartment = new ArrayList<>();
        for (Employee person : listOfEmployees){
            if(person.getDepartment().equals(biggestDepartment)){
                employeesFromBiggestDepartment.add(person);
            }
        }

        employeesFromBiggestDepartment.sort(Comparator.comparing(Employee::getSalary));
        Collections.reverse(employeesFromBiggestDepartment);
        for (Employee person : employeesFromBiggestDepartment){
            if (person.getEmail().equals(null)){
                person.setEmail("n/a");
            }
            System.out.println(person);
        }
    }
}
