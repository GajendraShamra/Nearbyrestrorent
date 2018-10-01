package com.parthdave.nearbysearch.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.parthdave.nearbysearch.R;

public class PaymenyActivity extends AppCompatActivity {
TextView amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymeny);
        amount=(TextView)findViewById(R.id.amount);
        Intent intent=getIntent();
        String total=intent.getStringExtra("total");
        amount.setText(total);
    }
}
