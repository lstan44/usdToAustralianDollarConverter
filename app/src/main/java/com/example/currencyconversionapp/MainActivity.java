package com.example.currencyconversionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        Intent intent = new Intent(this, ResultActivity.class);
        EditText et = findViewById(R.id.et_amount);
        Double usd_amount = Double.parseDouble(et.getText().toString());

        double aussieD = CurrencyConverter.usdToAus(usd_amount);
        double euro = CurrencyConverter.usToEuro(usd_amount);


        String showUSD = "US Dollars: "+ usd_amount;
        String showAUD = "Australian Dollars: "+ aussieD;
        String showEuro = "Euros: "+ euro;

        intent.putExtra("us", showUSD);
        intent.putExtra("au",showAUD);
        intent.putExtra("eu",showEuro);

        startActivity(intent);
    }
}
