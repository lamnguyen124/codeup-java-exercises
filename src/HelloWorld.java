public class HelloWorld {
    public static void main(String[] args) {
            String hello = "Hello World";
            System.out.println(hello);

            int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString ="Ahhhh!";
        System.out.println(myString);

        double myNumber = 123;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";
        int y = 4;
        y += 5;

        int a = 3;
        int b = 4;
        b *= a;
//        b = b * a;

        int c = 10;
        int d = 2;
//        c = c / d;
        c /= d;
//        d = d - c;
        d -= c;

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max+= 10;
        System.out.println(max);

        byte little = (byte)max;
        System.out.println(little);
        }
    }