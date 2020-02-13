package com.mukesh.weatherapp.repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mukesh.weatherapp.datamodel.Weather;
import com.mukesh.weatherapp.restapi.ApiClient;
import com.mukesh.weatherapp.restapi.ApiInterface;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Repository {

    private static Repository instance;
    private static MutableLiveData<Weather> weatherData;

    private static MutableLiveData<String> failedMsg;
    private static ApiInterface apiInterface;

    public static synchronized Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
            failedMsg = new MutableLiveData<>();
            weatherData = new MutableLiveData<>();
            apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);
        }
        return instance;
    }

    public LiveData<String> getErrorMessageListener() {
        return failedMsg;
    }

    public LiveData<Weather> getWeatherDetails() {
        return weatherData;
    }

    private static final String TAG = "Repository";
    public void loadCurrentWeatherMap(double latitude, double longitude) {

        Log.d(TAG, "loadCurrentWeatherMap: ");
        Map<String, Object> data = new HashMap<>();
        data.put("app_id", "a8511d7d");
        data.put("app_key", ApiClient.API_KEY_NEW);

        String latlong = latitude + "," + longitude;
        Call<Weather> call = apiInterface.getRequestWithMapQuery(latlong, data);

        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(@NonNull Call<Weather> call, @NonNull Response<Weather> response) {

                Log.d(TAG, "onResponse: "+response.isSuccessful()+" "+response.code());
                if (!response.isSuccessful()) {
                    failedMsg.postValue(response.message());
                    return;
                }
                if (response.body() == null) {

                    failedMsg.postValue("Data not found");
                    return;
                }
                weatherData.postValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<Weather> call, @NonNull Throwable t) {
                failedMsg.postValue(t.getMessage());

                t.printStackTrace();
                Log.d(TAG, "onFailure: ");
            }
        });

    }
}
