package tp.edu.myjavaapp;

import java.util.function.DoubleToIntFunction;

public class TestTriangle {
    public static double calcPerimeter (double length, double breadth, double height){
        System.out.print("Calculating the perimeter with ");
        System.out.println("length = " + length + " cm and breadth = " + breadth + " cm and height = " + height + " cm");

        double peri = length + breadth + height;

        return peri;
    }
    public static double calcArea(double breadth, double height){
        System.out.print("Calculating the perimeter with ");
        System.out.println("0.5 * " + breadth + "cm *" + height + "cm ");

        double area = 0.5 * breadth * height;
        //0.5*base*height
        return area;
    }
    public static boolean isEquil(double length, double height, double breadth){
        boolean result = false;

        if(length == height && length == breadth){
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        double length = 10;
        double breadth = 10;
        double height = 10;

        double PeriOTriangle = calcPerimeter(length,breadth,height);
        double areaOTriangle = calcArea(breadth, height);
        boolean isEquilateral = isEquil(length,breadth,height);

        System.out.println("Perimeter of triangle = " + PeriOTriangle + " cm");
        System.out.println("Area of triangle = " + areaOTriangle + " cm sq");
        System.out.println("Is this a Equil? " + isEquilateral);
    }
}
