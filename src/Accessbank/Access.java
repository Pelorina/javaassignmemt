package Accessbank;

import java.util.Scanner;

public class Access {
    public static void main(String[] args) {
        Scanner output= new Scanner(System.in);
        Accountacess account=new Accountacess("musa oji",123456789 ,500);
        System.out.println("enter your name" );
        String name = output.nextLine();
        System.out.println("your account name is " +name  );
        System.out.println("enter your accountnumber");
        double AccountNO= output.nextDouble();
        System.out.println("your account number is " +AccountNO);
        System.out.println("enter your account balance");
        double Accountbal= output.nextDouble();
        System.out.println("your account balance" +Accountbal);

    }
}
