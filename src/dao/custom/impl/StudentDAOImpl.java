package dao.custom.impl;

import dao.custom.StudentDAO;
import entity.Courses;
import entity.Students;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sun.security.smartcardio.SunPCSC;
import util.FactoryConfiguration;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean add(Students entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;

    }

    @Override
    public boolean update(Students entity) throws Exception {
       Session session = FactoryConfiguration.getInstance().getSession();
       Transaction transaction = session.beginTransaction();

       session.update(entity);

       transaction.commit();
       return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Students students = session.get(Students.class, s);

        session.delete(students);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Students find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Students> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();



        Query query = session.createQuery("from Students");
        List<Students> list = query.list();

        transaction.commit();

        session.close();
        return list;

    }
}
