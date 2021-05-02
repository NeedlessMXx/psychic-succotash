package tp.edu.myjavaapp;

public class LoopApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++){

            if(i % 2 == 1 ) {

                System.out.println(i);
            }
        }
        System.out.println("==============");
        for (int i = 300; i >= 3; i-=3){

            if(i % 3 == 0) {

                System.out.println(i);
            }
        }
    }
}
