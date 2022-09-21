package com.example.belajaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tebak_kelahiran extends AppCompatActivity {
    private EditText tahunLahirInput;
    private TextView ouputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_kelahiran);

        tahunLahirInput = findViewById(R.id.input_tahun);
        ouputText = findViewById(R.id.text_output);

    }

    public void handleSubmit(View view) {

        try {
            int tahunLahir = Integer.parseInt(tahunLahirInput.getText().toString());
            if(tahunLahir>=1946 && tahunLahir<=1964){
                ouputText.setText("Generasi Baby Boomers");
            } else if(tahunLahir>=1965 && tahunLahir<=1980) {
                ouputText.setText("Generasi X");
            } else if(tahunLahir>=1981 && tahunLahir<=1994){
                ouputText.setText("Generasi Y/Milenial");
            } else if(tahunLahir>=1995 && tahunLahir<=2010){
                ouputText.setText("Generasi Z");
            } else if(tahunLahir>=1995 && tahunLahir<=2010){
                ouputText.setText("Generasi Alpha");
            } else {
                ouputText.setText("Out of range");
            }

        } catch(NumberFormatException nfe) {
            ouputText.setText("null");
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        }
    }
}