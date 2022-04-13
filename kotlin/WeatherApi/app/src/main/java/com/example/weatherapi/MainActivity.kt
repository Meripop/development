package com.example.weatherapi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.bumptech.glide.Glide
import com.example.weatherapi.data.WeatherResult
import com.example.weatherapi.databinding.ActivityMainBinding
import com.example.weatherapi.network.WeatherAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val weatherAPI = retrofit.create(WeatherAPI::class.java)




        binding.btnResult.setOnClickListener {
            if (binding.etCityName.text.isNotEmpty()){
                val city=binding.etCityName.text.toString()

                if(stringContainsNumber(city)){
                    binding.etCityName.error = "Not can be number"}
                else{
                    callAPI(weatherAPI)
                }
            }else {
                binding.etCityName.error = "Not can be empty"
            }

        }

    }

    private fun stringContainsNumber(
        city: String
    ): Boolean {
        val num=arrayOf("1","2","3","4","5","6","7","8","9","0")
        var containsNumber = false
        for (i in city) {
            for (n in num) {
                if (i.toString() == n) {
                    containsNumber = true

                }

            }
        }
        return containsNumber
    }

    private fun callAPI(weatherAPI: WeatherAPI) {
        val weatherCall = weatherAPI.getWDetail(
            binding.etCityName.text.toString(),
            "metric",
            "c51a6b8047bae3f13f89ae03ef5d2cb1"
        )
        weatherCall.enqueue(object : Callback<WeatherResult> {
            @SuppressLint("SetTextI18n")
            override fun onResponse(
                call: Call<WeatherResult>,
                response: Response<WeatherResult>
            ) {
                val wResult = response.body()

                if (wResult == null) {
                    binding.etCityName.error = "Not found"
                } else {
                    binding.tvResult.text =
                        """
                               Longitude: ${wResult.coord!!.lon}
                               Latitude:${wResult.coord.lat}
                               Weather: ${wResult.weather!![0].main}
                               Description: ${wResult.weather[0].description}
                               Temperature: ${wResult.main!!.temp}
                               Pressure: ${wResult.main.pressure}
                               Humidity: ${wResult.main.humidity}
                               Minimum Temperature: ${wResult.main.temp_min}
                               Maximum Temperature: ${wResult.main.temp_max}
                               """.trimIndent()
                    val iconUrl =
                        "https://openweathermap.org/img/w/${wResult.weather[0].icon}.png"

                    Glide.with(this@MainActivity).load(iconUrl).into(binding.imgWeather)

                }
            }
            override fun onFailure(call: Call<WeatherResult>, t: Throwable) {
                binding.tvResult.text = t.message
            }
        })
    }

}