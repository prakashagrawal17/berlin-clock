package com.ubs.opsit.interviews;

public class SecondsTimeConverter implements TimeConverter{

    @Override
    public String convertTime(String aTime) {
        int seconds = Integer.parseInt(aTime);

        if (seconds % 2 == 0) {

            return "Y";
        }

        return "O";
    }
}
