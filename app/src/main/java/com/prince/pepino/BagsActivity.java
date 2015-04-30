package com.prince.pepino;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by eit on 4/27/15.
 */
public class BagsActivity  extends AppCompatActivity {
    GridView gv3;
    Context bagContext;

    public static String[] bagMainList = {"Yves Saint Laurent", "Yan bag", "MK bag", "Hexagon Purse", "Gucci", "Asos Art Bag","Belle Spike purse", "Givenchy Leather Bag", "Abercrombie Classic", "Kardashian Purse"};
    public static String[] bagPriceList = {"$10", "$20", "$25", "$15", "$10", "$20", "$15", "$10", "$18", "$12"};
    //public static int[] bagMainIcons = {R.drawable.bag17, R.drawable.bag15, R.drawable.bag11, =>R.drawable.bag12, R.drawable.bag13, R.drawable.bag14,R.drawable.bag16, R.drawable.bag18,  R.drawable.bag19, R.drawable.bag10};
    public static int[] bagMainIcons = {R.drawable.bag17, R.drawable.bag15, R.drawable.bag11, R.drawable.bag12, R.drawable.bag13, R.drawable.bag14, R.drawable.bag16, R.drawable.bag18,  R.drawable.bag19, R.drawable.bag10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Getting the layout
        setContentView(R.layout.activity_bags);
        gv3 = (GridView)findViewById(R.id.bagGridView);
        gv3.setAdapter(new BagsGridViewAdapter(this, bagMainList, bagPriceList, bagMainIcons));

       gv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
 //                     startActivity(firstItem);
                      Intent i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[0]);
                       i.putExtra("name", bagMainList[0]);
                       i.putExtra("icon", bagMainIcons[position]);
                       startActivityForResult(i, 1);
                        break;

                   case 1:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                       i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[1]);
                       i.putExtra("name", bagMainList[1]);
                       i.putExtra("icon", bagMainIcons[position]);
                       startActivityForResult(i, 1);
                        break;
                   case 2:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                       i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[2]);
                       i.putExtra("name", bagMainList[2]);
                       i.putExtra("icon", bagMainIcons[position]);
                       startActivityForResult(i, 1);
                       break;
                   case 3:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                       i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[3]);
                        i.putExtra("name", bagMainList[3]);
                       i.putExtra("icon", bagMainIcons[position]);
                       startActivityForResult(i, 1);
                       break;
                   case 4:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[4]);
                        i.putExtra("name", bagMainList[4]);
                        i.putExtra("icon", bagMainIcons[position]);
                   startActivityForResult(i, 1);
                        break;
                   case 5:
//                      Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[5]);
                       i.putExtra("name", bagMainList[5]);
                        i.putExtra("icon", bagMainIcons[position]);
                       startActivityForResult(i, 1);
                       break;
                    case 6:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[6]);
                       i.putExtra("name", bagMainList[6]);
                      i.putExtra("icon", bagMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                   case 7:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                       i = new Intent(getApplicationContext(), SingleBagActivity.class);
                      i.putExtra("price", bagPriceList[7]);
                        i.putExtra("name", bagMainList[7]);
                       i.putExtra("icon", bagMainIcons[position]);
                       startActivityForResult(i, 1);
                       break;
                   case 8:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                       i = new Intent(getApplicationContext(), SingleBagActivity.class);
                       i.putExtra("price", bagPriceList[8]);
                       i.putExtra("name", bagMainList[8]);
                      i.putExtra("icon", bagMainIcons[position]);
                        startActivityForResult(i, 1);
                       break;
                    case 9:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleBagActivity.class);
                        i.putExtra("price", bagPriceList[9]);
                        i.putExtra("name", bagMainList[9]);
                        i.putExtra("icon", bagMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;


                }
            }
        });
    }
}
