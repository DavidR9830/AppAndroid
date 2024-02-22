package com.david.appandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String Tag = "Prueba";

    private EditText usernameEditText, nameEditText;
    private Button registerButton, button1, button2;
    private TextView statusTextView, buttonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusTextView = findViewById(R.id.statusTextView);
        buttonText = findViewById(R.id.buttonText);
        usernameEditText = findViewById(R.id.usernameEditText);
        nameEditText = findViewById(R.id.nameEditText);
        registerButton = findViewById(R.id.registerButton);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonText.setText("Presioné Button 1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonText.setText("Presioné Button 2");
            }
        });



        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String name = nameEditText.getText().toString();


                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });




    }
// Metodos ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"Estoy en onStart");
        statusTextView.setText(statusTextView.getText().toString() + ": Estoy en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "Estoy en onResume");
        statusTextView.setText(statusTextView.getText().toString() + "Estoy en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "Estoy en onPause");
        statusTextView.setText(statusTextView.getText().toString() + "Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "Estoy en onStop");
        statusTextView.setText(statusTextView.getText().toString() + "Estoy en onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "Estoy en onRestart");
        statusTextView.setText(statusTextView.getText().toString() + "Estoy en onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "Estoy en onDestroy");
        statusTextView.setText(statusTextView.getText().toString() + "Estoy en onDestroy");
    }

}