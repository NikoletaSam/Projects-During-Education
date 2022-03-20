import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.QueryProducer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("school");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Student student = new Student("Paola", "University", 28);
        em.persist(student);
        em.getTransaction().commit();

        em.close();
    }
}
