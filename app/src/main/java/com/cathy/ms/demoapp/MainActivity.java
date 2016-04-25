package com.cathy.ms.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView buttonGoogle, butonYahoo;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGoogle = (ImageView) findViewById(R.id.buttonGoogle);
        butonYahoo = (ImageView) findViewById(R.id.buttonYahoo);
        buttonGoogle.setOnClickListener(this);
        butonYahoo.setOnClickListener(this);
        in = new Intent(MainActivity.this, WebActivity.class);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {

            case R.id.buttonGoogle:

                in.putExtra("URL", "https://www.google.com");
                startActivity(in);
                break;

            case R.id.buttonYahoo:

                in.putExtra("URL", "https://www.yahoo.com");
                startActivity(in);
                break;

        }

    }
}
