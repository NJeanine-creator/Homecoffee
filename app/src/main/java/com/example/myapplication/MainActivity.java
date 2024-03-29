package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  {
    ViewPager mViewPager;

    //images array
    int[] images = {R.drawable.coffeeshophome, R.drawable.coffebackground, R.drawable.coffeeshop, R.drawable.coffee5,
            R.drawable.coffee4, R.drawable.coffee3, R.drawable.coffee2, R.drawable.cofee1};

    //Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;

    private TextView mTextView;

    @BindView(R.id.btnGo) Button mGo;
    @BindView(R.id.btnsearch) Button msearch;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing the ViewPager Object
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);

        //Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, images);

        //Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);

        mTextView = findViewById(R.id.hometitle);

        ButterKnife.bind(this);
        FragmentManager fm = getSupportFragmentManager();

        mGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                YoYo.with(Techniques.Tada)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        msearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
    }

}
