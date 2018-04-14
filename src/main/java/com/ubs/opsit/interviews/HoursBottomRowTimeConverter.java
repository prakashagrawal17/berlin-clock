package com.ubs.opsit.interviews;

public class HoursBottomRowTimeConverter implements TimeConverter{

    // Class to glow bottom row hours lights

    @Override
    public String convertTime(String aTime) {
        int hours = Integer.parseInt(aTime);

        final String RED_LAMP = "R";

        int modulusByFive = hours%5;

        StringBuffer bottomRowHours =  new StringBuffer("OOOO");

        for (int i=0; i<modulusByFive; i++) {

            bottomRowHours.replace(i, i+1, RED_LAMP);

        }

        return bottomRowHours.toString();

    }
}
