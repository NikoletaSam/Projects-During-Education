import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Scanner;

public class ContainsEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        String[] fullName = scanner.nextLine().split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];

        List<Employee> employees = entityManager.createQuery("FROM Employee e WHERE e.firstName = :first AND e.lastName = :last", Employee.class)
                .setParameter("first", firstName)
                .setParameter("last", lastName)
                .getResultList();

        if (employees.size() > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        entityManager.getTransaction().commit();
    }
}
