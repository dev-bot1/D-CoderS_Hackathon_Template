package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler =new Handler();
        handler.postDelayed(new Runnable()
        {
            private Object mainactivity1;

            @Override
            public void run()
            {
                Intent intent =new Intent(MainActivity.this,mess_login.class);
                startActivity(intent);
                finish();

            }

        },2000);


    }


}

