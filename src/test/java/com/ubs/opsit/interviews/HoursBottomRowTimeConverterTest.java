package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoursBottomRowTimeConverterTest {

    @Test
    public void whenHoursInputGivenThenGlowHoursBottomRow() {

        HoursBottomRowTimeConverter hb = new HoursBottomRowTimeConverter();

        String hrsLight = hb.convertTime("13");

        assertEquals("RRRO", hrsLight);

    }
}
