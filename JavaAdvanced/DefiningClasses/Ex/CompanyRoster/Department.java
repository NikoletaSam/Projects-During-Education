package DefiningClasses.Ex.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> department;
    private String name;

    public Department(String name){
        this.name = name;
        this.department = new ArrayList<>();
    }

    public double getAverageSalary(){
        return department.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getEmployees(){
        return this.department;
    }
}
