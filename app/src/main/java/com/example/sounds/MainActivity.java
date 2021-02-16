package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button PlayButton, PlayButton1;
    private MediaPlayer ButtonSound, ButtonSound1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayButton = (Button)findViewById(R.id.PlayButton);
        PlayButton1 = (Button)findViewById(R.id.PlayButton1);

        ButtonSound = MediaPlayer.create(this, R.raw.chto);
        ButtonSound1 = MediaPlayer.create(this, R.raw.chtoto);

        ButtonClick ();
    }

    public void ButtonClick() {
        PlayButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        soundPlay (ButtonSound);
                    }
                }
        );

        PlayButton1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        soundPlay (ButtonSound1);
                    }
                }
        );
    }

    public void soundPlay(MediaPlayer Sound){
        Sound.start();

    }

}