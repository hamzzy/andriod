package com.example.hackthon.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goal1=0 ;
    int goal2 =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void to (View v){
     goal1=goal1+3;

        to(goal1);


    }

    public void go(View v){
        goal1=goal1+2;

        to(goal1);


    }

    public void but (View v){
        goal1=goal1+1;

        to(goal1);


    }

    public void reset(View v){
        goal1=0;
        to(goal1);

        goal2=0;
        text1(goal2);



    }



    public void to (int score){



        TextView textView = (TextView)findViewById(R.id.text1);
        textView.setText(String.valueOf(score));






    }






    public void add(View v){
        goal2=goal2+3;
        text1(goal2);


    }
    public void let(View v){
        goal2=goal2+2;
        text1(goal2);


    }
    public void me(View v){
        goal2=goal2+1;
        text1(goal2);


    }




    public void text1 (int score){



        TextView textView = (TextView)findViewById(R.id.text1);
        textView.setText(String.valueOf(score));






    }






}


