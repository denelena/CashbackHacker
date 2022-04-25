package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldGetRemainIfLessOneBoundary() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(950);
        assertEquals(50, actual);
    }

    @Test
    public void shouldGetRemainIfMoreOneBoundary() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(1350);
        assertEquals(650, actual);
    }

    @Test
    public void shouldGetRemainIfAtExactBoundary() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(2000);
        assertEquals(0, actual);
    }

    @Test
    public void shouldGetRemainIfCrossManyBoundaries() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(25550);
        assertEquals(450, actual);
    }

}