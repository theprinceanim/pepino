package com.prince.pepino;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by eit on 4/27/15.
 */
public class ShoeActivity extends ActionBarActivity {
    GridView gv4;
    Context shoeContext;

    public static String[] shoeMainList = {"Guiseppe Zannoti Fierce", "Louboutin Bride Shoes", "Louboutin Mens Classic", "Doll House Chic", "Louboutin Fancy", "Pure Black Louboutin","Angelina Jolie Maleficient", "Zannoti Bold", "Spike Slippers", "Dapper Shoe"};
    public static String[] shoePriceList = {"$10", "$20", "$25", "$15", "$10", "$20", "$15", "$10", "$18", "$12"};
    public static int[] shoeMainIcons = {R.drawable.shoe10, R.drawable.shoe11, R.drawable.shoe14, R.drawable.shoe18, R.drawable.shoe12, R.drawable.shoe13,R.drawable.shoe15, R.drawable.shoe16,  R.drawable.shoe17, R.drawable.shoe19};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Getting the layout
        setContentView(R.layout.activity_shoe);
        gv4 = (GridView)findViewById(R.id.shoeGridView);
        gv4.setAdapter(new ShoeGridViewAdapter(this, shoeMainList, shoePriceList, shoeMainIcons));

        gv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        //                     startActivity(firstItem);
                        Intent i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[0]);
                        i.putExtra("name", shoeMainList[0]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;

                    case 1:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[1]);
                        i.putExtra("name", shoeMainList[1]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 2:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[2]);
                        i.putExtra("name", shoeMainList[2]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 3:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[3]);
                        i.putExtra("name", shoeMainList[3]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 4:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[4]);
                        i.putExtra("name", shoeMainList[4]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 5:
//                      Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[5]);
                        i.putExtra("name", shoeMainList[5]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 6:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[6]);
                        i.putExtra("name", shoeMainList[6]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 7:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[7]);
                        i.putExtra("name", shoeMainList[7]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 8:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[8]);
                        i.putExtra("name", shoeMainList[8]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 9:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleShoeActivity.class);
                        i.putExtra("price", shoePriceList[9]);
                        i.putExtra("name", shoeMainList[9]);
                        i.putExtra("icon", shoeMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;


                }
            }
        });
    }
}
