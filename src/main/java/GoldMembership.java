public class GoldMembership extends Membership{

    private final float POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
    private final float POINTS_SCALING_FACTOR_LEVEL_2 = 1.5f;

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        if(bonusPointBalance >= 90000) return bonusPointBalance + Math.round(newPoints*POINTS_SCALING_FACTOR_LEVEL_2);
        return bonusPointBalance + Math.round(newPoints*POINTS_SCALING_FACTOR_LEVEL_1);
    }

    @Override
    public String getMembershipName() {
        return "Gold";
    }

}
