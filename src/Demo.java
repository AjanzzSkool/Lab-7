public class Demo {
    public static void main(String[] args) {
        Site res = new ResidentialSite(100, 0.30);
        Site life = new LifelineSite(100, 0.30);
        System.out.println("Residential: " + ((ResidentialSite)res).getBillableAmount());
        System.out.println("Lifeline:    " + ((LifelineSite)life).getBillableAmount());
    }
}
