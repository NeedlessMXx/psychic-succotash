package tp.edu.myjavaapp;

import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lower limit: ");
        int lower = sc.nextInt();

        System.out.print("Enter your upper limit: ");
        int upper = sc.nextInt();

        System.out.println(" ");

        for (int i = lower;i <= upper;i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

    }
}
