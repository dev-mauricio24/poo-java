package org.practice.terminalpagos;

public class Ticket {
    private String fullName;
    private double total;
    private double totalCuota;

    @Override
    public String toString() {
        return "Ticket{" +
                "fullName='" + fullName + '\'' +
                ", total=" + total +
                ", totalCuota=" + totalCuota +
                '}';
    }

    public Ticket(String fullName, double total, double totalCuota) {
        this.fullName = fullName;
        this.total = total;
        this.totalCuota = totalCuota;
    }
}
