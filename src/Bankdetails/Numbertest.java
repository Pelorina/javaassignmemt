package Bankdetails;

import Bankaccount.Account;

import java.util.Scanner;

public class Numbertest {
    public static void main(String[] args) {
        Scanner access = new Scanner(System.in);
        Number account = new Number(123456789, 4000);
        System.out.println("congratulation your account number is" + account.getAccountNo());
        System.out.println("your account balance is" + account.getAccountBal());
        if (account.getAccountBal() %2 ==001)  {
            System.out.println("insufficient balance");
        } else {
            System.out.println("sufficient balance");
        }


    }
}




