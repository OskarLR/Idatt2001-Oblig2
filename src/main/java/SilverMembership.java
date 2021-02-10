public class SilverMembership extends Membership{

    private final float POINTS_SCALING_FACTOR = 1.2f;

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        return 0;
    }

    @Override
    public String getMembershipName() {
        return "Silver";
    }
}
