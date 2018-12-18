package com.example.tozi2001.synthesizer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.util.Log;
import android.view.View;


public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        mpE = MediaPlayer.create(this, R.raw.scalee);


    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.e (TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.e (TAG, "Button 2 Clicked");
        mpF.start();
    }

    public void onButton3Click(View v) {
        mpMC.seekTo(0);
        Log.e (TAG, "Button 3 Clicked");
        mpMC.start();
    }
}
