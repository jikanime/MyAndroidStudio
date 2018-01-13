package com.example.kirt.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v) {
        EditText e1 =(EditText)findViewById(R.id.input);
        TextView t1 = (TextView)findViewById(R.id.result);
        String input = e1.getText().toString();
        String output = "Your input is " + input;
        t1.setText(output);
    }
}
