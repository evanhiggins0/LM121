import java.util.ArrayList;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id, double balance){
        this(id, balance, "");
    }
    public SavingsAccount(int id, double balance, String name) {
        super(id, balance, name);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.getBalance()) {
            throw new IllegalArgumentException("Cannot withdraw this amount. Please try again.");
        } else {
            super.withdraw(amount);
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

