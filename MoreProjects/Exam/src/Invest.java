public class Invest extends Figures{
    private int minMoneyToInvest;
    private double coefficientOfGettingMoneyBack;
    private int lowerBoundRisk;
    private int upperBoundRisk;
    private String personWhoInvests;

    public Invest(String name, String sign, String personWhoInvests) {
        super(name, sign);
        this.personWhoInvests = personWhoInvests;
    }

    public String getPersonWhoInvests() {
        return this.personWhoInvests;
    }

    public void setPersonWhoInvests(String personWhoInvests) {
        this.personWhoInvests = personWhoInvests;
    }
}
