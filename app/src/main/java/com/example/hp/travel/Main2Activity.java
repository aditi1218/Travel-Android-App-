package com.example.hp.travel;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

  Button pm,pcm,pantaloon,orchid,rtrend,gmall,cmall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("MALLS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_main2);
   pm=(Button)findViewById(R.id.pm);
   pcm=(Button)findViewById(R.id.pcm);
   pantaloon=(Button)findViewById(R.id.pantaloon);
   orchid=(Button)findViewById(R.id.orchid);
   rtrend=(Button)findViewById(R.id.rtrend);
    gmall=(Button)findViewById(R.id.gmall);
   cmall=(Button)findViewById(R.id.cmall);

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

    public void a(View v1)
    {
        String add="5th Floor, PM Mall, Patliputra Kurji Road, Industrial Area, Patna, Bihar 800013";
        String time="9:30-10pm";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s2",time);
        i1.putExtra("s1",add);
        startActivity(i1);
    }
    public void b(View v1)
    {
        String add="Fraser Rd, Old Jakkanpur, Golambar, Patna, Bihar 800001";
        String time="10AM-9PM";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s1",add);
        i1.putExtra("s2",time);
        startActivity(i1);
    }
    public void c(View v1)
    {
        String add="Rajapur Pool, Boring Canal Road, Patna, Bihar 800001";
        String time="10AM-11PM";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s2",time);
        i1.putExtra("s1",add);
        startActivity(i1);
    }
    public void d(View v1)
    {
        String add="Boring Rd North, Sri Krishna Puri, Opp A.N College Science Block, Sri Krishna Puri, Patna, Bihar 800013";
        String time="8AM-9:30PM";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s1",add);
        i1.putExtra("s2",time);
        startActivity(i1);
    }
    public void e(View v1)
    {
        String add="East Boring Canal Rd, Patna, Bihar 800001";
        String time="10AM-9:30PM";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s1",add);
        i1.putExtra("s2",time);
        startActivity(i1);
    }
    public void f(View v1)
    {
        String add="Gardenia Gravity mall, Kankarbagh, Patna, Bihar., KankerBagh Rd, P.C.Colony, Patrakar Nagar, Patna, Bihar 800020";
        String time="9:30AM-10PM";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s1",add);
        i1.putExtra("s2",time);
        startActivity(i1);
    }
    public void g(View v1)
    {
        String add="Laxmi Complex, Boring Rd, Sri Krishna Puri, Patna, Bihar 800001";
        String time="10AM-9:30PM";
        Intent i1=new Intent(Main2Activity.this,pm.class);
        i1.putExtra("s1",add);
        i1.putExtra("s2",time);
        startActivity(i1);
    }

}
