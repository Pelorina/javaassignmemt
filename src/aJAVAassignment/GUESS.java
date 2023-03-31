package aJAVAassignment;

import java.util.Scanner;

public class GUESS {
    public static void main(String[] args) {
        int pin=4485;
        int attempt=0;
        Scanner scanner=new Scanner(System.in);
        while (attempt<=3)   {
            System.out.println("enter your pinnumber");
            int pinnumber= scanner.nextInt();

            if(pinnumber==pin)   {
                System.out.println("welcome back");
                break;

            }else {
                System.out.println("incorrect try again");
                attempt++;
            }
            if (attempt==3 )   {
                System.out.println("sorry we have locked you out");
                break;
            }
        }
    }
}
