import java.time.LocalDate;

public class BonusMember {

    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance = 0;
    private String name;
    private String emailAddress;
    private String password;

    private final int SILVER_LIMIT = 25000;
    private final int GOLD_LIMIT = 75000;

    private Membership membership;

    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPointsBalance, String name, String emailAddress, String password, Membership membership) {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPointsBalance;
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
        this.membership = membership;

        this.checkAndSetMembership();
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public Boolean checkPassword(String password){
        return password.equals(this.password);
    }

    public void registerBonusPoints(int newPoints){
        this.membership.registerPoints(this.bonusPointsBalance,newPoints);
        this.checkAndSetMembership();
    }

    public String getMembershipLevel(){
        return membership.getMembershipName();
    }

    private void checkAndSetMembership(){
        Membership membership = new BasicMembership();
        if(this.bonusPointsBalance > SILVER_LIMIT)membership = new SilverMembership();
        if(this.bonusPointsBalance > GOLD_LIMIT)membership = new GoldMembership();

        this.membership = membership;
    }

}
