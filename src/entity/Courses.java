package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Courses implements SuperEntity {
    @Id
       private String id;
       private String title;
       private String Duration;
       private double Salary;



    public Courses() {
    }

    public Courses(String id, String title, String duration, double salary) {
        this.setId(id);
        this.setTitle(title);
        setDuration(duration);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", Duration='" + Duration + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
