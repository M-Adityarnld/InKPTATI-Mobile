package com.example.inkptati_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InputTA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_ta);

        Button buttonDetail = findViewById(R.id.buttonDetail);
        buttonDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(InputTA.this, DetailTA.class);
                startActivity(detail);


        TextView textViewNama = findViewById(R.id.textViewNama);
        TextView textViewNIM = findViewById(R.id.textViewNIM);


        mahasiswa mhs1 = new mahasiswa(R.drawable.user, "Ahmad Kurniawan", "12250111013", "Judul Tugas Akhir", "Semester 8");

        ;
        textViewNama.setText(mhs1.getNama());
        textViewNIM.setText(mhs1.getNim());



    }


    });

}

}