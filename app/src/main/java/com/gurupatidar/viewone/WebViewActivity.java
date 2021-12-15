package com.gurupatidar.viewone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_activity);
        WebView webView = (WebView) findViewById(R.id.webview);
        String link;
        Intent intent=getIntent();
        link=intent.getStringExtra("link");
        webView.loadUrl(link);
    }
}