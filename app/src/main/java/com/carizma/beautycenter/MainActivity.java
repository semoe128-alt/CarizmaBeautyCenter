package com.carizma.beautycenter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMakeup, btnHair, btnNails, btnSkincare, btnWhatsApp, btnAbout, btnPrivacyPolicy;
    private MediaPlayer mediaPlayer; // لإضافة الموسيقى

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // تشغيل الموسيقى
        mediaPlayer = MediaPlayer.create(this, R.raw.calm_music); // ضع ملف calm_music.mp3 في res/raw
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        btnMakeup = findViewById(R.id.btnMakeup);
        btnHair = findViewById(R.id.btnHair);
        btnNails = findViewById(R.id.btnNails);
        btnSkincare = findViewById(R.id.btnSkincare);
        btnWhatsApp = findViewById(R.id.btnWhatsApp);
        btnAbout = findViewById(R.id.btnAbout);
        btnPrivacyPolicy = findViewById(R.id.btnPrivacyPolicy); // الزر الجديد

        // WhatsApp للحجز
        btnWhatsApp.setOnClickListener(v -> {
            String phoneNumber = "+201016048781"; // رقم الشركة
            String message = "مرحبا، أريد حجز موعد في Carizma Beauty";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message)));
            startActivity(intent);
        });

        // زر الانتقال إلى AboutActivity
        btnAbout.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AboutActivity.class)));

        // زر سياسة الخصوصية يفتح Activity داخل التطبيق
        btnPrivacyPolicy.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, PrivacyPolicyActivity.class));
        });

        // ربط أزرار الخدمات بالـ Activities
        btnMakeup.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MakeupActivity.class)));
        btnHair.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HairActivity.class)));
        btnNails.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, NailsActivity.class)));
        btnSkincare.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SkincareActivity.class)));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}
