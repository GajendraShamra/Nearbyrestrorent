package com.parthdave.nearbysearch.ui.activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.parthdave.nearbysearch.R;
import java.util.Calendar;
import java.util.Date;

public class TabkeBookActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView table_m,table_p;
    TextView count;
    Button btn_Submit;
    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabke_book);
        getSupportActionBar().hide();
        table_m=(ImageView)findViewById(R.id.table_m);
        table_p=(ImageView)findViewById(R.id.table_p);
        //count=(TextView)findViewById(R.id.count_table);
        btn_Submit=(Button)findViewById(R.id.button_submit);
        table_m.setOnClickListener(this);
        table_p.setOnClickListener(this);
        btn_Submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.table_m:
                if (number >= 1) {
                    number = number - 1;
                }
                Count_(number);
                //display_fish(200*fish);
                break;
            case R.id.table_p:
                number = number + 1;
                Count_(number);
                //display_fish(200*fish);
                break;
            case R.id.button_submit:
                Intent intent=new Intent(TabkeBookActivity.this,RestrorentActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Your request is submit",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void Count_(int number) {
        count=(TextView)findViewById(R.id.count_table);
        count.setText(""+number);
    }
}
