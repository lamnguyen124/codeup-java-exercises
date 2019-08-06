package grades;
import java.util.HashMap;
public class GradesApplication {
    public static void main(String[] args) {
//        HashMap <String, Student> students = new HashMap<>();
        Student ally = new Student("Ally");

        ally.addGrade(100);
        ally.addGrade(95);
        System.out.println(ally.getGradeAverage());
    }

}