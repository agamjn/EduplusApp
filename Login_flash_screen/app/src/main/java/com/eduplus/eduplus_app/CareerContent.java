package com.eduplus.eduplus_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class CareerContent extends AppCompatActivity implements View.OnClickListener {


    ImageView np1, np2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_content);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        np1 = (ImageView) findViewById(R.id.np1);
        np2 = (ImageView) findViewById(R.id.np2);

        np1.setOnClickListener(this);
        np2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.np1:
                i = new Intent(CareerContent.this, Career.class);
                startActivity(i);
                break;

            case R.id.np2:
                i = new Intent(CareerContent.this, CareerBroker.class);
                startActivity(i);
                break;


        }
    }
}