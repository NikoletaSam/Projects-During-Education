import entities.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Comparator;

public class FindLatestTenProjects {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.createQuery("FROM Project p ORDER BY p.startDate DESC", Project.class)
                .setMaxResults(10)
                .getResultStream()
                .sorted(Comparator.comparing(Project::getName))
                .forEach(p -> System.out.println("Project name: " + p.getName() +
                        "\n\tProject Description: " + p.getDescription() +
                        "\n\tProject Start Date: " + p.getStartDate() +
                        "\n\tProject End Date: " + p.getEndDate()));

        entityManager.getTransaction().commit();
    }
}
