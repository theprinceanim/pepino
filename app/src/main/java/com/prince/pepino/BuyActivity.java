package com.prince.pepino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by eit on 4/28/15.
 */
public class BuyActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
    }
    public void continueBuyClicked(View view) {
        sendEmail();
    }

    private void sendEmail() {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"prince.anim@meltwater.org"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Request to Buy Item(s)");
        i.putExtra(Intent.EXTRA_TEXT,"Kindly provide us with the details of the luxury items you will like to purchase, with your full name and phone number");
        try{
            startActivity(Intent.createChooser(i, "Select Mailing Client"));
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(BuyActivity.this, "Sorry, there are no email clients on this device", Toast.LENGTH_LONG).show();
        }
    }
}
