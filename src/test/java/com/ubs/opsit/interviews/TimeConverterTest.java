package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.sql.Time;

public class TimeConverterTest {

    private TimeConverter tc;

    @Before
    public void setUp() throws Exception {
        tc = new TimeConverterImpl();
    }

    @Test
    public void whenTimeInputMidNightThenShowBerlinClockTime (){

        String derivedBerlinTime = tc.convertTime("00:00:00");

        String expected = "Y" + "\n" + "OOOO" + "\n" + "OOOO" + "\n" + "OOOOOOOOOOO" + "\n" + "OOOO";

        Assert.assertEquals(expected, derivedBerlinTime);

    }

    @Test
    public void whenTimeInputAfternoonThenShowBerlinClockTime (){

        String derivedBerlinTime = tc.convertTime("13:17:01");

        System.out.print(derivedBerlinTime);

        String expected = "O" + "\n" + "RROO" + "\n" + "RRRO" + "\n" + "YYROOOOOOOO" + "\n" + "YYOO";

        Assert.assertEquals(expected, derivedBerlinTime);

    }

    @Test
    public void whenTimeInputLateNightThenShowBerlinClockTime (){

        String derivedBerlinTime = tc.convertTime("23:59:59");

        System.out.print(derivedBerlinTime);

        String expected = "O" + "\n" + "RRRR" + "\n" + "RRRO" + "\n" + "YYRYYRYYRYY" + "\n" + "YYYY";

        Assert.assertEquals(expected, derivedBerlinTime);

    }

    @Test
    public void whenTimeInputEndOfDayThenShowBerlinClockTime (){

        String derivedBerlinTime = tc.convertTime("24:00:00");

        System.out.print(derivedBerlinTime);

        String expected = "Y" + "\n" + "RRRR" + "\n" + "RRRR" + "\n" + "OOOOOOOOOOO" + "\n" + "OOOO";

        Assert.assertEquals(expected, derivedBerlinTime);

    }
}