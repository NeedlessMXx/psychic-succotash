package tp.edu.myjavaapp;

public class TestMark {
    public static void main(String[] args) {
        int a = 100;

        if (a < 0){
            System.out.println("Invalid Score!!");
        }
        else if (a < 50){
            System.out.println("You have failed!");
        }
        else if (a >= 50 && a <= 59){
            System.out.println("You score a 'D'");
        }
        else if (a >= 60 && a <= 69){
            System.out.println("You score a 'C'");
        }
        else if (a >= 70 && a <= 79){
            System.out.println("You score a 'B'");
        }
        else if (a >= 80 && a <= 100){
            System.out.println("You score an 'A'");
        }
        else{
            System.out.println("Invalid score");
        }





    }
}
