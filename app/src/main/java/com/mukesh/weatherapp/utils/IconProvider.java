package com.mukesh.weatherapp.utils;

import com.mukesh.weatherapp.R;

public class IconProvider {

    public static int getImageIcon(String weatherDescription) {

        if (weatherDescription.contains("Rain") || weatherDescription.contains("rain")) {
            weatherDescription = "Rain";
        } else if (weatherDescription.contains("Storm") || weatherDescription.contains("storm")) {
            weatherDescription = "Storm";
        }
        int weatherIcon;
        switch (weatherDescription) {
            case "Clear skies":
                weatherIcon = R.drawable.mclear;
                break;
            case "Partly cloudy skies":
            case "Clouds":
                weatherIcon = R.drawable.mclouds;
                break;
            case "Rain":
                weatherIcon = R.drawable.mrain;
                break;
            case "Storm":
                weatherIcon = R.drawable.mstorm;
                break;
            case "Sunny skies":
            default:
                weatherIcon = R.drawable.msun;
        }
        return weatherIcon;

    }

}
