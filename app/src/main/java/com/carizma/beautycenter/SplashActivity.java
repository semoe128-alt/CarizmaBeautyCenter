package com.carizma.beautycenter;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progressStatus = 0;
    private Handler handler = new Handler();
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.progressBar);

        // تشغيل الموسيقى
        mediaPlayer = MediaPlayer.create(this, R.raw.calm_music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        // تحديث شريط التحميل بحيث يستغرق 20 ثانية
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    progressStatus++;

                    try {
                        Thread.sleep(200); // كل 200ms يزيد 1%
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    handler.post(() -> progressBar.setProgress(progressStatus));
                }

                handler.post(() -> {
                    mediaPlayer.stop();
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                });
            }
        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}
