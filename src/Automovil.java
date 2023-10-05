public class Automovil {
    private String patente;
    private String marca;
    private String color;
    private double precio;
    private Motor motor;
    private static double desc;

    public Automovil() {
    }

    public Automovil(String patente, String marca, String color, double precio, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
        Automovil.desc = 10;
    }

    public double precioProm() {
        return this.precio - (this.precio * Automovil.desc / 100);
    }

    public static void anularDesc() {
        Automovil.desc = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void acelerar() {
        this.motor.acelerar();
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", motor=" + motor +
                '}';
    }
}