package day27.discussion;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private String yearLevel;

    public Student(int id, String name, int age, String course, String yearLevel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

// For display purposes
    /*
        To toString() method is automaticall called when you try to print an object
        System.out.println(student)
        By overriding it, we control how the Student object will look.|

    */

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", yearLevel='" + yearLevel + '\'' +
                '}';
    }
}
