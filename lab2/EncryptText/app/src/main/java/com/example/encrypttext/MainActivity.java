package com.example.encrypttext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameET=(EditText) findViewById((R.id.editText));
        Button b1=(Button) findViewById((R.id.button));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=nameET.getText().toString();
                StringBuilder s1=new StringBuilder();
                for(int i=0;i<s.length();i++)
                {
                    int a=(char)s.charAt(i);
                    a=a+1;
                    if(a==123)
                    {
                        a=97;
                    }
                    else if(a==91)
                    {
                        a=65;
                    }
                    s1.append((char)a);
                }
                EditText restxt=(EditText) findViewById((R.id.encrypted));
                restxt.setText(s1.toString());
            }
        });
    }
}
