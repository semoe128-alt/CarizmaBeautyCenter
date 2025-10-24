package com.carizma.beautycenter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PrivacyPolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        TextView tvPolicy = findViewById(R.id.tvPolicy);
        TextView tvPolicyTitle = findViewById(R.id.tvPolicyTitle);

        // عنوان الصفحة
        if (tvPolicyTitle != null) {
            tvPolicyTitle.setText("سياسة الخصوصية");
        }

        // نص سياسة الخصوصية
        String policyText = "سياسة الخصوصية\n" +
                "تاريخ السريان: 18-10-2025\n\n" +
                "مرحبًا بكم في Carizma Beauty Center\n!\n" +
                "خصوصيتكم تهمنا للغاية. توضح سياسة الخصوصية هذه كيفية التعامل مع معلوماتكم عند استخدامكم لتطبيقنا. نحن ملتزمون بحماية بياناتكم وضمان تجربة آمنة وشفافة.\n\n" +
                "١. المعلومات التي نجمعها\n" +
                "صُممت Carizma Beauty Center\n لتوفير تجربة حجز سلسة وآمنة.\n" +
                "يتصل التطبيق بالإنترنت فقط لإرسال واستقبال طلبات الحجز.\n" +
                "لا نجمع أو نخزن أو نشارك أي معلومات شخصية، مثل الاسم أو البريد الإلكتروني أو رقم الهاتف، إلا إذا قدمها المستخدم طوعًا.\n" +
                "لا نتتبع نشاط المستخدم داخل التطبيق، ولا نجمع بيانات الجهاز أو الموقع.\n\n" +
                "٢. الأذونات المستخدمة\n" +
                "يتطلب Carizma Beauty Center\n اتصالاً بالإنترنت فقط لتبادل بيانات الحجز.\n" +
                "لا نطلب الوصول إلى الكاميرا أو الميكروفون أو الصور أو الملفات.\n" +
                "لا نطلب أي أذونات غير ضرورية.\n\n" +
                "٣. استخدام خدمات الجهات الخارجية\n" +
                "لا يستخدم التطبيق أي خدمات تحليل أو تتبع أو إعلانات.\n" +
                "لا توجد أدوات تتبع مثل Google Analytics أو Firebase.\n\n" +
                "٤. أمان البيانات\n" +
                "تُعالج بيانات الحجز بأمان عبر اتصال مشفر.\n" +
                "لا تتم مشاركة أي بيانات مع أطراف ثالثة إلا لمعالجة الطلب.\n" +
                "نطبق تدابير تقنية وتنظيمية لحماية بيانات المستخدم.\n\n" +
                "٥. خصوصية الأطفال\n" +
                "التطبيق غير مخصص للأطفال دون 13 عامًا، ولا يتم جمع أي بيانات تخصهم.\n" +
                "في حال اكتشاف أي بيانات لطفل، تُحذف فورًا.\n\n" +
                "٦. التغييرات على هذه السياسة\n" +
                "قد يتم تعديل هذه السياسة من وقت لآخر، وسيتم تحديث تاريخ السريان وفقًا لذلك.\n\n" +
                "٧. تواصل معنا\n" +
                "للاستفسارات، يُرجى التواصل عبر:\n\n" +
                "البريد الإلكتروني: mohamoudhamdy46@gmail.com\n" +
                "واتساب: +201016048781";

        tvPolicy.setText(policyText);
    }
}
