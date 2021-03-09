package com.example.eval_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    public int c=1;
    public int guess = rand.nextInt(10);

    public void guessFunction(View view){
        if(c==1){
            rand = new Random();
            guess = rand.nextInt(10);
        }
        EditText num = (EditText)findViewById(R.id.number);
        String number =num.getText().toString();
        int i=Integer.parseInt(number);
        if(i==guess){
            Toast.makeText(this, "Correct guess", Toast.LENGTH_SHORT).show();
            c=1;
        }else if(i<guess){
            Toast.makeText(this, "Your guess is smaller than the expected number", Toast.LENGTH_SHORT).show();
            c=0;
        }else{
            Toast.makeText(this, "Your guess is greater than the expected number", Toast.LENGTH_SHORT).show();
            c=0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}