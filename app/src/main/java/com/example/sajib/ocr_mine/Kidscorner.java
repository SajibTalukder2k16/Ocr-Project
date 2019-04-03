package com.example.sajib.ocr_mine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kidscorner extends Activity implements View.OnClickListener{

    private ImageButton bangla,english,math,story ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidscorner);

        bangla = findViewById(R.id.bangla) ;
        english = findViewById(R.id.english) ;
        math = findViewById(R.id.math) ;
        story = findViewById(R.id.story) ;

        bangla.setOnClickListener(this);
        english.setOnClickListener(this) ;
        math.setOnClickListener(this);
        story.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bangla)
        {
            Intent intent = new Intent(Kidscorner.this,kids_corner_banglamenu.class) ;
            startActivity(intent);
        }
        else if(v.getId()==R.id.english)
        {
            Intent intent = new Intent(Kidscorner.this,kids_corner_englishmenu.class) ;
            startActivity(intent);
        }
        else if(v.getId()==R.id.math)
        {

        }
        else if(v.getId()==R.id.story)
        {

        }

    }
}
