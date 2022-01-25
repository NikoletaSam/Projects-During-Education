package rpg_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.Dummy;
import rpg_lab.Hero;

public class HeroTest {
    private static final int TARGET_EXPERIENCE = 10;

    private Dummy fakeTarget;
    private Hero hero;

    @Before
    public void initializeFakeTargetAndHero(){
        this.fakeTarget = Mockito.mock(Dummy.class);
        this.hero = new Hero("Hero1");
    }

    @Test
    public void testHeroGainsExperienceFromAttackWhenTargetIsDead(){
        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveExperience()).thenReturn(TARGET_EXPERIENCE);

        hero.attack(fakeTarget);
        Assert.assertEquals(TARGET_EXPERIENCE, hero.getExperience());
    }

    @Test
    public void testHeroDoesNotGainXPFromAttackWhenTargetIsAlive(){
        Mockito.when(fakeTarget.isDead()).thenReturn(false);

        Assert.assertEquals(0, hero.getExperience());
    }
}
