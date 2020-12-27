package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CappuccinoCategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listCappuccino = getListView();

        ArrayAdapter<Cappuccino> listAdapter = new ArrayAdapter<Cappuccino>(
                this,
                android.R.layout.simple_list_item_1,
                Cappuccino.cappuccino
        );
        listCappuccino.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent = new Intent(CappuccinoCategoryActivity.this,CappuccinoActivity.class);
        // intent.putExtra(DrinksActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }
}