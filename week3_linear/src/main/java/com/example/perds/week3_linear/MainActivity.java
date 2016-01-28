package com.example.perds.week3_linear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        final double HST_FACTOR = 1.13;

        EditText edtAmount = (EditText) findViewById(R.id.edtAmount);
        double amount = Double.parseDouble(edtAmount.getText().toString());

//        CheckBox chkAddHst = (CheckBox) findViewById(R.id.chkHst);

        //two methods to get results from radio button

        //method 1 better for groups of radio buttons     use this

        RadioGroup grpHst = (RadioGroup) findViewById(R.id.grpHst);
        int selected = grpHst.getCheckedRadioButtonId();
        double total;
        switch (selected) {
            case R.id.radHst:
                total = amount * HST_FACTOR;
                break;
            case R.id.radNoHst:
                total = amount;
                break;
            default:
                total = amount;
                break;
        }

        TextView txtTotal = (TextView) findViewById(R.id.txtTotal);
        txtTotal.setText(String.format("Amount: $%.2f",total));

    }
}
