import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory = null;
    static {
        Configuration cfg = new Configuration().configure();
    }
}