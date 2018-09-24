package niel905g;

public class Main {

    public static void main(String[] args) {
	// Opbygger objektsystem  (Konstruktor)
        Regner k3 = new Regner(3);
        RegnerHandle ref = new RegnerHandle(k3);

        // Klient
        System.out.println(ref.f(4.0));

        // Ændrer objectsystem
        Regner k5 = new Regner(5);
        ref.setObject(k5);

        // Klient
        System.out.println(ref.f(4.0));
    }
}
