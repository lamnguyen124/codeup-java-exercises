import java.util.Scanner;
public class consoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


        Scanner scanner2 = new Scanner(System.in);

        System.out.print("What is the length and width of the classroom?: ");
        String userInput3 = scanner2.nextLine();

//        System.out.println("The area is:" +);
    }
}
