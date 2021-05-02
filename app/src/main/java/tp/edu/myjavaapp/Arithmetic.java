package tp.edu.myjavaapp;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + ( a + b ));
        System.out.println("a + b = " + ( a - b ));
        System.out.println("a + b = " + ( a * b ));
        System.out.println("a + b = " + ( a / b ));
        System.out.println("a + b = " + ( a % b ));

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        b--;
        System.out.println("b = " + b);
    }
}
