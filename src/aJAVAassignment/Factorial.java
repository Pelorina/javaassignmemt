package aJAVAassignment;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner output=new Scanner(System.in);
        System.out.println("enter your number");
        int number= output.nextInt();

        int factorial=1, result=1;
        for (int i = 2; i <=number; i++) {
            result = factorial *=i;
            System.out.println(result);

        }
//        System.out.println(result);
    }
}
