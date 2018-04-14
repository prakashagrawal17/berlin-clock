package com.ubs.opsit.interviews;

import java.sql.Time;

public class MinutesTopRowTimeCoverter implements TimeConverter{
    @Override
    public String convertTime(String aTime) {

        int minutes = Integer.parseInt(aTime);

        int divideByFive = minutes/5;

        final String YELLOW_LAMP = "Y";

        StringBuffer minutesLight = new StringBuffer("OOOOOOOOOOO");

        for (int i=0; i<divideByFive; i++) {

            minutesLight.replace(i, i+1, YELLOW_LAMP);

        }

        replaceRedLampForQuarters(minutesLight, minutes);

        return minutesLight.toString();
    }

    // red lamps to be shown for quarters of hour
    private void replaceRedLampForQuarters(StringBuffer minutesLight, int minutes) {

        if (minutes > 14 && minutes < 30) {

            minutesLight.replace(2, 3, "R");

        }

        if (minutes >= 30 && minutes < 45) {

            minutesLight.replace(2, 3, "R");
            minutesLight.replace(5, 6, "R");

        }

        if (minutes >= 45 && minutes < 60) {

            minutesLight.replace(2, 3, "R");
            minutesLight.replace(5, 6, "R");
            minutesLight.replace(8, 9, "R");
        }



    }


}
