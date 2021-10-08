package DefiningClasses.Ex.CompanyRoster;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Department> departments = new LinkedHashMap<>();

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            departments.putIfAbsent(department, new Department(department));

            if (input.length == 4){
                Employee employee = new Employee(name, salary, position, department);
                departments.get(department).getEmployees().add(employee);
            } else if (input.length == 6){
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                Employee employee = new Employee(name, salary, position, department, email, age);
                departments.get(department).getEmployees().add(employee);
            } else {
                String next = input[4];
                try {
                    int age = Integer.parseInt(next);
                    Employee employee = new Employee(name, salary, position, department, age);
                    departments.get(department).getEmployees().add(employee);
                }catch (NumberFormatException e){
                    String email = next;
                    Employee employee = new Employee(name, salary, position,department, email);
                    departments.get(department).getEmployees().add(employee);
                }
            }
        }

        Department biggestSalary = departments
                .entrySet()
                .stream()
                .max(Comparator.comparing(d1 -> d1.getValue().getAverageSalary()))
                .get().getValue();

        System.out.println("Highest Average Salary: " + biggestSalary.getName());

        biggestSalary.getEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(e -> System.out.printf("%s %.2f %s %d%n", e.getName(), e.getSalary(), e.getEmail(), e.getAge()));
    }
}
