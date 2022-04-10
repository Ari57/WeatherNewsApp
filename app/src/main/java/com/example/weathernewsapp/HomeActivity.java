package com.example.weathernewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");


        button = (Button) findViewById(R.id.button_weather);
        button2 = (Button) findViewById(R.id.button_news);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeather();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNews();
            }
        });
    }


    public void openWeather() {
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }

    public void openNews() {
        Intent intent2 = new Intent(this, NewsActivity.class);
        startActivity(intent2);
    }
}

/*
1. Initialise button field
2. Link button field to actual button on first activity
3. Setup an onClick listener
4. Call openWeather when the button is clicked
5. Create an intent, we want to use it for 'this' component, and we want to open WeatherActivity
6. Use startActivity on the intent

Intent - "Describes" activity to startActivity, and carries any necessary data
startActivity - Starts an activity
*/