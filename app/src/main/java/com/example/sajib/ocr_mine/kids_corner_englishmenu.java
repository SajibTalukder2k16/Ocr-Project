package com.example.sajib.ocr_mine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kids_corner_englishmenu extends Activity implements View.OnClickListener {

    private Button alphabet,rhymes ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_corner_englishmenu);

        alphabet = findViewById(R.id.alphabet) ;
        rhymes = findViewById(R.id.rhymes) ;

        alphabet.setOnClickListener(this);
        rhymes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.alphabet)
        {
            Intent intent = new Intent(kids_corner_englishmenu.this,kids_corner_alphabet.class) ;
            startActivity(intent);
        }
        else if (v.getId()==R.id.rhymes)
        {
            Intent intent = new Intent(kids_corner_englishmenu.this,kids_corner_rhyme.class) ;
            startActivity(intent);
        }

    }
}
