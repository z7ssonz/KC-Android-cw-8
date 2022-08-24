package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        Item delieverItem = (Item) bundle.getSerializable("item");

        TextView itemNameTextview = findViewById(R.id.TVname);
        TextView itemPriceTextView = findViewById(R.id.TVprice);
        ImageView itemImageView = findViewById(R.id.img);
        TextView itemDescription = findViewById(R.id.TV3);

        itemNameTextview.setText(delieverItem.getItemName());
        itemPriceTextView.setText(String.valueOf(delieverItem.getItemPrice()));
        itemImageView.setImageResource(delieverItem.getItemImage());
        itemDescription.setText(delieverItem.getItemDescription());

    }
}