public class BasicMembership extends Membership{

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {

        return bonusPointBalance + newPoints;
    }

    @Override
    public String getMembershipName() {
        return "Basic";
    }

}
