
public abstract class Site {
    protected final int units;
    protected final double rate;
    public static final double TAX_RATE = 0.20;

    protected Site(int units, double rate) {
        this.units = units;
        this.rate = rate;
    }
}

