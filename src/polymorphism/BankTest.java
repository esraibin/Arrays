package polymorphism;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank(111,"saving",350);
        Loan myLoan= new Loan(213213,"new Loan",4000,1.05,60,30000);
        Loan myCarLoan = new CarLoan(111,"car",3000,1.04,72,40000,2,75);
        System.out.println(myCarLoan.calculateMonthlyPayment());
    }

}
