import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GoldMembershipTest {

    @Test
    void registerPointsLevel1() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 75001, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(), 75001+ 10000*1.3);
    }

    @Test
    void registerPointsLevel2() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 90001, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(), 90001+ 10000*1.5);
    }
}