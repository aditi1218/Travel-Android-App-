package com.example.hp.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pm extends AppCompatActivity {
  TextView text1,text2;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("LOCATION");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_pm);
        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);


        String add1;
        String time1;
       add1=getIntent().getStringExtra("s1");
        time1=getIntent().getStringExtra("s2");
     text1.setText(""+add1);
     text2.setText(""+time1);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void w(View v1)
    {
        Intent i1=new Intent(pm.this,MapsActivity.class);
        startActivity(i1);
    }
}
