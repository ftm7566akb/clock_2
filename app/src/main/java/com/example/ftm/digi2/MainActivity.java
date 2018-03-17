package com.example.ftm.digi2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1=(TextView)findViewById(R.id.t1);
        TextView text2=(TextView)findViewById(R.id.t2);
        TextView text3=(TextView)findViewById(R.id.t3);
        TextView text4=(TextView)findViewById(R.id.t4);
        TextView text5=(TextView)findViewById(R.id.t5);


        Typeface font1=Typeface.createFromAsset(getAssets(),"font/digital7.ttf");

        text1.setTypeface(font1);
        text2.setTypeface(font1);
        text3.setTypeface(font1);
        text4.setTypeface(font1);
        text5.setTypeface(font1);

    }
}
