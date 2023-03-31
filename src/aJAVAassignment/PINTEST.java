package aJAVAassignment;

import java.util.Scanner;

public class PINTEST {
    public static void main(String[] args) {
      int pin=4485;
      int attempt=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your pinnumber");
        int pinnumber=input.nextInt();

        if (attempt==3 )   {
            System.out.println("sorry we have locked you  out");
        } else if (pin==pinnumber) {
            System.out.println("welcome back");

        }else {
            System.out.println("incorrect try again");
        }
    }
    }

