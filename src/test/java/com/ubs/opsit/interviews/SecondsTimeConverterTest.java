package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondsTimeConverterTest {

    // Yellow light on top blinks off every two seconds
    @Test
    public void whenSecondsInputProvidedThenBlinkOff() {
        SecondsTimeConverter sc = new SecondsTimeConverter();
        String secondsLight = sc.convertTime("01");
        assertEquals("O", secondsLight);
    }

    // Yellow light on top blinks on every two seconds
    @Test
    public void whenSecondsInputProvidedThenBlinkOn() {
        SecondsTimeConverter sc = new SecondsTimeConverter();
        assertEquals("Y", sc.convertTime("02"));

    }

}
