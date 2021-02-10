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

    public void BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPoints, String name, String emailAddress){

    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public Boolean checkPassword(String password){
        return false;
    }

    public void registerBonusPoints(int newPoints){

    }

    public String getMembershipLevel(){
        return membership.getMembershipName();
    }

    private void checkAndSetMembership(){

    }

}
