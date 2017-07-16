package com.example.hp.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        ImageView t1=(ImageView)findViewById(R.id.i1);
        ImageView t2=(ImageView)findViewById(R.id.i2);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        Animation a2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        t1.startAnimation(a1);
        t2.startAnimation(a2);
        Thread t=new Thread()
        {
            public void run()
            {
                try{
                    sleep(2500);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally{
                    Intent i1= new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i1);
                }
            }
        };
        t.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }


}
