public class TestTransaction {
    public static void main(String[] args){

        CurrentAccount Evan = new CurrentAccount(11111111, 10000, "Evan Higgins");
        SavingsAccount Alana = new SavingsAccount(22222222, 100000, "Alana Sullivan");

        Alana.deposit(10000);
        Evan.withdraw(9999);

        Evan.toString();
        Alana.toString();


    }
}
