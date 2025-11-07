

public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) { super(units, rate); }

    public double getBillableAmount() {
        double base = getBase();
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }

    private double getBase() {
        double base = units * rate;
        return base;
    }
}

