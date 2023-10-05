public class EjemploAutomovil {
    public static void main(String[] args) {
        Motor m1 = new Motor("Electrico", "12324", 1.6);
        Automovil a1 = new Automovil("xyz", "BMW", "Negro", 12345, m1);

        System.out.println(a1);
        a1.acelerar();
        System.out.println(a1);

    }
}
