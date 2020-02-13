package com.mukesh.weatherapp.restapi;


import com.mukesh.weatherapp.datamodel.Weather;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ApiInterface {

    //http://api.weatherunlocked.com/api/forecast/51.50,-0.12?app_id=a8511d7d&app_key=31635330311989114e9f25d076d28bac
    @GET("api/forecast/{id}")
    Call<Weather> getRequestWithMapQuery(@Path("id") String latLong, @QueryMap Map<String, Object> params);


}
