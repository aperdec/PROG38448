package com.example.perds.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view) {
        TextView txtName = (TextView) findViewById(R.id.txtName);
        EditText edtText = (EditText) findViewById(R.id.edtName);

        txtName.setText(edtText.getText());

        Toast.makeText(this, "WE MADE TOAST", Toast.LENGTH_SHORT).show();
    }
}
