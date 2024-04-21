package com.example.inkptati_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class InputKP extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_kp);

        Button buttonDetail = findViewById(R.id.buttonDetail);


        buttonDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(InputKP.this, DetailKP.class);
                startActivity(detail);


                ImageView imageViewUser = findViewById(R.id.imageViewUser);
                TextView textViewNama = findViewById(R.id.textViewNama);
                TextView textViewNIM = findViewById(R.id.textViewNIM);



                mahasiswa mhs1 = new mahasiswa(R.drawable.user, "Muhammad Aditya", "12250111013", "Judul Tugas Akhir", "Semester 8");



                imageViewUser.setImageResource(mhs1.getIconuser());
                textViewNama.setText(mhs1.getNama());
                textViewNIM.setText(mhs1.getNim());


            }
        });

    }
}