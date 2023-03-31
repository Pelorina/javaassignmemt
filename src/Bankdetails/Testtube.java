package Bankdetails;

import java.util.Scanner;

public class Testtube {
    public int deposit;
  public int withdrawal;
   public int balance;
    public static  void main(String[]  args) {
        Scanner UBA = new Scanner(System.in);
        System.out.println("enter your account balance");
        int balance = UBA.nextInt();
        System.out.println("enter amount");
        int deposit = UBA.nextInt();
        System.out.println("enter amount");
        int withdrawal = UBA.nextInt();
        System.out.println("your account total is" + (deposit + balance + withdrawal));
        int total = UBA.nextInt();








    }
}
