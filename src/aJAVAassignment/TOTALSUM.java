package aJAVAassignment;

import java.util.Scanner;

public class TOTALSUM {

    public static void main(String[] args) {
        int total=0;
        int number=1;
        int NUMBERS;

        Scanner output=new Scanner(System.in);
        while (number<=5)    {
            System.out.println("enter your numbers");
             NUMBERS=output.nextInt();
            number++;
            total=total +NUMBERS;
            System.out.println( total);
        }
    }
}
