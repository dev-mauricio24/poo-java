public class Ticket {
    private static int counter;
    private int consecutivo;
    private String fecha;
    private String cliente;

    public Ticket(String fecha, String cliente) {
        counter ++;
        this.consecutivo = counter;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "consecutivo=" + consecutivo +
                ", fecha='" + fecha + '\'' +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
