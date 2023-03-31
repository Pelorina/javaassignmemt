package Emperor;

import java.util.Scanner;

public class Emperorolu {
    public static void main(String[] args) {

        Scanner oladele = new Scanner(System.in);
        System.out.println("welcome to java world");
        String name = oladele.nextLine();
        System.out.println("enter your name");
        int accountnumber = oladele.nextInt();
        System.out.println("enter your account number");
        String password = oladele.nextLine();
        if (accountnumber % 2 == 10){
            System.out.println("correct number");
        }else {
            System.out.println("incorrect number");
    }

}




    }
