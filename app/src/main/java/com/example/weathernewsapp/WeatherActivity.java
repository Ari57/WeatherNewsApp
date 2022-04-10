package com.example.weathernewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeatherActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        setTitle("Weather");

        button = (Button) findViewById(R.id.button_weather_news);
        button2 = (Button) findViewById(R.id.button_weather_home);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewsActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });
    }

    public void openNewsActivity() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    public void openHomeActivity() {
        Intent intent2 = new Intent(this, HomeActivity.class);
        startActivity(intent2);
    }
}