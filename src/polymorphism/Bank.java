package polymorphism;

public class Bank {
    int accountNumber;
    String accountName;
    double balance;

    public Bank(int account, String accName,double bal){
        this.accountName=accName;
        this.accountNumber = account;
        this.balance=bal;

    }
    public void addMoney(double amount){
        this.balance+=amount;
    }
    public void drawMoney(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Balance is not enough for this transaction");
        }
    }
    public void changeAccountName(String newName){
        this.accountName=newName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
