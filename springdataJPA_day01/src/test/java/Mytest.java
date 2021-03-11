import com.domain.Account;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mytest {
    @Test
    public void test(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("theJpa");
        EntityManager em = factory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Account account = new Account();
        account.setUsername("600");
        account.setBalance(501.0);
        em.persist(account);
        et.commit();
        em.close();
        factory.close();
    }
}
