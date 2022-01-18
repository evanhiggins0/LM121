public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id, double balance) {
            super(id, balance);
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

