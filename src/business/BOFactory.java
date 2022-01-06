package business;

import business.custom.impl.CourseBOImpl;
import business.custom.impl.StudentBOImpl;
import dao.custom.impl.CourseDAOImpl;
import dao.custom.impl.StudentDAOImpl;

public class BOFactory {
  private static BOFactory boFactory;

  private BOFactory(){}

  public static BOFactory getInstance() {return (null == boFactory) ? boFactory = new BOFactory() : boFactory;}

  public <T extends SuperBO> T getBO(BOType boType){
      switch (boType){
          case STUDENT :return  (T) new StudentBOImpl();
          case COURSES:return (T) new CourseBOImpl();
          default: return null;
      }
  }
}
