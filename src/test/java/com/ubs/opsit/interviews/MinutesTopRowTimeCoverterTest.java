package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

public class MinutesTopRowTimeCoverterTest {

    @Test
    public void whenMinutesInputGivenThenTopRowMinutesLampGlows(){

        MinutesTopRowTimeCoverter mt = new MinutesTopRowTimeCoverter();

        String minutesLight = mt.convertTime("10");

        Assert.assertEquals("YYOOOOOOOOO", minutesLight);
    }

    // test scenario with the first quarter

    @Test
    public void whenQuarterInputGivenThenRedLightShouldGlow() {

        MinutesTopRowTimeCoverter mt = new MinutesTopRowTimeCoverter();

        String minutesLight = mt.convertTime("17");

        Assert.assertEquals("YYROOOOOOOO", minutesLight);

    }

    // test scenario with the second quarter

    @Test
    public void whenSecondQuarterInputGivenThenRedLightShouldGlow() {

        MinutesTopRowTimeCoverter mt = new MinutesTopRowTimeCoverter();

        String minutesLight = mt.convertTime("32");

        Assert.assertEquals("YYRYYROOOOO", minutesLight);

    }

    // test scenario with the third quarter

    @Test
    public void whenThirdQuarterInputGivenThenRedLightShouldGlow() {

        MinutesTopRowTimeCoverter mt = new MinutesTopRowTimeCoverter();

        String minutesLight = mt.convertTime("59");

        Assert.assertEquals("YYRYYRYYRYY", minutesLight);

    }

}
