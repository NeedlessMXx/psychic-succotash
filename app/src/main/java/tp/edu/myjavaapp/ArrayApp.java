package tp.edu.myjavaapp;

public class ArrayApp {
    public static void main(String[] args) {
        String [] namesArr = new String [5];

        namesArr[0] = "Mary";
        namesArr[1] = "Siti";
        namesArr[2] = "Paul";
        namesArr[3] = "Peter";
        namesArr[4] = "John";

        for (int i = 0; i < namesArr.length ; i++){
            System.out.println("Name: " + namesArr[i]);
        }
        System.out.println("");
        System.out.println("Array List of names: ");
        System.out.println("=============================");

        String [] listofNames = {"Leo", "Mary", "Sam", "John"};

        for (int i = 0; i < listofNames.length ; i++){
            System.out.println("Name: " + listofNames[i]);
        }
        System.out.println("");
        System.out.println("Array List of names: ");
        System.out.println("=============================");

        int [] ageArr = {4,10,50,43,55};

        for (int i = 0;i<ageArr.length;i++){
            System.out.println("Age: " + ageArr[i]);
        }

    }
}
