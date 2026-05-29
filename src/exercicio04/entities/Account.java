package exercicio04.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // CONSTRUTORES
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    // MÉTODOS DEPOSITO E SAQUE
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    // METODOS GET E SET
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // FORMATAÇÃO
    public String toString() {
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: R$ "
                + String.format("%.2f", balance);

    }
}
