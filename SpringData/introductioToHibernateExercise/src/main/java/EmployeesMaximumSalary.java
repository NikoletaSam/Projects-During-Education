import entities.Department;
import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesMaximumSalary {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        List<Department> departments = entityManager.createQuery("FROM Department d", Department.class).getResultList();

        for (Department department : departments){
            List<Employee> currentEmployees = department.getEmployees()
                    .stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .collect(Collectors.toList());

            Employee employeeWithHighestSalary = currentEmployees.get(0);
            BigDecimal highestDepartmentSalary = employeeWithHighestSalary.getSalary();

            if (highestDepartmentSalary.compareTo(BigDecimal.valueOf(30000)) < 0 || highestDepartmentSalary.compareTo(BigDecimal.valueOf(70000)) > 0){
                System.out.printf("%s %.2f%n", department.getName(), highestDepartmentSalary);
            }
        }

        entityManager.getTransaction().commit();
    }
}
