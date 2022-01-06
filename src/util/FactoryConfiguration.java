package util;

import entity.Students;
import entity.Courses;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private final SessionFactory sessionFactory;

    public FactoryConfiguration() {
        Configuration configuration = new Configuration();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        configuration.addAnnotatedClass(Students.class).addAnnotatedClass(Courses.class);
        sessionFactory=configuration.buildSessionFactory(serviceRegistry);
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration=factoryConfiguration==null?new FactoryConfiguration():factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}




/*public class FactoryConfiguration {


 private static FactoryConfiguration factoryConfiguration;
 private SessionFactory sessionFactory;

 private FactoryConfiguration(){
     Properties properties = new Properties();
     try {
         properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
     }catch (Exception e){

     }
     Configuration configure =  new Configuration().addAnnotatedClass(Students.class)

             .addAnnotatedClass(Courses.class)
             .addAnnotatedClass(Payment.class)
             .addAnnotatedClass(PaymentDetail.class);
     sessionFactory = configure.buildSessionFactory();
  }
  public static FactoryConfiguration getInstance(){
     return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
  }
  public Session getSession() {return sessionFactory.openSession();
  }
}*/
