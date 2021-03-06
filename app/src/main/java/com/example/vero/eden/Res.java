package com.example.vero.eden;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Res extends AppCompatActivity {
    private TextView resultText;
    private LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        String overallM = getIntent().getStringExtra(MainActivity.CO2_KEY);
        resultText = new TextView(Res.this);
        resultText.setText(overallM);
        resultText.setTextSize(18);
        resultText.setTextColor(Color.BLACK);
        resultText.setGravity(Gravity.CENTER_VERTICAL);
        mLayout = (LinearLayout) findViewById(R.id.gpaLayout);
        mLayout.addView(resultText);
    }
}
