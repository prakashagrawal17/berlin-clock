package com.ubs.opsit.interviews;

import org.junit.Test;
import org.mockito.internal.matchers.Null;

public class TimeInvalidInputsTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLengthOfTimeIsMoreThenThrowRuntimeException() {

        TimeConverter tc = new TimeConverterImpl();

        tc.convertTime("00:00:000");

    }

    @Test(expected = IllegalArgumentException.class)
    public void whenLengthOfTimeIsLessThenThrowRuntimeException() {

        TimeConverter tc = new TimeConverterImpl();

        tc.convertTime("00");

    }

    @Test(expected = IllegalArgumentException.class)
    public void whenInputIsBlankThenThrowRuntimeException() {

        TimeConverter tc = new TimeConverterImpl();

        tc.convertTime("");

    }

    @Test(expected = IllegalArgumentException.class)
    public void whenInputIsNullThenThrowRuntimeException() {

        TimeConverter tc = new TimeConverterImpl();

        tc.convertTime(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void whenInputHasInvalidDelimiterThenThrowRuntimeException() {

        TimeConverter tc = new TimeConverterImpl();

        tc.convertTime("11*15%55");

    }

    @Test(expected = IllegalArgumentException.class)
    public void whenInputIsNonNumericThenThrowRuntimeException() {

        TimeConverter tc = new TimeConverterImpl();

        tc.convertTime("aa:**:11");

    }
}
