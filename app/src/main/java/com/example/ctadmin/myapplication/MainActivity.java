package com.example.ctadmin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView mytextView = (TextView) findViewById(R.id.textView);
                mytextView.setText("***Never Give Up!***" +
                        "Believe in yourself!***   " );
                ImageView imageView = (ImageView) findViewById(R.id.photo_image_view);
                imageView.setImageResource(R.drawable.narusuc);

            }
        });
        Button button2 = (Button) findViewById(R.id.gobutton);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gotoIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(gotoIntent);

            }
        });
    }
}
