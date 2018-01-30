package com.example.tansu.miwoklanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;

public class PageActivity extends AppCompatActivity {
    private static int i=0;
    WebView  image;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        /**
         * hello git status
         *
         */
        next =(Button) findViewById(R.id.next);
        while(i<=6){

        }

    }
}
