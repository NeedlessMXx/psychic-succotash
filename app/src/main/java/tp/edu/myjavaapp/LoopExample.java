package tp.edu.myjavaapp;

public class LoopExample {
    public static void main(String[] args) {
        for (int i = 8; i <= 16; i+=2){

            System.out.println(i);

        }

        System.out.println("==============");

        for (int i = 5; i >= 1; i--){

            System.out.println(i);

        }
        System.out.println("==============");

        for (int i = 1; i <= 50; i++){

            if(i % 4 == 0) {

                System.out.println(i);
            }
        }

        System.out.println("==============");

        for (/*1*/int count = 1; /*2*/count <= 3; /*4*/count++){

            /*3*/System.out.println("Happy Birthday!");

            //2,3,4 will keep looping, until 2 condition is fulfilled

        }
    }
}
