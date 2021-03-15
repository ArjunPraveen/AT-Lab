package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button b2 = (Button)findViewById(R.id.button2);
        //Toast.makeText(this, String.valueOf(((ColorDrawable)b2.getBackground()).getColor()), Toast.LENGTH_SHORT).show();
    }

    public void clickHandler(View v){
        Button b = (Button)findViewById(v.getId());
        //b.setBackgroundColor(Color.BLACK);
        //int color = ((ColorDrawable)b.getBackground()).getColor();
        Drawable colorCode = b.getBackground();
        ConstraintLayout cur = (ConstraintLayout)findViewById(R.id.layout);
        cur.setBackground(colorCode);
        //Toast.makeText(this, String.valueOf(colorCode), Toast.LENGTH_SHORT).show();
    }
}