package com.tutorials.samplenefunnel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText inputID;
    EditText inputPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputID = findViewById(R.id.inputID);
        inputPW = findViewById(R.id.inputPW);
        btnLogin = findViewById(R.id.btnLogin);
        Intent intent = new Intent(this, ListActivity.class);

        // 로그인 유지상태를 구현해야함
        if (SaveSharedPreference.getUserID(LoginActivity.this).length()!=0) {
            startActivity(intent);
        } else {
            btnLogin.setOnClickListener(view -> {

                String id = inputID.getText().toString();
                String pw = inputPW.getText().toString();

                // 로그인 테스트를 위한 하드코딩
                if (id.equals("admin") && pw.equals("1234")) {
//                    intent.putExtra("id", id);
//                    intent.putExtra("pw", pw);
                    Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(this, "로그인 실패", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}