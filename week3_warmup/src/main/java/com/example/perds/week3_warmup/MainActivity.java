package com.example.perds.week3_warmup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hw = (TextView) findViewById(R.id.hw);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
        if(item.getTitle().equals("Green")) {
            item.setTitle("Red");
            hw.setTextColor(getResources().getColor(R.color.green));
        }
        else {
            item.setTitle("Green");
            hw.setTextColor(getResources().getColor(R.color.red));
        }

        return super.onOptionsItemSelected(item);
    }
}
