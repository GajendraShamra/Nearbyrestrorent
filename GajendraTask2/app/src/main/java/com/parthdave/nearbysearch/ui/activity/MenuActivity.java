package com.parthdave.nearbysearch.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.parthdave.nearbysearch.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
TextView text_fish,text_chicken,text_mutton,text_dal,text_total,count_fish,count_chicken,count_mutton,count_dal;
ImageView image_m_fish,image_p_fish,image_m_chicken,image_p_chicken,image_m_mutton,image_p_mutton,
        image_m_dal,image_p_dal;
LinearLayout linear_checkout;
    int fish = 0;
    int chicken = 0;
    int mutton = 0;
    int dal = 0;
    int Total_fish=0;
    int Total_chicken=0;
    int Total_mutton=0;
    int Total_dal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        IntitiateView();
    }

    private void IntitiateView() {
        text_chicken=(TextView)findViewById(R.id.chicken);
        text_mutton=(TextView)findViewById(R.id.mutton);
        text_dal=(TextView)findViewById(R.id.dal);

        count_fish=(TextView)findViewById(R.id.count_fish);
        count_chicken=(TextView)findViewById(R.id.count_chicken);
        count_mutton=(TextView)findViewById(R.id.count_mutton);
        count_dal=(TextView)findViewById(R.id.count_dal);

        image_m_fish=(ImageView)findViewById(R.id.minus_fish);
        image_p_fish=(ImageView)findViewById(R.id.plus_fish);
        image_m_chicken=(ImageView)findViewById(R.id.minus_chicken);
        image_p_chicken=(ImageView)findViewById(R.id.plus_chicken);
        image_m_mutton=(ImageView)findViewById(R.id.minus_mutton);
        image_p_mutton=(ImageView)findViewById(R.id.plus_mutton);
        image_m_dal=(ImageView)findViewById(R.id.minus_dal);
        image_p_dal=(ImageView)findViewById(R.id.plus_dal);
        linear_checkout=(LinearLayout)findViewById(R.id.linear_checkout);
        image_m_fish.setOnClickListener(this);
        image_p_fish.setOnClickListener(this);
        image_m_chicken.setOnClickListener(this);
        image_p_chicken.setOnClickListener(this);
        image_m_mutton.setOnClickListener(this);
        image_p_mutton.setOnClickListener(this);
        image_m_dal.setOnClickListener(this);
        image_p_dal.setOnClickListener(this);
        linear_checkout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.minus_fish:
                if (fish>=2) {
                    fish = fish - 1;
                }
              Count_fish(fish);
                //display_fish(200*fish);
                break;
            case R.id.plus_fish:
                fish=fish+1;
                Count_fish(fish);
                //display_fish(200*fish);
                break;
            case R.id.minus_chicken:
                if (chicken>=1) {
                    chicken = chicken - 1;
                }
                Count_chicken(chicken);
                break;
            case R.id.plus_chicken:
                chicken = chicken +1;
                Count_chicken(chicken);
                break;
            case R.id.minus_mutton:
                if (mutton>=1) {
                    mutton = mutton - 1;
                }
                Count_mutton(mutton);
                break;
            case R.id.plus_mutton:
                mutton = mutton + 1;
                Count_mutton(mutton);
                break;
            case R.id.minus_dal:
                if (dal>=1) {
                    dal = dal - 1;
                }
                Count_dal(dal);
                break;
            case R.id.plus_dal:
                dal = dal +1;
                Count_dal(dal);
                break;
            case R.id.linear_checkout:
              Intent intent=new Intent(getApplicationContext(),PaymenyActivity.class);
              String a=String.valueOf(Total_fish+Total_chicken+Total_mutton+Total_dal);
              intent.putExtra("total",a);
                Log.wtf("result",a);
              startActivity(intent);
                break;
        }
    }

    private void Count_fish(int number){
        count_fish=(TextView)findViewById(R.id.count_fish);
        count_fish.setText(""+number);
        int fish_count1=200*number;
        Log.wtf("result",String.valueOf(fish_count1));
        Total_fish=Total_fish+fish_count1;
//        text_total=(TextView)findViewById(R.id.text_total);
//        text_total.setText("Amount:-" +String .valueOf(Total));
    }

    private void Count_chicken(int number) {
        count_chicken=(TextView)findViewById(R.id.count_chicken);
        count_chicken.setText(""+number);
        int fish_count2=400*number;
        Log.wtf("result",String.valueOf(fish_count2));
        Total_chicken=Total_chicken+fish_count2;
//        text_total=(TextView)findViewById(R.id.text_total);
//        text_total.setText("Amount:-" +String .valueOf(Total));
    }
    private void Count_mutton(int number) {
        count_mutton=(TextView)findViewById(R.id.count_mutton);
        count_mutton.setText(""+number);
        int fish_count3=500*number;
        Log.wtf("result",String.valueOf(fish_count3));
        Total_mutton=Total_mutton+fish_count3;
//        text_total=(TextView)findViewById(R.id.text_total);
//        text_total.setText("Amount:-" +String .valueOf(Total));
    }
    private void Count_dal(int number) {
        count_dal=(TextView)findViewById(R.id.count_dal);
        count_dal.setText(""+number);
        int fish_count4=210*number;
        Log.wtf("result",String.valueOf(fish_count4));
        Total_dal=Total_dal+fish_count4;
//        text_total=(TextView)findViewById(R.id.text_total);
//        text_total.setText("Amount:-" +String .valueOf(Total));
    }
}
