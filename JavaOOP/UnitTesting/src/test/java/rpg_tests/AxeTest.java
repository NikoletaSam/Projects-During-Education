package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {
    private static final int AXE_DURABILITY_POINTS = 2;
    private static final int AXE_ATTACK_POINTS = 10;

    private static final int DUMMY_HEALTH_POINTS = 20;
    private static final int DUMMY_EXPERIENCE_POINTS = 10;
    private Axe testAxe;
    private Dummy testDummy;

    @Before
    public void initializeTestObjects(){
        this.testAxe = new Axe(AXE_ATTACK_POINTS, AXE_DURABILITY_POINTS);
        this.testDummy = new Dummy(DUMMY_HEALTH_POINTS, DUMMY_EXPERIENCE_POINTS);
    }

    @Test
    public void weaponAttacksLoosesDurability(){
        testAxe.attack(testDummy);
        Assert.assertEquals(AXE_DURABILITY_POINTS-1, testAxe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testCanBrokenWeaponAttack(){
        testAxe.attack(testDummy);
        testAxe.attack(testDummy);
        testAxe.attack(testDummy);
    }

}
