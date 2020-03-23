package polymorphism;

public class CarLoan extends Loan {
    int APR;
    int creditScore;

    public CarLoan(int accountNumber,String accountName, double balance,double interestRate, int numberOfPayment,double amount,int APR, int creditScore){
        super(accountNumber,accountName,balance,interestRate,numberOfPayment,amount);
        this.APR=APR;
        this.creditScore=creditScore;
    }
    public double calculateMontlyPayment(){
        double montly= super.loanAmount*this.APR/super.numberOfPayment-(this.creditScore/10);
        return montly;
    }
    double calculateTotalPayment(){
        double totalPayment=this.loanAmount*this.interestRate;
        return totalPayment;

    }
}
