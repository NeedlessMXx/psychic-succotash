package tp.edu.myjavaapp;

import java.util.Scanner;

public class Assessment4 {
    public static int calculatePrice(int Ipad, int price){
        int pricing = Ipad * price;

        return pricing;
    }
    public static void main(String[] args) {
        int Ipad = 1000;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of iPad: ");
        int price = sc.nextInt();

        int iPadamt = calculatePrice(Ipad,price);

        System.out.println("The Total Cost of the iPads is $" + iPadamt);
        System.out.println("");
    }
}
