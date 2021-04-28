package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = SearchActivity.class.getSimpleName();
    @BindView(R.id.findCoffee)
    Button mhotel;
    @BindView(R.id.locationEditText)
    EditText mlocation;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        Typeface caviarFont = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mAppNameTextView.setTypeface(caviarFont);
        mhotel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v == mhotel) {
            Intent intent = new Intent(SearchActivity.this, CoffeeActivity.class);
            String location = mlocation.getText().toString();
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}