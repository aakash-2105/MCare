package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {
    private EditText username;
    Button button;
    Button button1;
    Button button2;
    Button button3;

    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
//        username = (EditText) findViewById(R.id.email);
        email = getIntent().getStringExtra("email");
//        Toast.makeText(this, email + " ", Toast.LENGTH_SHORT).show();
//        Log.i("mail home act", email+"");

        Toast.makeText(this, "Welcome "+ email, Toast.LENGTH_SHORT).show();
        button=findViewById(R.id.lym);
        button1=findViewById(R.id.vam);
        button2=findViewById((R.id.gte));
        button3=findViewById(R.id.nadd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), listmed.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        getSupportActionBar().hide();
    }
}
