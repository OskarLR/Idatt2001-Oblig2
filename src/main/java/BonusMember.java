import java.time.LocalDate;

public class BonusMember {

    private final int memberNumber;
    private final LocalDate enrolledDate;
    private int bonusPointsBalance = 0;
    private String name;
    private String emailAddress;
    private String password;

    private final int SILVER_LIMIT = 25000;
    private final int GOLD_LIMIT = 75000;

    private Membership membership;

    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPointsBalance, String name, String emailAddress) {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPointsBalance;
        this.name = name;
        this.emailAddress = emailAddress;
        this.checkAndSetMembership();
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public Boolean checkPassword(String password){
        return password.equals(this.password);
    }

    public void registerBonusPoints(int newPoints){
        this.bonusPointsBalance = this.membership.registerPoints(this.bonusPointsBalance,newPoints);
        this.checkAndSetMembership();
    }

    public String getMembershipLevel(){
        return membership.getMembershipName();
    }

    public int getBonusPointsBalance(){ return bonusPointsBalance;}

    public int getMemberNumber(){ return memberNumber;}

    public void setPassword(String password){
        this.password = password;
    }

    private void checkAndSetMembership(){
        Membership membership = new BasicMembership();
        if(this.bonusPointsBalance > SILVER_LIMIT)membership = new SilverMembership();
        if(this.bonusPointsBalance > GOLD_LIMIT)membership = new GoldMembership();

        this.membership = membership;
    }

    @Override
    public String toString() {
        return "BonusMember{" +
                "memberNumber=" + memberNumber +
                ", enrolledDate=" + enrolledDate +
                ", bonusPointsBalance=" + bonusPointsBalance +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", membership=" + membership +
                '}';
    }
}
