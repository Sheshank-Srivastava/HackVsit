package com.example.tansu.miwoklanguage;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button start =(Button) findViewById(R.id.start_button);
        start.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent pages = new Intent(MainActivity.this, PageActivity.class);
                startActivity(pages);
            }
        });


    }
}
