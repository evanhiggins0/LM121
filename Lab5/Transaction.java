import java.time.LocalDateTime;

public class Transaction {

    private LocalDateTime date = LocalDateTime.now();
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction: " +
                "\nDate: " + date +
                "\nType: " + type +
                "\nAmount: " + amount +
                "\nBalance: " + balance +
                "\nDescription: " + description + "\n";
    }
}
