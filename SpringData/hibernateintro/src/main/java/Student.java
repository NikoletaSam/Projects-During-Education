import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "schoolName", length = 100)
    private String schoolName;

    @Column(name = "age")
    private int age;

    public Student(String name, String schoolName, int age) {
        this.name = name;
        this.schoolName = schoolName;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }
}
