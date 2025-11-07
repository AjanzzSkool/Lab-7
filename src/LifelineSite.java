

public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) { super(units, rate); }



    protected double getTax(double base) {
        double tax  = base * Site.TAX_RATE;
        return tax;
    }

    protected double getBase() {
        double base = units * rate;
        return base;
    }
}

