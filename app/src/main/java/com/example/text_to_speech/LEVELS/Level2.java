package com.example.text_to_speech.LEVELS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.text_to_speech.VowelsWord.Aclass;
import com.example.text_to_speech.R;
import com.example.text_to_speech.VowelsWord.Yclass;
import com.example.text_to_speech.VowelsWord.wawLetter;

public class Level2 extends AppCompatActivity {

    Button alef , waw , ya2; // calling the elements from the Level2 layout we used

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        alef = findViewById(R.id.alef);
        waw = findViewById(R.id.waw);    //Defin each element by thier IDs
        ya2 = findViewById(R.id.yaa);

        alef.setOnClickListener(v -> {
            // if button named alef clicked, jump from Level2 class to Aclass
            startActivity(new Intent(Level2.this, Aclass.class));
        });

        waw.setOnClickListener(v -> {
            startActivity(new Intent(Level2.this, wawLetter.class));
        });

        ya2.setOnClickListener(v -> {
            startActivity(new Intent(Level2.this, Yclass.class));
        });
    }
}