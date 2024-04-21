package com.example.inkptati_mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.InputType;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button loginButton = findViewById(R.id.loginButton);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        ImageButton showPasswordButton = findViewById(R.id.showPasswordButton);
        TextView forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                redirectToHomePage();
            }
        });

        showPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (passwordEditText.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {

                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                    showPasswordButton.setImageResource(R.drawable.open_eye);
                } else {

                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

                    showPasswordButton.setImageResource(R.drawable.eye_slash_solid);
                }

                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });


        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect ke halaman lupa password
                redirectToLupasandi();
            }
        });
    }



    private void redirectToHomePage() {

        Intent home = new Intent(MainActivity.this, Homepage.class);
        startActivity(home);

        finish();
    }



    private void redirectToLupasandi() {

        Intent lupa = new Intent(MainActivity.this, Lupasandi.class);
        startActivity(lupa);
    }






}