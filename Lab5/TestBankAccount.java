import java.util.ArrayList;

public class TestBankAccount{
    public static void main(String[] args){

        ArrayList<BankAccount> accounts = new ArrayList();

        accounts.add(new SavingsAccount(12345678, 12000));
        accounts.add(new CurrentAccount(98765432, 4000));
        accounts.add(new SavingsAccount(66666666, 20000));
        accounts.add(new CurrentAccount(13579012, 5000));
        accounts.add(new SavingsAccount(55555555, 3000));

        BankAccount.setAnnualInterestRate(15);

        accounts.get(0).withdraw(10000);
//      accounts.get(1).withdraw(10000);             Commented out as it will throw exception, left in for testing/proof
        accounts.get(2).deposit(10000);     // the rich get richer
        accounts.get(3).withdraw(10001);    // higher overdraft limit working
        accounts.get(4).withdraw(3000);
        accounts.get(4).deposit(1);

        System.out.println("Annual Interest Rate: " + BankAccount.getAnnualInterestRate() + "%\n" + "Monthly Interest Rate: "
                + BankAccount.getMonthlyInterestRate() + "%\n");

        for(BankAccount account : accounts)
            System.out.println(account.toString());
    }
}
