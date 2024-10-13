import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Contructor Account.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * Getter n Setter cho Balance.
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Getter n Setter cho TransactionList.
     */
    public ArrayList<Transaction> getTransactions() {
        return transitionList;
    }

    public void setTransactions(ArrayList<Transaction> transitionList) {
        this.transitionList = transitionList;
    }

    /**
     * Ham deposit nap tien vao tai khoan ,them vao TransactionList.
     */
    private void deposit(double amount) {
        // Kiem tra so tien nap vao.
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!\n");
        }
        this.balance = this.balance + amount;

        //Luu thao tac vao transactions.
        Transaction de = new Transaction("deposit", amount, this.balance);
        this.transitionList.add(de);
    }

    /**
     * Ham withdraw rut tien tu tai khoan.
     */
    private void withdraw(double amount) {

        // Kiem tra so tien rut ra.
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!\n");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!\n");
        }
        this.balance = this.balance - amount;

        //Luu thao tac vao transaction.
        Transaction wd = new Transaction("withdraw", amount, this.balance);
        this.transitionList.add(wd);
    }

    /**
     * Phuong thuc addTransaction them 1 giao dich vao danh sach giao dich.
     */
    public void addTransaction(double amount, String operation) {

        //Kiem tra operation them vao TransactionList.
        if (operation.equalsIgnoreCase(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equalsIgnoreCase(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Phuong thuc khong tham so printTransaction.
     */
    public void printTransaction() {

        //In ra man hinh cac giao dich.
        for (int i = 0; i < transitionList.size(); i++) {

            //Truy cap tung phan tu transaction
            StringBuilder sb = new StringBuilder();
            Transaction t = transitionList.get(i);
            String s;
            if (t.getOperation().equalsIgnoreCase(Transaction.DEPOSIT)) {
                s = "Nap tien ";
            } else {
                s = "Rut tien ";
            }

            //Lam tron ket qua den so thap phan thu 2 sau dau phay.
            String s1 = String.format("%.2f", t.getAmount());
            String s2 = String.format("%.2f", t.getBalance());

            // Tao string ket qua in ra man hinh giao dich.
            sb.append("Giao dich ").append(i + 1).append(": ").append(s).append("$")
                    .append(s1).append(". ").append("So du luc nay: ").append("$")
                    .append(s2).append(".");
            System.out.println(sb);
        }
    }
}
