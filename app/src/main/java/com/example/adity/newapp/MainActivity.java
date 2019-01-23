package com.example.adity.newapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumOne;
    EditText editTextNumTwo;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.btn);

        editTextNumOne = findViewById(R.id.editTextNumOne);
        editTextNumTwo = findViewById(R.id.editTextNumTwo);
        textView = findViewById(R.id.resultTextView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editTextNumOne.getText().toString());
                int num2 = Integer.parseInt(editTextNumTwo.getText().toString());
                int result = num1/num2;
                textView.setText(Integer.toString(result));
                Toast.makeText(getApplicationContext(),"Bill split equally",Toast.LENGTH_LONG).show();

            }
        });
    }
}
