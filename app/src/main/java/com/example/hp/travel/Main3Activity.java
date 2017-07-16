package com.example.hp.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
  Button pind,china,seven,cu,ol,roti,mlc,nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("RESTAURANTS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        pind=(Button)findViewById(R.id.pind);
        china=(Button)findViewById(R.id.china);
        seven=(Button)findViewById(R.id.seven);
        cu=(Button)findViewById(R.id.cu);
        ol=(Button)findViewById(R.id.ol);
        roti=(Button)findViewById(R.id.roti);
        mlc=(Button)findViewById(R.id.mlc);
        nv=(Button)findViewById(R.id.nv);
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

    public void h(View v1)
    {
        String addr="16th, 17th and 18th Floor, Biscomaun Tower, Gandhi Maidan, Patna, Bihar 800001";
        String tim="12AM-10PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void i(View v1)
    {
        String addr="Near Dak Bangla Chauraha Nutan Plaza Dak Bangla Rd, Bander Bagicha, Fraser Road Area, Patna, Bihar 800001";
        String tim="10AM-8PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void j(View v1)
    {
        String addr="6th Floor, P  M Mall, Khurji Road, Patliputra Industrial Area, Patna, Bihar 800010";
        String tim="12-10:30PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void k(View v1)
    {
        String addr="Surya Palace, Near Paani Tanki, Patliputra, More Boring Road, Patna, Bihar 800013";
        String tim="12-10PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void l(View v1)
    {
        String addr="4th floor, R. K. Plaza, Main Road, KankerBagh Road, Patna, Bihar 800020";
        String tim="11AM-11PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void m(View v1)
    {
        String addr="Pavitra Complex, Near Mangal Market, Baily Rd, Raja Bazar, Sheikhpura, Patna, Bihar 800014";
        String tim="12:30AM-10PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void n(View v1)
    {
        String addr="5th floor, Central Mall, Fraser Rd, Patna, Bihar 800001";
        String tim="11:45AM-11PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }
    public void o(View v1)
    {
        String addr="1st FLOOR, Bhagwathi Saran Enclave,Near P.C jewellers,, Above U.S POLO showroom,Boring Road, Patna, Bihar 800001";
        String tim="11AM-10PM";
        Intent i1=new Intent(Main3Activity.this,pind.class);
        i1.putExtra("s3",addr);
        i1.putExtra("s4",tim);
        startActivity(i1);
    }

}
