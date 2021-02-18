import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusMemberTest {

    @Test
    void checkPasswordRight() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 10000, "Jensen, Jens", "jens@jensen.biz");
        member.setPassword("Password123");
        assertTrue(member.checkPassword("Password123"));
    }

    @Test
    void checkPasswordWrong() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 10000, "Jensen, Jens", "jens@jensen.biz");
        member.setPassword("Password123");
        assertFalse(member.checkPassword("Password1234"));
    }

    @Test
    void registerBonusPointsBasic() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 10000, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(),20000);
    }

    @Test
    void registerBonusPointsSilver() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 25001, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(),25001 + 10000*1.2);
    }

    @Test
    void registerBonusPointsGold1() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 75001, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(),75001 + 10000*1.3);
    }

    @Test
    void registerBonusPointsGold2() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 90001, "Jensen, Jens", "jens@jensen.biz");
        member.registerBonusPoints(10000);
        assertEquals(member.getBonusPointsBalance(),90001 + 10000*1.5);
    }

    @Test
    void getMembershipLevel() {
        BonusMember member = new BonusMember(2, LocalDate.now(), 75001, "Jensen, Jens", "jens@jensen.biz");
        assertEquals(member.getMembershipLevel(),"Gold");
    }
}