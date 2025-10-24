package com.carizma.beautycenter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    Button btnCall, btnWhatsApp;
    TextView tvAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tvAbout = findViewById(R.id.tvAbout);
        btnCall = findViewById(R.id.btnCall);
        btnWhatsApp = findViewById(R.id.btnWhatsApp);

        tvAbout.setText("Carizma Beauty Center\nنقدم أفضل خدمات تصفيف الشعر والعناية به، باستخدام أحدث المنتجات وأفضل الفنيين لضمان مظهر رائع وصحي دائمًا.");

        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+201016048781"));
            startActivity(intent);
        });

        btnWhatsApp.setOnClickListener(v -> {
            String phoneNumber = "+201016048781";
            String message = "مرحبا، أريد التواصل مع Carizma Beauty";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message)));
            startActivity(intent);
        });
    }
}
