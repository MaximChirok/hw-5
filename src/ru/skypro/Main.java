package ru.skypro;

public class Main {

    public static void main(String[] args) {

    //Zadanie 1
        System.out.println("Zadanie 1");
        System.out.println("");
	int[] first = new int [3];
    first[0] = 1;
    first[1] = 2;
    first[2] = 3;


    double[] second = {1.57, 7.654, 9.986};

    short[] third = new short[5];
    third[0]= 100;
    third[1]= 23;
    third[2]= 12;
    third[3]= -130;
    third[4]= 1345;

    //Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println("");
        System.out.println(first[0] + ", " + first[1] + ", " + first[2]);
        System.out.println(second[0] + ", " + second[1] + ", " + second[2]);

        for (int i = 0; i < third.length; i++) {
            if(i!= third.length-1) {
                System.out.print(third[i] + ", ");
            } else {
                System.out.print(third[i]);
            }
        }
        System.out.println("");

    //Zadanie 3
        System.out.println("");
        System.out.println("Zadanie 3");
        System.out.println("");
        System.out.println(first[2] + ", " + first[1] + ", " + first[0]);
        System.out.println(second[2] + ", " + second[1] + ", " + second[0]);

        for (int a = third.length-1; a >= 0; a--) {
            if(a!=0) {
                System.out.print(third[a] + ", ");
            } else {
                System.out.print(third[a]);
            }
        }
        System.out.println("");

    //Zadanie 4
        System.out.println("");
        System.out.println("Zadanie 4");
        System.out.println("");
        for (int z = 0; z < first.length; z++) {
           if (first[z]%2!=0) {
               System.out.println(first[z]+1);
           } else {
               System.out.println(first[z]);
           }

        }

    }
}
