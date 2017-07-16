package com.example.hp.travel;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class background extends AppCompatActivity {
 Button back1,back2,back3,back4,back5;
    LinearLayout act1,act2,act3,act4,act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        back1=(Button)findViewById(R.id.back1);
        back2=(Button)findViewById(R.id.back2);
        back3=(Button)findViewById(R.id.back3);
        back4=(Button)findViewById(R.id.back4);
        back5=(Button)findViewById(R.id.back5);
        act=(LinearLayout)findViewById(R.id.act);
        act1=(LinearLayout)findViewById(R.id.act1);
        act2=(LinearLayout)findViewById(R.id.act2);
        act3=(LinearLayout)findViewById(R.id.act3);
        act4=(LinearLayout)findViewById(R.id.act4);
    }
    public void back11 (View v)
    {
    //act1.setBackgroundResource(R.drawable.backgroundimage1);
      //  act2.setBackgroundResource(R.drawable.backgroundimage1);
      //  act3.setBackgroundResource(R.drawable.backgroundimage1);
       // act4.setBackgroundResource(R.drawable.backgroundimage1);
        act.setBackgroundResource(R.drawable.backgroundimage1);

    }
    public void back22 (View v)
    {
      //  act1.setBackgroundResource(R.drawable.back);
        //act2.setBackgroundResource(R.drawable.back);
    //    act3.setBackgroundResource(R.drawable.back);
    //    act4.setBackgroundResource(R.drawable.back);
        act.setBackgroundResource(R.drawable.back);

    }
    public void back33 (View v)
    {
     //   act1.setBackgroundResource(R.drawable.back5);
     //   act2.setBackgroundResource(R.drawable.back5);
     //   act3.setBackgroundResource(R.drawable.back5);
     //   act4.setBackgroundResource(R.drawable.back5);
        act.setBackgroundResource(R.drawable.back5);

    }
    public void back44 (View v)
    {
      //  act1.setBackgroundResource(R.drawable.backg);
      //  act2.setBackgroundResource(R.drawable.backg);
      //  act3.setBackgroundResource(R.drawable.backg);
        //act4.setBackgroundResource(R.drawable.backg);
        act.setBackgroundResource(R.drawable.backg);

    }
    public void back55 (View v)
    {
       // act1.setBackgroundResource(R.drawable.backgr);
     //   act2.setBackgroundResource(R.drawable.backgr);
     //   act3.setBackgroundResource(R.drawable.backgr);
      //  act4.setBackgroundResource(R.drawable.backgr);
        act.setBackgroundResource(R.drawable.backgr);

    }
}

