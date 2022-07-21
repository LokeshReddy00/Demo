package com.buddies.class1demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button send,rec,show;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.button);
        rec = findViewById(R.id.button2);
        text = findViewById(R.id.userEntry);
        show = findViewById(R.id.show);

        send.setOnClickListener(view -> {
//                To show Message ==  Sent! its our first Class Data (String)
            Toast.makeText(MainActivity.this, "Sent! its our first Class Data", Toast.LENGTH_SHORT).show();
        });

        rec.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Rec! the data of First Class", Toast.LENGTH_SHORT).show());

        show.setOnClickListener(view -> Toast.makeText(MainActivity.this, text.getText().toString().replace("h","b"), Toast.LENGTH_SHORT).show());

    }
}