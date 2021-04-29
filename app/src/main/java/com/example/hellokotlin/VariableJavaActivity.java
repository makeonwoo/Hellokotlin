package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount;
    TextView txtActivityStartTime, txtCountbtnClicks;
    Button btnClickMe;
    final long startTime = System.currentTimeMillis();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountbtnClicks = findViewById(R.id.txtCountClicks);
        btnClickMe = findViewById(R.id.btnClickme);
        clickCount = 0;


        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                txtCountbtnClicks.setText("Button Clicks : "+clickCount);
            }
        });
        String sTimeStamp = new SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + sTimeStamp);
    }
}