package datenklasse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Person_RegisterDAO {
    public void insertPerson(Person person) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.flush();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
