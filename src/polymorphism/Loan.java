package polymorphism;

public class Loan extends Bank {
    double interestRate;
    int numberOfPayment;
    double loanAmount;

    public Loan(int accountNumber,String accountName, double balance,double interestRate, int numberOfPayment,double amount){
        super(accountNumber,accountName,balance);
        this.interestRate=interestRate;
        this.numberOfPayment= numberOfPayment;
        this.loanAmount=amount;
    }
    public double calculateMonthlyPayment(){
        double monthlyPayment=this.loanAmount*this.interestRate/this.numberOfPayment;
        return monthlyPayment;
    }

    double calculateTotalPayment(){
        double total=this.loanAmount*this.interestRate;
        return total;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "interestRate=" + interestRate +
                ", numberOfPayment=" + numberOfPayment +
                ", loanAmount=" + loanAmount +
                ", accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
