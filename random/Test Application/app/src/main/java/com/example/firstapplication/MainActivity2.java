package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String username = intent.getExtras().getString("username","");
        String emailId = intent.getExtras().getString("emailId","");
        String mobile = intent.getExtras().getString("mobile","");
        EditText name = (EditText) findViewById(R.id.Name);
        name.setText(username);
        EditText email = (EditText) findViewById(R.id.Email);
        email.setText(emailId);
        EditText phone = (EditText) findViewById(R.id.Mobile);
        phone.setText(mobile);
    }
}