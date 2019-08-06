//package grades;
//import util.Input;
//import java.util.HashMap;
//public class GradesApplication {
//
//        HashMap <String, Student> students = new HashMap<>();
//        static Input input = new Input();
//
//        public static void main(String[] args) {
//
//        Student ally = new Student("Ally");
//        ally.addGrade(100);
//        ally.addGrade(95);
//        ally.addGrade(100);
//        ally.addGrade(95);
//        ally.addGrade(100);
//
//        Student nala = new Student( "Nala");
//        nala.addGrade(100);
//        nala.addGrade(100);
//        nala.addGrade(100);
//        nala.addGrade(100);
//        nala.addGrade(100);
//
//        Student happy = new Student( "Happy");
//        happy.addGrade(100);
//        happy.addGrade(100);
//        happy.addGrade(100);
//        happy.addGrade(100);
//        happy.addGrade(100);
//
//        Student bailey = new Student( "Bailey");
//        bailey.addGrade(100);
//        bailey.addGrade(100);
//        bailey.addGrade(100);
//        bailey.addGrade(100);
//        bailey.addGrade(100);
//
//
//
//        students.put("nala", nala);
//        students.put("ally", ally);
//        students.put("happy", happy);
//        students.put("bailey", bailey);
//
////        System.out.println(ally.getGradeAverage());
//        System.out.println("Welcome!\n");
//        showStudents();
//
//        String answer = input.getString("What student would you like to see more information on?");
//
//        if(students.containsKey(key)){
//            System.out.println("Name: "+ students.get(key).getName() +" - Github Username: " + key );
//            System.out.println("Current Average: " + students.get(key.getGradeAverage()));
//        } else {
//            System.out.println("Sorry, no student found with the GitHub username of " + key);
//        }
//    }
//
//    public static void showStudents(){
//        System.out.println("Here are the GitHub usernames of our students:");
//        for (String username : students.keySet()){
//            System.out.println(username + " | ");
//        }
//    }
//
//}

package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();

    public static void main(String[] args) {

        Student ally = new Student("ally");
       ally.addGrade(100);
       ally.addGrade(80);
       ally.addGrade(80);
       ally.addGrade(80);

        Student nala = new Student("nala");
        nala.addGrade(100);
        nala.addGrade(100);
        nala.addGrade(100);
        nala.addGrade(100);

        students.put("ally", ally);
        students.put("nala", nala);

        System.out.println("Welcome!\n");

        showStudents();

        boolean cont = true;

        do{

            String key = input.getString("What student would you like to see more information on?");

            if(students.containsKey(key)){
                System.out.println("Name: "+ students.get(key).getName() +" - GitHub Username: " + key );
                System.out.println("Current Average: " + students.get(key).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + key);
            }

            cont = input.yesNo("Would you like to see another student?");

        }while(cont);

        System.out.println("Goodbye, and have a wonderful day!\n");

    }

    public static void showStudents(){
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        System.out.println();
    }
}