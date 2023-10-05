public class Motor {
    private String tipo;
    private String num;
    private double cilindraje;
    private int rpm;

    public Motor(String tipo, String num, double cilindraje) {
        this.tipo = tipo;
        this.num = num;
        this.cilindraje = cilindraje;
    }

    public void acelerar() {
        this.rpm += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", num='" + num + '\'' +
                ", cilindraje=" + cilindraje +
                ", rpm=" + rpm +
                '}';
    }
}
