package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(MainActivity.this, Login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         if(position==0){
             Intent intent = new Intent(MainActivity.this,DrinksActivity.class);
             startActivity(intent);

                }
         if(position==1){
             Intent intent= new Intent(MainActivity.this,CappuccinoActivity.class);
             startActivity (intent);
         }
         if(position==2){
             Intent intent= new Intent(MainActivity.this, FilterActivity.class);
             startActivity (intent);
         }
            }
 /* public void OnItemClick(AdapterView<?> listView, View v, int position,long id ){

 } */
        };
        ListView listView=(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

    }
}