package com.example.hp.travel;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.ActionBar;

public class MainActivity extends AppCompatActivity  {

    Button b1,b2,b3;
    private boolean a=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.dev:
            {
                Intent i1=new Intent(MainActivity.this,Developers.class);
                startActivity(i1);
                break;
            }
            case R.id.set:
            {
                Intent i1=new Intent(MainActivity.this,background.class);
                startActivity(i1);
            }
        }
        return  true;
    }
    public  void a(View v){
        PopupMenu p=new PopupMenu(MainActivity.this,b1);
        p.getMenuInflater().inflate(R.menu.menu,p.getMenu());
    }
    public void b1(View view)
    {
        Intent i1=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i1);
    }
    public void b2(View view)
    {
        Intent i1=new Intent(MainActivity.this,Main3Activity.class);
        startActivity(i1);
    }
    public void b3(View view)
    {
        Intent i1=new Intent(MainActivity.this,Main4Activity.class);
        startActivity(i1);
    }

    @Override
    public void onBackPressed() {
        if(a) {
            super.onBackPressed();
            return;
        }
        this.a=true;
        Toast.makeText(this,"CLICK  BACK AGAIN TO EXIT",Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                a=false;
            }
        }
                ,1000);
    }

}
