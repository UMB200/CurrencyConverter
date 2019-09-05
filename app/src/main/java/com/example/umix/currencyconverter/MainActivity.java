package com.example.umix.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){
        //Log.i("Value", "Button clicked");
        EditText editText = (EditText)findViewById(R.id.editText);
        //Log.i("Entered text",editText.getText().toString());
        String dollAmount = editText.getText().toString();
        double convertedAmount = Double.parseDouble(dollAmount);
        double indexToConvert = 0.7;
        double poundAmount = convertedAmount * indexToConvert;
        String finalAmount = String.format("%.2f", poundAmount );

        Toast.makeText(this, "USD of " + dollAmount +  " is equal GBP " + finalAmount, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
