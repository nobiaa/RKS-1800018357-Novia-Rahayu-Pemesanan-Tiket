package com.example.bismillah_rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pesawat(View view) {

        Intent intent = new Intent(MainActivity.this, tiket.class);
    }

    public void tiket(View view) {
        Intent intent = new Intent(MainActivity.this, daftar.class);
    }

    public void pesan(View view) {
        Intent intent = new Intent(MainActivity.this, data.class);
    }

    public void data(View view) {
        Intent intent = new Intent(MainActivity.this, bayar.class);
    }

    public void bayar(View view) {
        Intent intent = new Intent(MainActivity.this, email.class);
    }





}