package ru.tetology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void shouldGetRemainIfLessOneBoundary() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(950);
        Assert.assertEquals(actual, 50);
    }

    @Test
    public void shouldGetRemainIfMoreOneBoundary() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(1350);
        Assert.assertEquals(actual, 650);
    }

    @Test
    public void shouldGetRemainIfAtExactBoundary() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(2000);
        Assert.assertEquals(actual, 1000);
    }

    @Test
    public void shouldGetRemainIfCrossManyBoundaries() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(25550);
        Assert.assertEquals(actual, 450);
    }

}
