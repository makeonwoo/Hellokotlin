package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText heightField, weightField;
    TextView txtResult;
    Button btnBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightField = findViewById(R.id.heightField);
        weightField = findViewById(R.id.weightField);
        txtResult = findViewById(R.id.textResult);
        btnBMI = findViewById(R.id.btnBmi);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sheight = heightField.getText().toString();
                String sweight = weightField.getText().toString();
//                try {
//                    double bmi = Double.parseDouble(sweight) / Math.pow(Double.parseDouble(sheight) / 100.0,2.0);
//                    txtResult.setText("Your BMI = "+bmi);
//                } catch (Exception e){
//                    txtResult.setText("Input(s) missing");
//                }
                if(sheight.isEmpty() || sweight.isEmpty()){
                    double bmi = Double.parseDouble(sweight) / Math.pow(Double.parseDouble(sheight) / 100.0,2.0);
                    txtResult.setText("Your BMI = "+bmi);
                }
                else{
                    txtResult.setText("Input(s) missing");
                }

            }
        });
    }
}