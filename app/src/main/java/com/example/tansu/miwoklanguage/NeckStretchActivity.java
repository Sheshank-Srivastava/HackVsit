package com.example.tansu.miwoklanguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.example.tansu.miwoklanguage.HandActivity;
import com.example.tansu.miwoklanguage.R;

public class NeckStretchActivity extends AppCompatActivity {
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
        image.loadUrl("file:///android_asset/neckStretch.html");
        final Button start = findViewById(R.id.next);
        start.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent pages = new Intent(NeckStretchActivity.this, HandActivity.class);
                startActivity(pages);
            }
        });

    }
}
