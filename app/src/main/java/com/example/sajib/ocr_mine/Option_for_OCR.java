package com.example.sajib.ocr_mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option_for_OCR extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_for__ocr);
        b1=(Button)findViewById(R.id.id_camera_to_text);
        b2=(Button)findViewById(R.id.id_image_to_text);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.id_camera_to_text)
        {
            Intent intent=new Intent(this,OCR_acitivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.id_image_to_text)
        {
            Intent intent=new Intent(this,SampleTryOCR.class);
            startActivity(intent);
        }
    }
}
