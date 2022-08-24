package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Item item1 = new Item("cheese",R.drawable.cheese,2.0,"italian Cheese");
       Item item2 = new Item("chocolate",R.drawable.chocolate,3.0,"Brazilian Chocolate");
       Item item3 = new Item("coffee",R.drawable.coffee,2.0,"Americano");
       Item item4 = new Item("donut",R.drawable.donut,3.5,"sugar Donut");
       Item item5 = new Item("fires",R.drawable.fries,4.0,"frinch fries");
       Item item6 = new Item("honey",R.drawable.honey,6.0,"moajeza");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);

        itemAdapter itemAdapter = new itemAdapter(this, 0,items);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Item currentItem = items.get(i);

       Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("Item", currentItem);
        startActivity(intent);


            }
        });


}


}