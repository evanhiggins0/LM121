import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {

    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private ArrayList<Transaction> transactions;

    public BankAccount(int id, double balance){
        this(id, balance, "");
    }
    public BankAccount(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.transactions = new ArrayList<>();
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
    public LocalDateTime getDateCreated(){
        return this.dateCreated;
    }
    public static double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public void withdraw(double amount){
        this.setBalance(this.getBalance() - amount);
        this.transactions.add(new Transaction('W', amount, getBalance(), ("Withdrawal of €" + amount)));
    }
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
        this.transactions.add(new Transaction('D', amount, getBalance(), ("Deposit of €" + amount)));
    }

    public String toString() {
        System.out.print("ID = " + id +
                "\nBalance = " + balance +
                "\nAnnual Interest Rate = " + annualInterestRate +
                "\nDate Created = " + dateCreated + "\n");
        for (Transaction tr : this.transactions) {
            System.out.print(tr.toString());
        }
        return "";
    }

}
