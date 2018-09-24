package niel905g;

/**
 * @Author niels on 24-Sep-18.
 */
public class RegnerHandle {
    private Regner object; //Regner sættes som object

    // RegnerHandle's set object metode
    // til at bestemme hviket object den repræsenterer.
        public RegnerHandle(Regner object) {
        setObject(object);
    }
    // Metoden f:
    public double f(double x) {
    return object.f(x);
    }
    // Intialiserer RegnerHandle til at ræpresenterer Regner.
    public void setObject(Regner object) {
        this.object = object;
    }
}