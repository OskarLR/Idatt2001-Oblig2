import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BasicMembershipTest {

    @Test
    void registerPoints() {
        int startingBalence = 1500;
        BonusMember member = new BonusMember(2, LocalDate.now(), 15000, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
    }
}