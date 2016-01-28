package com.example.perds.week3_swap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swap(View view) {
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout2);


        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.VISIBLE);
    }
}
