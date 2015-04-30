package com.prince.pepino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by eit on 4/28/15.
 */

public class SplashActivity extends Activity{

        private static int SPLASH_SCREEN_DELAY = 1800;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);


            //Using handler as timer
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //in the context of splash activity move to log in and pass in the delay parameter
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);

                    finish();
                }
            }, SPLASH_SCREEN_DELAY);
        }
}

