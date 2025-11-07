

public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) { super(units, rate); }

    public double getBillableAmount() {
        double base = getBase();
        double tax = getTax(base);
        return base + tax;
    }

    private static double getTax(double base) {
        double tax  = base * Site.TAX_RATE;
        return tax;
    }

    private double getBase() {
        double base = units * rate;
        return base;
    }
}

