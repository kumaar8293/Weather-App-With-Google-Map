package com.mukesh.weatherapp.view.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mukesh.weatherapp.datamodel.Weather;
import com.mukesh.weatherapp.repository.Repository;

public class HomeViewModel extends ViewModel {
    private Repository repository;
    private LiveData<Weather> weatherData;
    private LiveData<String> errorMessage;

    LiveData<Weather> getCurrentWeather() {
        if (weatherData == null) {
            repository = Repository.getInstance();
            weatherData = repository.getWeatherDetails();
            errorMessage = repository.getErrorMessageListener();
        }
        return weatherData;
    }

    LiveData<String> getErrorMessageListener() {
        return errorMessage;
    }

    void searchWeather(double latitude, double longitude) {
        if (repository==null){
            repository = Repository.getInstance();
        }
        repository.loadCurrentWeatherMap(latitude, longitude);
    }
}
