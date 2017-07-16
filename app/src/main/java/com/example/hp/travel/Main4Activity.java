package com.example.hp.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button zoo,pmuse,gghar,wpark,bpark,scenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PLACES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_main4);
        zoo=(Button)findViewById(R.id.zoo);
        pmuse=(Button)findViewById(R.id.pmuse);
        gghar=(Button)findViewById(R.id.gghar);
        wpark=(Button)findViewById(R.id.wpark);
        bpark=(Button)findViewById(R.id.bpark);
        scenter=(Button)findViewById(R.id.scenter);
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

    public void p(View v1)
    {
        String address="Bailey Road, Raj Bhavan, Rajbansi Nagar, Patna, Bihar 800001";
        String times="8AM-6PM";
        Intent i1=new Intent(Main4Activity.this,zoo.class);
        i1.putExtra("s5",address);
        i1.putExtra("s6",times);
        startActivity(i1);
    }
    public void q(View v1)
    {
        String address=" Near Kotwali Thana, Buddha Marg, Patna, Bihar 800001";
        String times="10AM-5PM";
        Intent i1=new Intent(Main4Activity.this,zoo.class);
        i1.putExtra("s5",address);
        i1.putExtra("s6",times);
        startActivity(i1);
    }
    public void r(View v1)
    {
        String address="Golghar Chowrah, Ashok Rajpath, Chajju Bagh, Patna, Bihar 800001";
        String times="11AM-5PM";
        Intent i1=new Intent(Main4Activity.this,zoo.class);
        i1.putExtra("s5",address);
        i1.putExtra("s6",times);
        startActivity(i1);
    }
    public void s(View v1)
    {
        String address="Parsa-Sampatchak Rd, Sampatchak, Patna, Bihar 804453";
        String times="10AM-7PM";
        Intent i1=new Intent(Main4Activity.this,zoo.class);
        i1.putExtra("s5",address);
        i1.putExtra("s6",times);
        startActivity(i1);
    }
    public void t(View v1)
    {
        String address="Fraser Road, Near Patna Railway Station, Patna Junction, Patna, Bihar 800001";
        String times="10AM-6PM";
        Intent i1=new Intent(Main4Activity.this,zoo.class);
        i1.putExtra("s5",address);
        i1.putExtra("s6",times);
        startActivity(i1);
    }
    public void u(View v1)
    {
        String address="West Gandhi Maidan, Patna, Bihar 800001";
        String times="11AM-6PM";
        Intent i1=new Intent(Main4Activity.this,zoo.class);
        i1.putExtra("s5",address);
        i1.putExtra("s6",times);
        startActivity(i1);
    }
}
