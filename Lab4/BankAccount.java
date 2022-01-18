import java.time.LocalDate;
import java.util.ArrayList;

public class BankAccount {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private LocalDate dateCreated = LocalDate.now();

    public BankAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public static void setAnnualInterestRate(double aIR){
        annualInterestRate = aIR;
    }
    public LocalDate getDateCreated(){
        return this.dateCreated;
    }
    public static double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public void withdraw(double amount){
        this.setBalance(this.getBalance() - amount);
        System.out.println("New balance after withdrawal: " + this.getBalance());
    }
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
        System.out.println("New balance after deposit: " + this.getBalance());
    }

    @Override
    public String toString() {
        return "ID = " + id +
                "\nBalance = " + balance +
                "\nAnnual Interest Rate = " + annualInterestRate +
                "\nDate Created = " + dateCreated + "\n";
    }
}