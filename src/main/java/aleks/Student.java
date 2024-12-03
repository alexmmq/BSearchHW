package aleks;

public class Student implements Comparable<Student> {
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    private int age;
    private int score;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
