package com.dance.salsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dance.salsa.ShowcaseActivity.ShowcaseActivity;

public class MainActivity extends AppCompatActivity {

    Button btnDanceMove1;
    Button btnDanceMove2;
    Button btnDanceMove3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDanceMove1 = (Button) findViewById(R.id.btnDanceMove1);
        btnDanceMove2 = (Button) findViewById(R.id.btnDanceMove2);
        btnDanceMove3 = (Button) findViewById(R.id.btnDanceMove3);

        btnDanceMove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShowcaseActivity.class);
                startActivity(intent);
            }
        });

        btnDanceMove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShowcaseActivity.class);
                startActivity(intent);
            }
        });

        btnDanceMove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShowcaseActivity.class);
                startActivity(intent);
            }
        });

    }
}
