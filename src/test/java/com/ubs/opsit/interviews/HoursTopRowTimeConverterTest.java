package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

public class HoursTopRowTimeConverterTest {

    // Top row hours lamp glow based on given input
    @Test
    public void whenHoursInputGivenThenGlowTopRowLights() {

        HoursTopRowTimeConverter hc = new HoursTopRowTimeConverter();

        String hourLights = hc.convertTime("13");

        Assert.assertEquals("RROO", hourLights);
    }

}
