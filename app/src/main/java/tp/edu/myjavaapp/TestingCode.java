package tp.edu.myjavaapp;

import java.util.Scanner;

public class TestingCode {
    public static void main(String[] args) {
        System.out.println("Enter valye of N: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.printf("Please enter %d numbers n", n);
        for (int i = 0; i < n; i++){
            int  current = sc.nextInt();
            if(current > largest){
                largest=current;
            }
            if (current < smallest){
                smallest = current;
            }
        }
        System.out.println("Largest of N number is : " + largest);
        System.out.println("Smallest of N number is: " + smallest);

    }
}
