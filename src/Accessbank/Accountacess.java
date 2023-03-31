package Accessbank;

public class Accountacess {
    public String name;
    public double accountno;
    public double  accountbal;

    public Accountacess(String name, double accountno ,double accountbal) {
        this.name = name;
        this.accountno =accountno;
        this.accountbal =accountbal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountno() {
        return accountno;
    }

    public void setAccountno(double accountno) {
        this.accountno = accountno;
    }

    public void setAccountbal(double accountbal) {
        this.accountbal = accountbal;
    }

    public double getAccountbal() {
        return accountbal;
    }

}
