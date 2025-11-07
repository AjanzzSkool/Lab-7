

public class ResidentialSite extends Site {
    public ResidentialSite(int units, double rate) { super(units, rate); }

    public double getBillableAmount() {
        double base = getBase();
        double tax = getTax(base);
        return base + tax;
    }

    private static double getTax(double base) {
        double tax  = base * Site.TAX_RATE * 0.2;
        return tax;
    }

    private double getBase() {
        double base = units * rate * 0.5;
        return base;
    }
}

