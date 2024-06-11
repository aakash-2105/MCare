package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

public class listmed extends AppCompatActivity {

EditText m_date, expiry;
    int year, month, day;
    ImageButton camera_open;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmed);
        Calendar calendar=Calendar.getInstance();
        m_date=findViewById(R.id.datee);
        expiry=findViewById(R.id.expiry);
        camera_open = findViewById(R.id.camera_open);
        m_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 int year = calendar.get(Calendar.YEAR);
                 int month = calendar.get(Calendar.MONTH);
                 int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(listmed.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        String date = i2 + "-" + (i1 + 1) + "-" + i;

                        m_date.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        expiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                year=calendar.get(Calendar.YEAR);
                month=calendar.get(Calendar.MONTH);
                day=calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(listmed.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        String date = i2 + "-" + (i1 + 1) + "-" + i;

                        expiry.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        camera_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle("List your medicines");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.capsule_marine)));

    }
}
