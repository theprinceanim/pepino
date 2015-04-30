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
public class ClotheActivity extends ActionBarActivity {
    GridView gv4;
    Context clotheContext;

    public static String[] clotheMainList = {"Pink Marina Gown", "Paisley Fluff", "Michael Costello Red Chic", "Asos Skatter Dress", "La Belle Turquoise", "Mandala Peach","Mandala Pink", "Versace all back gown", "Senorita Club wear", "Dona Tella One Hand Gown"};
    public static String[] clothePriceList = {"$10", "$20", "$25", "$15", "$10", "$20", "$15", "$10", "$18", "$12"};
    public static int[] clotheMainIcons = {R.drawable.clothe18, R.drawable.clothe11, R.drawable.clothe12, R.drawable.clothe13, R.drawable.clothe14, R.drawable.clothe15, R.drawable.clothe16, R.drawable.clothe17,  R.drawable.clothe19, R.drawable.clothe20};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Getting the layout
        setContentView(R.layout.activity_clothe);
        gv4 = (GridView)findViewById(R.id.clotheGridView);
        gv4.setAdapter(new ClotheGridViewAdapter(this, clotheMainList, clothePriceList, clotheMainIcons));

        gv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
                        //                     startActivity(firstItem);
                        Intent i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[0]);
                        i.putExtra("name", clotheMainList[0]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;

                    case 1:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[1]);
                        i.putExtra("name", clotheMainList[1]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 2:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[2]);
                        i.putExtra("name", clotheMainList[2]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 3:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[3]);
                        i.putExtra("name", clotheMainList[3]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 4:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[4]);
                        i.putExtra("name", clotheMainList[4]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 5:
//                      Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[5]);
                        i.putExtra("name", clotheMainList[5]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 6:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[6]);
                        i.putExtra("name", clotheMainList[6]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 7:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                       startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[7]);
                        i.putExtra("name", clotheMainList[7]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 8:
//                        Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[8]);
                        i.putExtra("name", clotheMainList[8]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;
                    case 9:
//                       Intent firstItem = new Intent(getApplicationContext(), SingleAccessoryActivity.class);
//                        startActivity(firstItem);
                        i = new Intent(getApplicationContext(), SingleClotheActivity.class);
                        i.putExtra("price", clothePriceList[9]);
                        i.putExtra("name", clotheMainList[9]);
                        i.putExtra("icon", clotheMainIcons[position]);
                        startActivityForResult(i, 1);
                        break;


                }
            }
        });
    }
}
