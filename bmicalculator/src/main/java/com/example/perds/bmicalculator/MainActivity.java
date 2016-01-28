package com.example.perds.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBMI(View view) {
        EditText edtHeight = (EditText) findViewById(R.id.edtHeight);
        EditText edtWeight = (EditText) findViewById(R.id.edtWeight);

        TextView txtBMI = (TextView) findViewById(R.id.txtBMI);

        double BMI = Double.valueOf(edtWeight.getText().toString()) / Math.pow(Double.valueOf(edtHeight.getText().toString()),2);

        txtBMI.setText(String.format("Your BMI is %.1f%n",BMI));

        if (BMI < 18.5 || BMI > 25) {
            txtBMI.setTextColor(getResources().getColor(R.color.negativeBMI));
        }
        else {
            txtBMI.setTextColor(getResources().getColor(R.color.positiveBMI));
        }

    }
}
