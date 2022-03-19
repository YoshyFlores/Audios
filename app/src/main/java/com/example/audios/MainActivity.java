package com.example.audios;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView texto=findViewById(R.id.txtHimno);
        texto.setText("HIMNO UGB\n" +
                "Somos fuerza de una gran nación,\n" +
                "forjadores de unidad,\n" +
                "nuestras mentes, nuestro corazón\n" +
                "van en busca de verdad.\n" +
                "Con espíritu trabajador,\n" +
                "sin descanso hasta triunfar\n" +
                "lucharemos siempre con valor\n" +
                "por la paz reconquistar.\n" +
                "Nuestro hogar, nuestro orgullo es Oriente,\n" +
                "nuestra estrella es inmortal y en Barrios aún sigue latente\n" +
                "el progreso cual noble ideal.\n" +
                "Universidad Gerardo Barrios\n" +
                "formación profesional\n" +
                "que transforma y educa con fe en Dios\n" +
                "el futuro nacional.\n" +
                "Nuestro hogar, nuestro orgullo es Oriente,\n" +
                "nuestra estrella es inmortal\n" +
                "y en Barrios aún sigue latente\n" +
                "el progreso cual noble ideal.");

        MediaPlayer mp= MediaPlayer.create(getApplicationContext(), R.raw.himno_ugb);
    }
}