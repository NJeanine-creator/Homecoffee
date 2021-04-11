package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.bumptech.glide.Glide;


import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CappuccinoActivity extends Activity {
    //@BindView(R.id.button) Button order;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappuccino);
        // ButterKnife.bind(this);
        Register = findViewById(R.id.button);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Order.class));

            }
        });
    }
}
