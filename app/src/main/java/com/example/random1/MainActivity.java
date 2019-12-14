package com.example.random1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Random;
import java.util.Map;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
//    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        final EditText mEdtMin,mEdtMax;
        Button mBtnRandom;
        final TextView mTvResult;

        mEdtMin = findViewById(R.id.edtMin);
        mEdtMax = findViewById(R.id.edtMax);
        mBtnRandom = findViewById(R.id.btnRandom);
        mTvResult = findViewById(R.id.txtResult);
//
//        String value = mEdtMin.getText().toString();
//        int finalvalue = Integer.parseInt(value);
//
//        String value1 = mEdtMin.getText().toString();
//        int finalvalue1 = Integer.parseInt(value1);
//
//
//        Random rand = new Random();
//        int result = rand.nextInt(finalvalue1 - finalvalue + 1 ) + finalvalue;
//
//        mTvResult.setText(String.valueOf(result));

    mBtnRandom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String textMin = mEdtMin.getText().toString().trim();
            String textMax = mEdtMax.getText().toString().trim();
//            Log.d("BBB",textMin);
//            Log.d("BBB",textMax);

            Integer sMin = Integer.valueOf(textMin);
            Integer sMax = Integer.valueOf(textMax);

            Random random = new Random();
            int value = random.nextInt(sMax - sMin + 1) + sMin;

            mTvResult.setText(String.valueOf(value));

        }
    });

    }
}
