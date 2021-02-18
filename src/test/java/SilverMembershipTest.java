import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SilverMembershipTest {

    @Test
    void registerPoints() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 25001, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(), 25001+ 10000*1.2);
    }
}