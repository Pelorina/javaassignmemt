package Bankaccount;

public class Account {
    private double accountbal;
    private int accountno;
    private String name;

    public  Account (String name, double accountbal, int accountno )    {
        this.name=name;
        this.accountno=accountno;
        this.accountbal=accountbal;

    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public void setAccountbal(double accountbal) {
        this.accountbal = accountbal;
    }

    public double getAccountbal() {
        return accountbal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}





