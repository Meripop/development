package com.example.weatherapi.network


import retrofit2.http.GET
import retrofit2.http.Query
import com.example.weatherapi.data.WeatherResult
import retrofit2.Call

interface WeatherAPI {
    @GET("data/2.5/weather")
    public fun getWDetail(
        @Query("q") cityName: String,
        @Query("units") units: String,
        @Query("appid") appid: String
    ): Call<WeatherResult>
}