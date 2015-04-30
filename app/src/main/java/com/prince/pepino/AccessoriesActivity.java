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
public class AccessoriesActivity extends ActionBarActivity {
    GridView gv2;
    Context accContext;

    public static String[] accMainList = {"IvyBlue Earring", "Mercedez Watch", "Hermes Bracelet", "Metal-Wood Bracelet", "Top SHop Bangles", "MK shades","Cartier Gold Necklace", "Yaqin Watch", "Hook and tie bracelet", "Butterfly Brooche"};
    public static String[] accPriceList = {"$10", "$20", "$25", "$15", "$10", "$20", "$15", "$10", "$18", "$12"};
    public static int[] accMainIcons = {R.drawable.bluestone, R.drawable.watch2 , R.drawable.hermes, R.drawable.menbracelet, R.drawable.ponobangles, R.drawable.shades, R.drawable.statementchoker, R.drawable.watch, R.drawable.fashaccessories1,  R.drawable.brooche};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Getting the layout
        setContentView(R.layout.activity_accessories);
        accContext = this;
        gv2 = (GridView)findViewById(R.id.accGridView);
        gv2.setAdapter(new AccessoriesGridViewAdapter(this, accMainList, accPriceList, accMainIcons));

        gv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        Intent i = new Intent(accContext, SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[0]);
                        i.putExtra("name", accMainList[0]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;

                    case 1:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[1]);
                        i.putExtra("name", accMainList[1]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 2:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[2]);
                        i.putExtra("name", accMainList[2]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 3:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[3]);
                        i.putExtra("name", accMainList[3]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 4:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[4]);
                        i.putExtra("name", accMainList[4]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 5:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[5]);
                        i.putExtra("name", accMainList[5]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 6:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[6]);
                        i.putExtra("name", accMainList[6]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 7:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[7]);
                        i.putExtra("name", accMainList[7]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 8:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[8]);
                        i.putExtra("name", accMainList[8]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 9:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        i.putExtra("price", accPriceList[9]);
                        i.putExtra("name", accMainList[9]);
                        i.putExtra("icon", accMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;


                }
            }
        });
    }
}
