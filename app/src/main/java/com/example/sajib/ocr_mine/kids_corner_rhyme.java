package com.example.sajib.ocr_mine;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kids_corner_rhyme extends Activity implements View.OnClickListener {
    private Button twin,john;
    MediaPlayer rhyme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_corner_rhyme);
        twin=(Button)findViewById(R.id.id_twinkle);
        john=(Button)findViewById(R.id.id_johny);
        twin.setOnClickListener(this);
        john.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.id_twinkle) {
            rhyme = MediaPlayer.create(this, R.raw.twinkle);
            rhyme.start();
        }
        else if(v.getId()==R.id.id_johny) {
            rhyme = MediaPlayer.create(this, R.raw.johny);
            rhyme.start();
        }
    }
    @Override
    public void onBackPressed() {
        rhyme.pause();
        super.onBackPressed();
    }
}
