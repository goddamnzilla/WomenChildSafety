package com.example.womenchildsafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPhoneNumber extends AppCompatActivity {
EditText registeredphonenumber;
Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_phone_number);
        registeredphonenumber = findViewById(R.id.registeredphonetonumber);
        btnsubmit = findViewById(R.id.btn_submit);
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // write all the data entered by the user in SharedPreference and apply
                Toast.makeText(RegisterPhoneNumber.this,"Phone number successfully registered!", Toast.LENGTH_LONG).show();
                myEdit.putLong("phoneto", Long.parseLong(registeredphonenumber.getText().toString()));
                myEdit.apply();}
        });
    }
}