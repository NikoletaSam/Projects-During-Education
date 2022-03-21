import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.List;

public class IncreaseSalaries {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        List<String> departments = List.of("Engineering", "Tool Design", "Marketing", "Information Services");

        List<Employee> employees = entityManager.createQuery("FROM Employee e WHERE e.department.name IN (:departmentsList)", Employee.class)
                .setParameter("departmentsList", departments)
                .getResultList();

        for (Employee employee : employees){
            BigDecimal salary = employee.getSalary();
            BigDecimal increasedSalary = salary.multiply(BigDecimal.valueOf(1.12));

            employee.setSalary(increasedSalary);

            System.out.printf("%s %s ($%.2f)%n", employee.getFirstName(), employee.getLastName(), employee.getSalary());
        }

        entityManager.getTransaction().commit();
    }
}
