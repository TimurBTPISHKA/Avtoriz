package com.example.avtoriz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Internet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);
    }

    public void da(View view) {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()){
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Подключение есть \n Добро пожаловать!", Toast.LENGTH_LONG);
            toast1.show();

        } else{
            Toast toast2 = Toast.makeText(getApplicationContext(),
                    "Нет подключения\n Разрешите доступ и повторите попытку",Toast.LENGTH_LONG);
            toast2.show();
        }
    }
};

