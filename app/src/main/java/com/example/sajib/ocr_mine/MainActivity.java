package com.example.sajib.ocr_mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button profile,topic,programming,scanner;
    public Button science_tech,developer,kids_corner,ebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile= findViewById(R.id.user);
        topic = findViewById(R.id.topics) ;
        programming = findViewById(R.id.programming) ;
        scanner = findViewById(R.id.scanner) ;
        science_tech = findViewById(R.id.science) ;
        ebook = findViewById(R.id.ebook) ;
        kids_corner = findViewById(R.id.kidscorner) ;
        developer  = findViewById(R.id.aboutus) ;

        profile.setOnClickListener(this);
        topic.setOnClickListener(this);
        programming.setOnClickListener(this);
        scanner.setOnClickListener(this);
        science_tech.setOnClickListener(this);
        developer.setOnClickListener(this);
        kids_corner.setOnClickListener(this);
        ebook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.user)
        {

        }
        else if(v.getId()==R.id.topics)
        {

        }
        else if(v.getId()==R.id.programming)
        {
            Intent intent=new Intent(this,Programming_Corner.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.scanner)
        {
            Intent intent=new Intent(this,Option_for_OCR.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.science)
        {
            Intent intent=new Intent(this,Science_Tech.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.ebook)
        {

        }
        else if(v.getId()==R.id.kidscorner)
        {
            Intent intent=new Intent(this,Kidscorner.class);
            startActivity(intent);
        }

        else if(v.getId()==R.id.aboutus)
        {
            Intent intent=new Intent(this,AboutDevelopers.class);
            startActivity(intent);
        }
    }
}

