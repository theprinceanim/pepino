package com.prince.pepino;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    GridView gv1;
    Context context;
    public static String[] mainList = {"Accessories", "Bags", "Clothing", "Shoes"};
    public static int[]mainIcons = {R.drawable.accessories, R.drawable.bags, R.drawable.cloths, R.drawable.shoes};
    SharedPreferences mSharedPreferences;
    private static final String PREFS = "prefs";
    private static final String PREF_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 7. Greet the user, or ask for their name if new
        displayWelcome();
        gv1 = (GridView)findViewById(R.id.gridView1);
        gv1.setAdapter(new GridViewAdapter(this, mainList, mainIcons));

        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        //Intent for accessories
                        Intent accessories = new Intent(getApplicationContext(), AccessoriesActivity.class);
                        startActivity(accessories);
                        break;
                    case 1:
                        //Intent for bags
                        Intent bags = new Intent(getApplicationContext(), BagsActivity.class);
                        startActivity(bags);
                        break;
                    case 2:
                        //Intent for clothes
                        Intent clothes = new Intent(getApplicationContext(), ClotheActivity.class);
                        startActivity(clothes);
                        break;
                    case 3:
                        //Intent for shoes
                        Intent shoes = new Intent(getApplicationContext(), ShoeActivity.class);
                        startActivity(shoes);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if(id == R.id.share){
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, " ");
            sharingIntent.putExtra(Intent.EXTRA_TEXT,
                    getString(R.string.sharemessage));
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        }

        else if(id == R.id.call){
            call();
        }
        return super.onOptionsItemSelected(item);
    }

    private void call() {
        String number = "0246325632";

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + number));
        startActivity(callIntent);
    }

    public void sellBtnClicked(View view) {
        Intent intent = new Intent(MainActivity.this, SellActivity.class);
        startActivity(intent);
    }

    public void displayWelcome() {
        // Access the device's key-value storage
        mSharedPreferences = getSharedPreferences(PREFS,MODE_PRIVATE);

        // Read the user's name,
        // or an empty string if nothing found
        String name = mSharedPreferences.getString(PREF_NAME,"");

        if(name.length() > 0){
            // If the name is valid, display a Toast welcoming them
            Toast.makeText(this, " Welcome back, " + name + "!", Toast.LENGTH_LONG).show();
        }
        else {
            // otherwise, show a dialog to ask for their name
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Hello there, I don't do fashion, I am fashion.");
            alert.setMessage("Can I know your name?");

            // Create EditText for entry
            final EditText input = new EditText(this);
            alert.setView(input);

            // Make an "OK" button to save the name
            alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    // Grab the EditText's input
                    String inputName = input.getText().toString();

                    // Put it into memory (don't forget to commit!)
                    SharedPreferences.Editor e = mSharedPreferences.edit();
                    //it should save inputName in PREF_NAME
                    e.putString(PREF_NAME, inputName);
                    e.commit();

                    // Welcome the new user
                    Toast.makeText(getApplicationContext(), "Welcome, " + inputName + "!", Toast.LENGTH_LONG).show();
                }
            });

            // Make a "Cancel" button
            // that simply dismisses the alert
            alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int whichButton){}
            });
            alert.show();
        }
    }
}

