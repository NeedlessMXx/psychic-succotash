package tp.edu.myjavaapp;

import java.util.Scanner;

public class Assesment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
try{
    System.out.println("Enter your first number: ");
    int first = sc.nextInt();

    System.out.println("Enter a different second number: ");
    int second = sc.nextInt();

    System.out.println("Enter a different third number: ");
    int third = sc.nextInt();

    if(first<second && first < third){
        System.out.println("the smallest number is: " + first);
    }
    else if(second<first && second < third){
        System.out.println("the smallest number is: " + second);
    }
    else if(third<second && third < second){
        System.out.println("the smallest number is: " + third);
    }
    else if(first == second && second == third && first==third){
        System.out.println("It's the same");
    }

}
catch (Exception e){
    System.out.println("Error");
}

    }
}
