package com.example.myhp.digitalindia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by my hp on 4/9/2016.
 */
public class Services extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.services);
     //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_login);
      //  setSupportActionBar(toolbar);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
