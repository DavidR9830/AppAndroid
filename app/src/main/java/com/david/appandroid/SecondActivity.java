package com.david.appandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayTextView = findViewById(R.id.displayTextView);

        // Obtener los datos del intent
        String username = getIntent().getStringExtra("username");
        String name = getIntent().getStringExtra("name");

        // Mostrar los datos en pantalla
        displayTextView.setText("Bienvenido, " + name  +"("+username+")");
    }
}