package tp.edu.myjavaapp;

public class TestRectangle {
    public static double calculateArea(double length, double breadth){
        System.out.print("Calculating area of rectangle with ");
        System.out.println("length = " + length + " cm and breadth = " + breadth + " cm");

        double area = length * breadth;

        return area;
    }
    public static boolean testSquare(double length, double breadth){
        boolean result = false;

        if(length==breadth){
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        double length = 10.5;
        double breadth = 10.5;

        double areaOfRectangle = calculateArea(10.8,30.6);
        boolean isSquare = testSquare(length,breadth);

        System.out.println("Area of rectangle = " + areaOfRectangle + " cm sq");
        System.out.println("Is this a square?: " + isSquare);

    }
}
