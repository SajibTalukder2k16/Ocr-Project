package com.example.sajib.ocr_mine;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class kids_corner_alphabet extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {

    private  Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z ;
    MediaPlayer alphabet ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_corner_alphabet);

        a = findViewById(R.id.a) ;
        b = findViewById(R.id.b) ;
        c = findViewById(R.id.c) ;
        d = findViewById(R.id.d) ;
        e = findViewById(R.id.e) ;
        f = findViewById(R.id.f) ;
        g = findViewById(R.id.g) ;
        h = findViewById(R.id.h) ;
        i = findViewById(R.id.i) ;
        j = findViewById(R.id.j) ;
        k = findViewById(R.id.k) ;
        l = findViewById(R.id.l) ;
        m = findViewById(R.id.m) ;
        n = findViewById(R.id.n) ;
        o = findViewById(R.id.o) ;
        p = findViewById(R.id.p) ;
        q = findViewById(R.id.q) ;
        r = findViewById(R.id.r) ;
        s = findViewById(R.id.s) ;
        t = findViewById(R.id.t) ;
        u = findViewById(R.id.u) ;
        v = findViewById(R.id.v) ;
        w = findViewById(R.id.w) ;
        x = findViewById(R.id.x) ;
        y = findViewById(R.id.y) ;
        z = findViewById(R.id.z) ;


        a.setOnLongClickListener(this);
        b.setOnLongClickListener(this);
        c.setOnLongClickListener(this);
        d.setOnLongClickListener(this);
        e.setOnLongClickListener(this);
        f.setOnLongClickListener(this);
        g.setOnLongClickListener(this);
        h.setOnLongClickListener(this);
        i.setOnLongClickListener(this);
        j.setOnLongClickListener(this);
        k.setOnLongClickListener(this);
        l.setOnLongClickListener(this);
        m.setOnLongClickListener(this);
        n.setOnLongClickListener(this);
        o.setOnLongClickListener(this);
        p.setOnLongClickListener(this);
        q.setOnLongClickListener(this);
        r.setOnLongClickListener(this);
        s.setOnLongClickListener(this);
        t.setOnLongClickListener(this);
        u.setOnLongClickListener(this);
        v.setOnLongClickListener(this);
        w.setOnLongClickListener(this);
        x.setOnLongClickListener(this);
        y.setOnLongClickListener(this);
        z.setOnLongClickListener(this);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.a)
        {
            alphabet = MediaPlayer.create(this,R.raw.a_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.b)
        {
            alphabet = MediaPlayer.create(this,R.raw.b_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.c)
        {
            alphabet = MediaPlayer.create(this,R.raw.c_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.d)
        {
            alphabet = MediaPlayer.create(this,R.raw.d_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.e)
        {
            alphabet = MediaPlayer.create(this,R.raw.e_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.f)
        {
            alphabet = MediaPlayer.create(this,R.raw.f_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.g)
        {
            alphabet = MediaPlayer.create(this,R.raw.g_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.h)
        {
            alphabet = MediaPlayer.create(this,R.raw.h_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.i)
        {
            alphabet = MediaPlayer.create(this,R.raw.i_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.j)
        {
            alphabet = MediaPlayer.create(this,R.raw.j_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.k)
        {
            alphabet = MediaPlayer.create(this,R.raw.k_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.l)
        {
            alphabet = MediaPlayer.create(this,R.raw.l_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.m)
        {
            alphabet = MediaPlayer.create(this,R.raw.m_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.n)
        {
            alphabet = MediaPlayer.create(this,R.raw.n_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.o)
        {
            alphabet = MediaPlayer.create(this,R.raw.o_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.p)
        {
            alphabet = MediaPlayer.create(this,R.raw.p_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.q)
        {
            alphabet = MediaPlayer.create(this,R.raw.q_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.r)
        {
            alphabet = MediaPlayer.create(this,R.raw.r_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.s)
        {
            alphabet = MediaPlayer.create(this,R.raw.s_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.t)
        {
            alphabet = MediaPlayer.create(this,R.raw.t_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.u)
        {
            alphabet = MediaPlayer.create(this,R.raw.u_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.v)
        {
            alphabet = MediaPlayer.create(this,R.raw.v_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.w)
        {
            alphabet = MediaPlayer.create(this,R.raw.w_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.x)
        {
            alphabet = MediaPlayer.create(this,R.raw.x_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.y)
        {
            alphabet = MediaPlayer.create(this,R.raw.y_l) ;
            alphabet.start();
        }
        else if(v.getId()==R.id.z)
        {
            alphabet = MediaPlayer.create(this,R.raw.z_l) ;
            alphabet.start();
        }
    }

    @Override
    public boolean onLongClick(View v) {

        LayoutInflater inflater = getLayoutInflater() ;
        View customview ;

        if(v.getId()==R.id.a)
        {
            customview = inflater.inflate(R.layout.toast_a, (ViewGroup) findViewById(R.id.aforapple)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.a) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.b)
        {
            customview = inflater.inflate(R.layout.toast_b, (ViewGroup) findViewById(R.id.bfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.b) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.c)
        {
            customview = inflater.inflate(R.layout.toast_c, (ViewGroup) findViewById(R.id.cfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.c) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.d)
        {
            customview = inflater.inflate(R.layout.toast_d, (ViewGroup) findViewById(R.id.dfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.d) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.e)
        {
            customview = inflater.inflate(R.layout.toast_e, (ViewGroup) findViewById(R.id.efor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.e) ;
            alphabet.start();

            return true ;
        }
        else if(v.getId()==R.id.f)
        {
            customview = inflater.inflate(R.layout.toast_f, (ViewGroup) findViewById(R.id.ffor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.f) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.g)
        {
            customview = inflater.inflate(R.layout.toast_g, (ViewGroup) findViewById(R.id.gfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.g) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.h)
        {
            customview = inflater.inflate(R.layout.toast_h, (ViewGroup) findViewById(R.id.hfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.h) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.i)
        {
            customview = inflater.inflate(R.layout.toast_i, (ViewGroup) findViewById(R.id.ifor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.i) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.j)
        {
            customview = inflater.inflate(R.layout.toast_j, (ViewGroup) findViewById(R.id.jfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.j) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.k)
        {
            customview = inflater.inflate(R.layout.toast_k, (ViewGroup) findViewById(R.id.kfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.k) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.l)
        {
            customview = inflater.inflate(R.layout.toast_l, (ViewGroup) findViewById(R.id.lfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.l) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.m)
        {
            customview = inflater.inflate(R.layout.toast_m, (ViewGroup) findViewById(R.id.mfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.m) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.n)
        {
            customview = inflater.inflate(R.layout.toast_n, (ViewGroup) findViewById(R.id.nfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.n) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.o)
        {
            customview = inflater.inflate(R.layout.toast_o, (ViewGroup) findViewById(R.id.ofor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.o) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.p)
        {
            customview = inflater.inflate(R.layout.toast_p, (ViewGroup) findViewById(R.id.pfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.p) ;
            alphabet.start();

            return true ;
        }
        else if(v.getId()==R.id.q)
        {
            customview = inflater.inflate(R.layout.toast_q, (ViewGroup) findViewById(R.id.qfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.q) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.r)
        {
            customview = inflater.inflate(R.layout.toast_r, (ViewGroup) findViewById(R.id.rfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.r) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.s)
        {
            customview = inflater.inflate(R.layout.toast_s, (ViewGroup) findViewById(R.id.sfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.s) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.t)
        {
            customview = inflater.inflate(R.layout.toast_t, (ViewGroup) findViewById(R.id.tfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.t) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.u)
        {
            customview = inflater.inflate(R.layout.toast_u, (ViewGroup) findViewById(R.id.ufor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.u) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.v)
        {
            customview = inflater.inflate(R.layout.toast_v, (ViewGroup) findViewById(R.id.vfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.v) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.w)
        {
            customview = inflater.inflate(R.layout.toast_w, (ViewGroup) findViewById(R.id.wfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.w) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.x)
        {
            customview = inflater.inflate(R.layout.toast_x, (ViewGroup) findViewById(R.id.xfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.x) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.y)
        {
            customview = inflater.inflate(R.layout.toast_y, (ViewGroup) findViewById(R.id.yfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.y) ;
            alphabet.start();

            return  true ;
        }
        else if(v.getId()==R.id.z)
        {
            customview = inflater.inflate(R.layout.toast_z, (ViewGroup) findViewById(R.id.zfor)) ;
            Toast toast = new Toast(kids_corner_alphabet.this) ;
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);

            toast.setView(customview);
            toast.show();

            alphabet = MediaPlayer.create(this,R.raw.z) ;
            alphabet.start();

            return  true ;
        }
        return false;
    }
}