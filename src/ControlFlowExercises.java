import java.util.Scanner;

public class ControlFlowExercises {
    static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        fizzBuzz(33);

        for (int i = 5; i <= 15; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }
        for (double i = 2; i <= 1000000l; i *= i) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric grade: ");
        int input = scanner.nextInt();
        if (input >= 88) {
            System.out.println("A");
        } else if (input >= 80) {
            System.out.println("B");
        } else if (input >= 67) {
            System.out.println("C");
        } else if (input >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        squaresCubes();

    }

    private static void squaresCubes() {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println();

            System.out.print("What number would you like to go up to? ");
            int userInput = scan.nextInt();
            System.out.println();

            System.out.println("Here is your table!");
            System.out.println();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (long i = 1; i <= userInput; i++) {
                System.out.printf("%-7d|%-9d|%-8d%n", i, i * i, i * i * i);
            }
            System.out.println();
            System.out.print("Do you want to continue (y/n)? ");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing!");
    }
}
