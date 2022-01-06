package view.tm;

public class CourseTM {
   private String id;
   private String title;
   private String Duration;
   private double salary;

    public CourseTM() {
    }

    public CourseTM(String id, String title, String duration, double salary) {
        this.setId(id);
        this.setTitle(title);
        setDuration(duration);
        this.setSalary(salary);
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
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CourseTM{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", Duration='" + Duration + '\'' +
                ", salary=" + salary +
                '}';
    }
}
