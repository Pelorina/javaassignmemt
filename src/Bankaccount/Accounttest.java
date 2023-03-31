package Bankaccount;

import java.util.Scanner;

public class Accounttest {

    public static void main(String[] args) {
        Scanner open = new Scanner(System.in);
        Account myaccount = new Account("joy amuda",  5000,  123456789);
        String name = myaccount.getName();
        System.out.println("your account name is" + myaccount.getName());
        double accountbal = myaccount.getAccountbal();
        System.out.println("your account balance is " + myaccount.getAccountbal());
        int accountno = myaccount.getAccountno();
        System.out.println("your account number is" + myaccount.getAccountno());
        if (accountbal % 2 < 100) {
            System.out.println("insufficient balance");
        } else {
            System.out.println("sufficient balance");
        }
    }
}
