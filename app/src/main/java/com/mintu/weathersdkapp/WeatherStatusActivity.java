package com.mintu.weathersdkapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mintu.weathersdk.WeatherSdk;

public class WeatherStatusActivity extends AppCompatActivity {

    private TextView CityName;
    private TextView temp;
    private TextView mainState;
    private TextView description;
    private TextView feelsLike;
    private TextView minTemp;
    private TextView maxTemp;
    private TextView pressure;
    private TextView speed;
    private TextView humidity;
    private TextView degree;
    private String city;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_status);

        //Initializing Views
        init();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            city = bundle.getString("city");
        }

        //Using SDK
        WeatherSdk.getData(city, this);

        setText();
    }

    private void setText() {

        new Handler().postDelayed(new Runnable() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                CityName.setVisibility(View.VISIBLE);
                temp.setVisibility(View.VISIBLE);
                mainState.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                feelsLike.setVisibility(View.VISIBLE);
                minTemp.setVisibility(View.VISIBLE);
                maxTemp.setVisibility(View.VISIBLE);
                pressure.setVisibility(View.VISIBLE);
                speed.setVisibility(View.VISIBLE);
                humidity.setVisibility(View.VISIBLE);
                degree.setVisibility(View.VISIBLE);
                CityName.setText("City : " + WeatherSdk.getCityName());
                temp.setText("Temp : " + WeatherSdk.getTemp());
                mainState.setText("State : " + WeatherSdk.getMainState());
                description.setText("Description : " + WeatherSdk.getDescription());
                feelsLike.setText("Feels Like : " + WeatherSdk.getFeelsLike());
                minTemp.setText("Min. Temp : " + WeatherSdk.getTempMin());
                maxTemp.setText("Max. Temp : " + WeatherSdk.getTempMax());
                pressure.setText("Pressure : " + WeatherSdk.getPressure());
                speed.setText("Wind Speed : " + WeatherSdk.getSpeed());
                humidity.setText("Humidity : " + WeatherSdk.getHumidity());
                degree.setText("Degree : " + WeatherSdk.getDegree());
            }
        }, 3000);

    }

    private void init() {
        CityName = (TextView) findViewById(R.id.CityName);
        temp = (TextView) findViewById(R.id.temp);
        mainState = (TextView) findViewById(R.id.mainState);
        description = (TextView) findViewById(R.id.description);
        feelsLike = (TextView) findViewById(R.id.feelsLike);
        minTemp = (TextView) findViewById(R.id.minTemp);
        maxTemp = (TextView) findViewById(R.id.maxTemp);
        pressure = (TextView) findViewById(R.id.pressure);
        speed = (TextView) findViewById(R.id.speed);
        humidity = (TextView) findViewById(R.id.humidity);
        degree = (TextView) findViewById(R.id.degree);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }
}
