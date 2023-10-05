package org.practice.terminalpagos;

public class CreditCard {
    private String numberCard;
    private String Bank;
    private double balance;
    private FinanceEntity financeEntity;
    private Customer customer;

    public CreditCard(String numberCard, String bank, double balance, FinanceEntity financeEntity, Customer customer) {
        this.numberCard = numberCard;
        Bank = bank;
        this.balance = balance;
        this.financeEntity = financeEntity;
        this.customer = customer;
    }

    public boolean hasBalance(double monto) {
        return this.balance >= monto;
    }

    public void descontar(double monto) {
        this.balance -= monto;
    }

    public String fullNameCustomer() {
        return customer.getFullName();
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCard='" + numberCard + '\'' +
                ", Bank='" + Bank + '\'' +
                ", balance=" + balance +
                ", financeEntity=" + financeEntity +
                ", customer=" + customer +
                '}';
    }
}
