import java.util.Scanner;

public class consoleExercises {
    public static void main(String[] args) {
        double pi = 3.141592;
        System.out.printf("The value of pi is %napproximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Please enter an integer (make sure you do it right): ");
        int input = scanner.nextInt();
        System.out.println(input);

        System.out.print("Please enter three words: ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        //nextLine() called to clear input
        scanner.nextLine();
        System.out.printf("%nPlease enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Here is your sentence: %s%n", sentence);

        System.out.printf("What is the width of the classroom?: ");
        String answer = scanner.nextLine();
        double width = Double.valueOf(answer);
//        double width = new Double(answer);
        System.out.println(width);
        System.out.printf("What is the length of the classroom?: ");
        answer = scanner.nextLine();
        double length = Double.valueOf(answer);

        System.out.printf("Area of classroom = %.2f%n", width * length);
        System.out.printf("Perimeter of classroom = %.2f%n", 2 * width + 2 * length);
        System.out.printf("Volume of classroom = %.2f%n", width * length * 10.0);

    }
}