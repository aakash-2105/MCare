package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.loginpage.extraNAME";
    EditText email;
    TextView skipfornow;

    Button signup_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button;
       Button button1;
//    EditText name;

       button1=findViewById(R.id.login);

        skipfornow=findViewById(R.id.skip);
        email = findViewById(R.id.email);
        signup_btn=findViewById(R.id.signup_btn);
        getSupportActionBar().hide();


       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String mail = email.getText().toString();
               Log.i("mail main act", mail+"");
               Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
               intent.putExtra("email", mail);
               startActivity(intent);


           }
       });
       skipfornow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent1 = new Intent(MainActivity.this, HomeScreen.class);
               Toast.makeText(MainActivity.this, "Welcome.....Kindly login!", Toast.LENGTH_LONG).show();
               startActivity(intent1);
           }
       });

       signup_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent2 = new Intent(MainActivity.this, signup.class);
               startActivity(intent2);
           }
       });


    }
}