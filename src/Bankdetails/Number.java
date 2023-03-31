package Bankdetails;

public class Number {
    private int AccountNo;
    private double AccountBal;


    public  Number(int AccountNo,double accountBal) {
        this.AccountNo = AccountNo;
        this.AccountBal = accountBal;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountBal(double accountBal) {
        AccountBal = accountBal;
    }

    public double getAccountBal() {
        return AccountBal;
    }



}
