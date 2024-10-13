public class Transaction {

    /**
     * Cac thuoc tinh.
     */
    private String operation;
    private double amount;
    private double balance;

    /**
     * Hai bien hang deposit, withdraw.
     */
    public static final String DEPOSIT = "DEPOSIT";
    public static final String  WITHDRAW = "WITHDRAW";

    /**
     * Khoi tao voi 3 tham so operation,amount,balance.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Getter,Setter cho cac thuoc tinh operation,amount,balance.
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
