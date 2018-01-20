package com.example.kirt.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText pass_word;
    private Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClick();
    }
    public void onButtonClick()
    {
        pass_word = (EditText)findViewById(R.id.input);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View w)
                {
                    Toast.makeText(
                        MainActivity.this, pass_word.getText(), Toast.LENGTH_SHORT
                    ).show();
                }
            }
        );
    }
}
