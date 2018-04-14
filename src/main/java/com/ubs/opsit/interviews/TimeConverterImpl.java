package com.ubs.opsit.interviews;

import java.util.regex.Pattern;

public class TimeConverterImpl implements TimeConverter {


    @Override
    public String convertTime(String time) {
        // handle invalid inputs to make sure we process correct time
        handleInvalidTimeInputs(time);

        StringBuilder berlinTime = new StringBuilder();

        // Derive the Seconds part for Berlin Clock
        SecondsTimeConverter st = new SecondsTimeConverter();
        berlinTime.append(st.convertTime(time.substring(6, 8)));
        berlinTime.append("\n");

        // Derive the Hours Top Row part for Berlin Clock
        HoursTopRowTimeConverter ht = new HoursTopRowTimeConverter();
        berlinTime.append(ht.convertTime(time.substring(0, 2)));
        berlinTime.append("\n");

        // Derive the Hours Bottom Row part for Berlin Clock
        HoursBottomRowTimeConverter hb = new HoursBottomRowTimeConverter();
        berlinTime.append(hb.convertTime(time.substring(0, 2)));
        berlinTime.append("\n");

        // Derive the Minutes Top Row part for Berlin Clock
        MinutesTopRowTimeCoverter mt = new MinutesTopRowTimeCoverter();
        berlinTime.append(mt.convertTime(time.substring(3, 5)));
        berlinTime.append("\n");

        // Derive the Minutes Bottom Row part for Berlin Clock
        MinutesBottomRowTimeConverter mb = new MinutesBottomRowTimeConverter();
        berlinTime.append(mb.convertTime(time.substring(3, 5)));

        return berlinTime.toString();
    }

    private void handleInvalidTimeInputs(String time) {

        if (time == null) {
            throw new IllegalArgumentException("Format of time should be HH:MM:SS");
        }

        if(time.length() != 8){
            throw new IllegalArgumentException("Format of time should be HH:MM:SS");
        }

        for (int i=0; i<time.length(); i++) {

            if (i == 2 || i ==5) {
                if (time.charAt(i) != ':') {
                    throw new IllegalArgumentException("Third and Sixth characters of time should be :");
                }
            } else {

                if (!Pattern.matches("[0-9]", String.valueOf(time.charAt(i)))) {
                    throw new IllegalArgumentException("Input Time should have only numeric values");
                }
            }
        }

    }
}
