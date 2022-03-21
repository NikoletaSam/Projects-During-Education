import entities.Address;
import entities.Employee;
import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class RemoveTowns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townToRemove = scanner.nextLine();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        setEmployeeAdressToNull(entityManager, townToRemove);
        List<Address> addresses = deleteAddressesFromTheGivenTown(entityManager, townToRemove);
        deleteTownWithTheGivenName(entityManager, townToRemove);
        System.out.println(String.format("%d address in %s deleted", addresses.size(), townToRemove));

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }

    private static void deleteTownWithTheGivenName(EntityManager entityManager, String townForDelete) {
        Town toRemove = entityManager.createQuery("FROM Town t WHERE t.name = :townName", Town.class)
                .setParameter("townName", townForDelete)
                .getSingleResult();

        entityManager.remove(toRemove);
    }

    private static List<Address> deleteAddressesFromTheGivenTown(EntityManager entityManager, String townForDelete) {
        List<Address> addresses = entityManager.createQuery("FROM Address a WHERE a.town.name = :town", Address.class)
                .setParameter("town", townForDelete)
                .getResultList();

        for (Address address : addresses) {
            entityManager.remove(address);
        }
        return addresses;
    }

    private static void setEmployeeAdressToNull(EntityManager entityManager, String townForDelete) {
        List<Employee> employees = entityManager.createQuery("FROM Employee e WHERE e.address.town.name = :town", Employee.class)
                .setParameter("town", townForDelete)
                .getResultList();
        for (Employee employee : employees) {
            employee.setAddress(null);
        }
    }
}
