public class MethodExercises {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, int b) {
//        return a * b;
        //using loop for repeated addition
//        double result = 0;
//        for (int i = 0; i < b; i++){
//            result += a;
//        }
//        return result;

        //using recursion for repeated addition
        if (b <= 0) return 0;
        return a + multiply(a, b-1);
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }
    public static void main(String[] args) {
    System.out.println(add(1,9));
    System.out.println((subtract(3,4)));
    System.out.println(multiply(6,12));
    System.out.println(divide(5,20));
    System.out.println(modulus(8,22));
    }
}


