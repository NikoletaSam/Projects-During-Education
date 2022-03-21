import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Locale;

public class ChangeCasing {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        List<Town> towns =  entityManager.createQuery("FROM Town t", Town.class).getResultList();

        for (Town town : towns){
            String townName = town.getName();
            if (townName.length() >= 5){
                town.setName(townName.toUpperCase(Locale.ROOT));
                entityManager.persist(town);
            }
        }

        entityManager.getTransaction().commit();
    }
}
