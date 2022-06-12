package com.tutorials.samplenefunnel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.mainLayout);

        Intent intent = new Intent(this, LoginActivity.class);
        layout.setOnClickListener(view -> {
            startActivity(intent);
            finish();
        });
    }
}