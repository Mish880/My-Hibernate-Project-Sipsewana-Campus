package dao.custom.impl;

import dao.DAOFactory;
import dao.DAOType;
import dao.custom.CoursesDAO;
import entity.Courses;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.List;

public class CourseDAOImpl implements CoursesDAO {


    @Override
    public boolean add(Courses entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;

    }

    @Override
    public boolean update(Courses entity) throws Exception {
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

       Courses courses = session.get(Courses.class, s);
       session.delete(courses);

       transaction.commit();

       return true;

    }

    @Override
    public Courses find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Courses> findAll() throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Courses");
        List<Courses> list = query.list();

        transaction.commit();
        session.close();
        return list;

    }
}
