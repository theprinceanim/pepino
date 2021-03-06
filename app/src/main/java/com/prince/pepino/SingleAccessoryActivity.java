package com.prince.pepino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eit on 4/28/15.
 */
public class SingleAccessoryActivity extends ActionBarActivity {
    private ImageView itemImage;
    private TextView text1;
    private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_accessory_display);

        //receiving the items from the previous activity and d
        Intent in = getIntent();
        String price = in.getStringExtra("price");
        String name = in.getStringExtra("name");
        int position = getIntent().getIntExtra("icon", 0);

        text1 = (TextView)findViewById(R.id.singleAccText1);
        text2 = (TextView) findViewById(R.id.singleAccText2);
        itemImage = (ImageView)findViewById(R.id.singlAccView);

        text1.setText(price);
        text2.setText(name);
        itemImage.setImageResource(position);

    }


    public void buyBtnClicked(View view) {
        Intent intent = new Intent(SingleAccessoryActivity.this, BuyActivity.class);
        startActivity(intent);
    }
}
