package ExamPreparationFirst.cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.employees = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void addEmployee(Employee employee){
        if (this.employees.size() < capacity){
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name){
        Employee toRemove = null;
        boolean flag = false;
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                toRemove = employee;
                flag = true;
            }
        }
        if (toRemove != null){
            employees.remove(toRemove);
        }
        return flag;
    }

    public Employee getOldestEmployee(){
        return this.employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
    }

    public Employee getEmployee(String name){
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount(){
        return this.employees.size();
    }

    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append("Employees working at Cafe ").append(this.name).append(":").append(System.lineSeparator());
        this.employees.forEach(e -> builder.append(e.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
