public class SilverMembership extends Membership{

    private final float POINTS_SCALING_FACTOR = 1.2f;

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        return bonusPointBalance + Math.round(newPoints*POINTS_SCALING_FACTOR);
    }

    @Override
    public String getMembershipName() {
        return "Silver";
    }

}
