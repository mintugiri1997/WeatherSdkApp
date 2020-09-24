package com.mintu.weathersdkapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loc1;
    private Button loc2;
    private Button loc3;
    private Button loc4;
    private Button loc5;
    private Button loc6;
    private Button loc7;
    private Button loc8;
    private Button loc9;
    private Button loc10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Views
        init();

        //Setting click listener
        setClick();

    }

    private void init() {
        loc1 = (Button) findViewById(R.id.loc1);
        loc2 = (Button) findViewById(R.id.loc2);
        loc3 = (Button) findViewById(R.id.loc3);
        loc4 = (Button) findViewById(R.id.loc4);
        loc5 = (Button) findViewById(R.id.loc5);
        loc6 = (Button) findViewById(R.id.loc6);
        loc7 = (Button) findViewById(R.id.loc7);
        loc8 = (Button) findViewById(R.id.loc8);
        loc9 = (Button) findViewById(R.id.loc9);
        loc10 = (Button) findViewById(R.id.loc10);
    }

    private void setClick() {
        loc1.setOnClickListener(this);
        loc2.setOnClickListener(this);
        loc3.setOnClickListener(this);
        loc4.setOnClickListener(this);
        loc5.setOnClickListener(this);
        loc6.setOnClickListener(this);
        loc7.setOnClickListener(this);
        loc8.setOnClickListener(this);
        loc9.setOnClickListener(this);
        loc10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.loc1:
                Intent i1 = new Intent(this, WeatherStatusActivity.class);
                i1.putExtra("city","delhi");
                startActivity(i1);
                break;
            case R.id.loc2:
                Intent i2 = new Intent(this, WeatherStatusActivity.class);
                i2.putExtra("city","dhanbad");
                startActivity(i2);
                break;
            case R.id.loc3:
                Intent i3 = new Intent(this, WeatherStatusActivity.class);
                i3.putExtra("city","kolkata");
                startActivity(i3);
                break;
            case R.id.loc4:
                Intent i4 = new Intent(this, WeatherStatusActivity.class);
                i4.putExtra("city","gurgaon");
                startActivity(i4);
                break;
            case R.id.loc5:
                Intent i5 = new Intent(this, WeatherStatusActivity.class);
                i5.putExtra("city","kanpur");
                startActivity(i5);
                break;
            case R.id.loc6:
                Intent i6 = new Intent(this, WeatherStatusActivity.class);
                i6.putExtra("city","mumbai");
                startActivity(i6);
                break;
            case R.id.loc7:
                Intent i7 = new Intent(this, WeatherStatusActivity.class);
                i7.putExtra("city","ranchi");
                startActivity(i7);
                break;
            case R.id.loc8:
                Intent i8 = new Intent(this, WeatherStatusActivity.class);
                i8.putExtra("city","noida");
                startActivity(i8);
                break;
            case R.id.loc9:
                Intent i9 = new Intent(this, WeatherStatusActivity.class);
                i9.putExtra("city","greater noida");
                startActivity(i9);
                break;
            case R.id.loc10:
                Intent i10 = new Intent(this, WeatherStatusActivity.class);
                i10.putExtra("city","bokaro");
                startActivity(i10);
                break;
        }
    }
}
