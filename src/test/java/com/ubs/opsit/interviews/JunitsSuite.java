package com.ubs.opsit.interviews;

import org.junit.runner.JUnitCore;

public class JunitsSuite {

    public static void main (String[] args) {

        JUnitCore.runClasses(
                SecondsTimeConverterTest.class,
                HoursTopRowTimeConverterTest.class,
                HoursBottomRowTimeConverterTest.class,
                MinutesTopRowTimeCoverterTest.class,
                MinutesBottomRowTimeConverter.class,
                TimeInvalidInputsTest.class,
                TimeConverterTest.class
        );

    }

}
