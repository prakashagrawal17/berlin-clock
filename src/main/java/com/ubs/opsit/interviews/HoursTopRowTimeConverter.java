package com.ubs.opsit.interviews;

public class HoursTopRowTimeConverter implements TimeConverter {


    // Class to convert top row for hours

    @Override
    public String convertTime(String aTime) {

        int hrsInput = Integer.parseInt(aTime);

        // finding how many red lamps to glow
        int divideByFive = hrsInput/5;

        final String RED_LAMP = "R";

        StringBuffer hoursLamp = new StringBuffer("OOOO");

        for (int i=0; i<divideByFive; i++) {

            hoursLamp.replace(i, i+1, RED_LAMP);

        }

        return hoursLamp.toString();

    }
}
