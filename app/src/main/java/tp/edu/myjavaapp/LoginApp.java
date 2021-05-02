package tp.edu.myjavaapp;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        String password = "passTest";
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your password:" );
        String inputPwd = sc.nextLine();

        if(inputPwd.equals(password)){
            System.out.println("Login Successful!");
        }
        else {
            System.out.println("Login Unsuccessful");
        }


    }
}
