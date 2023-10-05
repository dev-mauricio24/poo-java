package org.practice.terminalpagos;

public class Main {
    public static void main(String[] args) {
        Postnet ps = new Postnet();
        Customer cs = new Customer("1234", "mao", "arrieta", "23243433", "mao@correo.com");
        CreditCard cc = new CreditCard("123456", "Av villas", 15000, FinanceEntity.VISA, cs);

        System.out.println("Antes del pago");
        System.out.println(cc);

        System.out.println("Ticket trás pago...");
        Ticket ticket = ps.pagar(cc, 20000, 5);
        System.out.println(ticket);

        System.out.println("Tarjeta después de pagar");
        System.out.println(cc);
    }
}
