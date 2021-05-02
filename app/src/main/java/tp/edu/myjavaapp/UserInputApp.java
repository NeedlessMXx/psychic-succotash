package tp.edu.myjavaapp;

import java.util.Scanner;

public class UserInputApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();



        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("Your height is: " + height + "m");
        System.out.println("Your age is: " + age + " years old");

        if (age < 12){
            System.out.println("You are a child");
        }
        else if (age >= 12 && age <= 18){
            System.out.println("You are a Teen!");
        }
        else if (age >= 19 && age <= 25){
            System.out.println("You are a young adult ");
        }
        else {
            System.out.println("You are an Adult!");
        }


    }
}
