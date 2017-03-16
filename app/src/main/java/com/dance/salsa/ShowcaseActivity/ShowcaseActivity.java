package com.dance.salsa.ShowcaseActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.dance.salsa.R;

public class ShowcaseActivity extends AppCompatActivity {

    Button btnStep1;
    Button btnStep2;
    Button btnStep3;
    Button btnStep4;
    Button btnStep5;
    Button btnStep6;
    Button btnStep7;
    Button btnStep8;
    Button btnPlay;

    int step1, step2, step3, step4, step5, step6, step7, step8;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase);


        final int seekTimeMs = 2000;
        final VideoView vvVideoView = (VideoView)findViewById(R.id.vvVideoView);
        final String path = "android.resource://" + getPackageName() + "/" + R.raw.scissorkfone;
        vvVideoView.setVideoURI(Uri.parse(path));
        vvVideoView.start();

        vvVideoView.seekTo(seekTimeMs);

        step1 = seekTimeMs;
        step2 = step1 + 500;
        step3 = step2 + 1000;
        step4 = step3 + 1200;
        step5 = step4 + 650;
        step6 = step5 + 700;
        step7 = step6 + 700;
        step8 = step7 + 1000;



        btnStep1 = (Button) findViewById(R.id.btn1);
        btnStep2 = (Button) findViewById(R.id.btn2);
        btnStep3 = (Button) findViewById(R.id.btn3);
        btnStep4 = (Button) findViewById(R.id.btn4);
        btnStep5 = (Button) findViewById(R.id.btn5);
        btnStep6 = (Button) findViewById(R.id.btn6);
        btnStep7 = (Button) findViewById(R.id.btn7);
        btnStep8 = (Button) findViewById(R.id.btn8);
        btnPlay = (Button) findViewById(R.id.btnPlay);

        btnStep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step1);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step2 - step1);
            }
        });

        btnStep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step2);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step3 - step2);




            }
        });

        btnStep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step3);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step4 - step3);

            }
        });

        btnStep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step4);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step5 - step4);
            }
        });
        btnStep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step5);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step6 - step5);            }
        });
        btnStep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step6);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step7 - step6);
            }
        });
        btnStep7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step7);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                }, step8 - step7);
            }
        });
        btnStep8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
                vvVideoView.seekTo(step8);
                vvVideoView.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        vvVideoView.pause();

                    }
                },  1000);
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvVideoView.start();
            }
        });
    }
}
