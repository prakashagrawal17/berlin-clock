package com.ubs.opsit.interviews;

public class MinutesBottomRowTimeConverter implements TimeConverter {
    @Override
    public String convertTime(String aTime) {
        int minutes = Integer.parseInt(aTime);

        final String YELLOW_LAMP = "Y";

        int modulusByFive = minutes%5;

        StringBuffer bottomRowMinutes =  new StringBuffer("OOOO");

        for (int i=0; i<modulusByFive; i++) {

            bottomRowMinutes.replace(i, i+1, YELLOW_LAMP);

        }

        return bottomRowMinutes.toString();
    }
}
