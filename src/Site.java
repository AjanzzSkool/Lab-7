

public abstract class Site {
    protected final int units;
    protected final double rate;
    public static final double TAX_RATE = 0.20;

    protected Site(int units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    // Template Method
    public final double getBillableAmount() {
        return getBase() + getTax(getBase());
    }

    protected abstract double getBase();
    protected abstract double getTax(double base);
}


