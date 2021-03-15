package com.example.feedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name=(EditText) findViewById(R.id.nameEditText);
        EditText regno=(EditText) findViewById(R.id.regnoEditText);
        Button submit=(Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c=0;
                if(name.getText().toString().length()==0||regno.getText().toString().length()==0)
                {
                    c=1;
                    Toast.makeText(getApplicationContext(),"Please Enter All Details", Toast.LENGTH_LONG).show();
                }
                RadioGroup rg1=(RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg2=(RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rg3=(RadioGroup) findViewById(R.id.radioGroup3);
                RadioGroup rg4=(RadioGroup) findViewById(R.id.radioGroup4);
                RadioGroup rg5=(RadioGroup) findViewById(R.id.radioGroup5);

                if(rg1.getCheckedRadioButtonId()==-1||rg2.getCheckedRadioButtonId()==-1||rg3.getCheckedRadioButtonId()==-1||rg4.getCheckedRadioButtonId()==-1||rg5.getCheckedRadioButtonId()==-1)
                {
                    c=1;
                    Toast.makeText(getApplicationContext(),"Please Enter All Details", Toast.LENGTH_LONG).show();
                }
                if(c==0)
                {
                    Toast.makeText(getApplicationContext(),"Thank you for the feedback!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}