package niel905g;

/**
 * @Author niels on 24-Sep-18.
 */
public class Regner {
    private double k;

    public Regner(double k) {
        this.k = k;
    }

    double f(double x) {
        return k * x * x + 3;
    }
}
