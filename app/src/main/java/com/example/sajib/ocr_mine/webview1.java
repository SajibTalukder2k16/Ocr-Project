package com.example.sajib.ocr_mine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview1 extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);

        webView= (WebView) findViewById(R.id.id_for_wb1);
        WebSettings ws= webView.getSettings();
        ws.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String value=bundle.getString("url");
            webView.loadUrl(value);
        }
    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else
            super.onBackPressed();
    }
}
