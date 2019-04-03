package com.example.sajib.ocr_mine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Programming_Corner extends AppCompatActivity implements View.OnClickListener {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming__corner);
        btn1=(Button)findViewById(R.id.hasan_wb);
        btn2=(Button)findViewById(R.id.how_code);
        btn3=(Button)findViewById(R.id.progkriya);
        btn4=(Button)findViewById(R.id.subeen);
        btn5=(Button)findViewById(R.id.fahim_web);
        btn6=(Button)findViewById(R.id.aninpaulblog);
        btn7=(Button)findViewById(R.id.shakil_blog);
        btn8=(Button)findViewById(R.id.sudip_blog);
        btn9=(Button)findViewById(R.id.shoshikka);
        btn10=(Button)findViewById(R.id.chorui_blog);
        btn11=(Button)findViewById(R.id.tanvir_blog);
        btn12=(Button)findViewById(R.id.dibakor);
        btn13=(Button)findViewById(R.id.subeen_youtube);
        btn14=(Button)findViewById(R.id.faiyaz_blog);
        btn15=(Button)findViewById(R.id.rezwan_arefin);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,webview1.class);
        if(v.getId()==R.id.how_code)
        {
            intent.putExtra("url","https://c.howtocode.com.bd/");
        } else if (v.getId()==R.id.hasan_wb) {
            intent.putExtra("url","https://hellohasan.com/");
        }
        else if(v.getId()==R.id.progkriya)
        {
            intent.putExtra("url","http://www.progkriya.org/gyan/");
        }
        else if(v.getId()==R.id.fahim_web)
        {
            intent.putExtra("url","https://sites.google.com/site/smilitude/");
        }
        else if(v.getId()==R.id.subeen)
        {
            intent.putExtra("url","http://subeen.com/");
        }
        else if(v.getId()==R.id.aninpaulblog)
        {
            intent.putExtra("url","https://anindyaspaul.com/blog/");
        }
        else if(v.getId()==R.id.shakil_blog)
        {
            intent.putExtra("url","http://shakilcompetitiveprogramming.blogspot.com/");
        }
        else if(v.getId()==R.id.sudip_blog)
        {
            intent.putExtra("url","https://returnzerooo.wordpress.com/");
        }
        else if(v.getId()==R.id.shoshikka)
        {
            intent.putExtra("url","http://shoshikkha.com/archives/");
        }
        else if(v.getId()==R.id.chorui_blog)
        {
            intent.putExtra("url","http://chorui12.blogspot.com/2012/05/blog-post.html");
        }
        else if(v.getId()==R.id.tanvir_blog)
        {
            intent.putExtra("url","https://tanvir002700.wordpress.com/");
        }
        else if(v.getId()==R.id.dibakor)
        {
            intent.putExtra("url","https://with.dibakar.me/category/programming/cppbn/oopbn/");
        }
        else if(v.getId()==R.id.subeen_youtube)
        {
            intent.putExtra("url","https://www.youtube.com/user/subeents/playlists");
        }
        else if(v.getId()==R.id.faiyaz_blog)
        {
            intent.putExtra("url","http://blog.faiyaz.info/");
        }
        else if(v.getId()==R.id.rezwan_arefin)
        {
            intent.putExtra("url","https://rezwanarefin01.github.io/");
        }


        startActivity(intent);
    }
}
