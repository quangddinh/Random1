package com.example.random1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.Random;
import java.util.Map;



public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Random rand = new Random();
//        int numrand = rand.nextInt()
        relativeLayout = findViewById(R.id.relativeLayout);
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        relativeLayout.setBackgroundColor(Color.rgb(100, 100,100));

    }
}
