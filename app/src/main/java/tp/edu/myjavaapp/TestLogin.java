package tp.edu.myjavaapp;

import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        String pass = "mypass";

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String inputPwd = sc.nextLine();

        if(inputPwd.equals(pass)){
            System.out.println("Welcome to the Jungle! ");
        }
        else {
            System.out.println("You are UNAUTHORIZED");
        }

    }
}
