public class CurrentAccount extends BankAccount{

    private double overLimit;

    public CurrentAccount(int id, double balance) {
        super(id, balance);
        if(balance < 5000) {
            this.overLimit = 5000;
        }else{
            this.overLimit = 10000;
        }
    }

    @Override
    public void withdraw(double amount){
        if(amount > this.getBalance() + overLimit) {
            throw new IllegalArgumentException("This withdraw amount exceeds your overdraft limit. Please try again\n");
        }else{
            super.withdraw(amount);
            }
        }
    @Override
    public String toString() {
        return super.toString() + "Overdraft Limit = " + overLimit + "\n";
    }
}

