package org.practice.terminalpagos;

public class Postnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;

    public Ticket pagar(CreditCard card, double abono, int cuotas) {
        Ticket tk = null;
        if(validData(card, abono, cuotas)) {
            double montoFinal = abono + abono * recargo(cuotas);

            if(card.hasBalance(montoFinal)) {
                card.descontar(montoFinal);
                String fullName = card.fullNameCustomer();
                double montoPorCuota = montoFinal / cuotas;
                tk = new Ticket(fullName, montoFinal, montoPorCuota);
            }
        }
        return tk;
    }

    private boolean validData(CreditCard card, double abono, int cant) {
        boolean isValidCard = card != null;
        boolean isValidAbono = abono > 0;
        boolean isValidCant = cant >= MIN_CANT_CUOTA && cant <= MAX_CANT_CUOTA;
        return isValidCard && isValidAbono && isValidCant;
    }

    private double recargo(int cuotas) {
        return (cuotas - 1) * RECARGO_POR_CUOTA;
    }
}
