import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        Person[] people = {new Person("Ally"), new Person("Happy"), new Person("Nala")}
        for (int i = 0; i < Person.length; i += 1) {
            System.out.println(Person[i]);
        }
    }
}
