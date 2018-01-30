package com.example.tansu.miwoklanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Neck extends AppCompatActivity {
    WebView  image;
//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        /**
         * hello git status
         *
         */
        image  =(WebView) findViewById(R.id.image);
        image.loadUrl("file:///android_asset/neck.html");
        final Button start = findViewById(R.id.next);
        start.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent pages = new Intent(Neck.this, NeckStretchActivity.class);
                startActivity(pages);
            }
        });

    }
}
