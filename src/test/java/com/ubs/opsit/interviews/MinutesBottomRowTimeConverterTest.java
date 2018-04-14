package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinutesBottomRowTimeConverterTest {

    @Test
    public void whenMinutesInputGivenThenGlowHoursBottomRow() {

        MinutesBottomRowTimeConverter hb = new MinutesBottomRowTimeConverter();

        String hrsLight = hb.convertTime("13");

        assertEquals("YYYO", hrsLight);

    }
}
