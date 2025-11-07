

public class ResidentialSite extends Site {
    public ResidentialSite(int units, double rate) { super(units, rate); }


    @Override
    protected double getTax(double base) {
        double tax  = base * Site.TAX_RATE * 0.2;
        return tax;
    }
    @Override
    protected double getBase() {
        double base = units * rate * 0.5;
        return base;
    }
}

