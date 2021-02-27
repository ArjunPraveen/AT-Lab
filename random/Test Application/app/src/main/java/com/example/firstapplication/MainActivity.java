package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view){
        Log.i("this", "btnClick: message"); //equivalent of console.log
        EditText usernameInput = (EditText)findViewById(R.id.username);
        String username = usernameInput.getText().toString();
        EditText emailIdInput = (EditText)findViewById(R.id.emailid);
        String emailId = emailIdInput.getText().toString();
        EditText numberInput = (EditText)findViewById(R.id.number);
        String mobile = numberInput.getText().toString();
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        Log.i("this", username);
        if(username.matches("")|| emailId.matches("") || mobile.matches("")){
            Toast.makeText(this, "Fill in all the details", Toast.LENGTH_SHORT).show();
            return;
        }
        if(checkBox.isChecked() == false){
            Toast.makeText(this, "Agree with terms and conditions", Toast.LENGTH_SHORT).show();
            return;
        }
        String expression = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/";
        if(!Patterns.EMAIL_ADDRESS.matcher(emailId).matches()){
            Toast.makeText(this, "Enter valid email id", Toast.LENGTH_SHORT).show();
            return;
        }
        if(mobile.length() !=10){
            Toast.makeText(this, "Enter valid mobile number", Toast.LENGTH_SHORT).show();
            return;
        }
        openActivity2();
    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        EditText usernameInput = (EditText)findViewById(R.id.username);
        String username = usernameInput.getText().toString();
        intent.putExtra("username", username);
        EditText emailIdInput = (EditText)findViewById(R.id.emailid);
        String emailId = emailIdInput.getText().toString();
        intent.putExtra("emailId", emailId);
        EditText numberInput = (EditText)findViewById(R.id.number);
        String mobile = numberInput.getText().toString();
        intent.putExtra("mobile", mobile);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}