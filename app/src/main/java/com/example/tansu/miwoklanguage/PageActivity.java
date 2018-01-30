package com.example.tansu.miwoklanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.felipecsl.gifimageview.library.GifImageView;

public class PageActivity extends AppCompatActivity {
    GifImageView image;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        /**
         * hello git status
         *
         */
        image = (GifImageView) findViewById(R.id.gif_image);
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                image.startAnimation();
            }
        });

    }
}
