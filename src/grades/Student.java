package grades;
import java.util.ArrayList;
public class Student {
    private String name;
    private int grades;


    public Student(String name, int grades) {
        this.name = name;
        this.grades = grades;

    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades = grade;
    }

    public String getGradeAverage() {
        this.grades / this.grades.size();
        return getGradeAverage;
    }


    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(85);
        grades.add(90);
        grades.add(100);
        grades.add(96);
        System.out.println(grades);
    }
}