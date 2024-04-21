package com.example.inkptati_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.inkptati_mobile.InputKP;
import com.example.inkptati_mobile.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.menu_home) {
                    Toast.makeText(Homepage.this, "Menu Home Dipilih", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.inputKP) {
                    startActivity(new Intent(Homepage.this, InputKP.class));
                    Toast.makeText(Homepage.this, "Menu Input Nilai Dipilih", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.inputTA) {
                    startActivity(new Intent(Homepage.this, InputTA.class));
                    Toast.makeText(Homepage.this, "Menu Input Hasil Dipilih", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });








    }



}