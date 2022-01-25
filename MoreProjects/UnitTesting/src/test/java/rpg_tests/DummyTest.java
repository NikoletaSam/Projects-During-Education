package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Dummy;

public class DummyTest {
    private static final int ATTACK_POINTS = 10;
    private static final int DUMMY_HEALTH_POINTS = 10;
    private static final int DUMMY_EXPERIENCE_POINTS = 10;

    private Dummy testDummy;

    @Before
    public void initializeTestObjects(){
        this.testDummy = new Dummy(DUMMY_HEALTH_POINTS, DUMMY_EXPERIENCE_POINTS);
    }

    @Test
    public void testDummyLosesPointsAfterAttacked(){
        testDummy.takeAttack(ATTACK_POINTS);

        Assert.assertEquals(DUMMY_HEALTH_POINTS - ATTACK_POINTS, testDummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowsExceptionOfAttacked(){
        testDummy.takeAttack(ATTACK_POINTS);
        testDummy.takeAttack(ATTACK_POINTS);
        testDummy.takeAttack(ATTACK_POINTS);
    }

    @Test
    public void testDeadDummyCanGiveExperience(){
        testDummy.takeAttack(ATTACK_POINTS);
        Assert.assertEquals(DUMMY_EXPERIENCE_POINTS, testDummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyCannotGiveExperience(){
        Assert.assertEquals(DUMMY_EXPERIENCE_POINTS, testDummy.giveExperience());
    }
}
