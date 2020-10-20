package sqlInjection.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;


public class HQL {

    public void hqlTest1(String id) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        String hql = "UPDATE Employee set salary = 100 WHERE id = " + id;
        Query query = session.createQuery(hql);
        session.getTransaction().commit();
        session.close();
    }



    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }

        return sessionFactory;
    }
}
