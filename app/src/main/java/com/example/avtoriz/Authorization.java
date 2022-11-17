package com.example.avtoriz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.AutofillService;
import android.view.View;

public class Authorization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

    }

    public void reg(View view) {
        Intent intent;
        intent = new Intent(Authorization.this, Registration.class);
        startActivity(intent);
    }

    public void vhod(View view) {
        Intent intent;
        intent = new Intent(Authorization.this, Internet.class);
        startActivity(intent);
    }
}