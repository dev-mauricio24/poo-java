public class CuentaBancaria {
    private String number;
    private String alias;
    private double balance;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String number, String alias, double balance) {
        this.number = number;
        this.alias = alias;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void insert(double amount) {
        if(amount > 0){
            this.balance += amount;
        }
    }

    private boolean balanceAvailable(double amount) {
        return this.balance >= amount;
    }
    public void withdraw(double amount) {
        if(balanceAvailable(amount)) {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "number='" + number + '\'' +
                ", alias='" + alias + '\'' +
                ", balance=" + balance +
                '}';
    }
}
