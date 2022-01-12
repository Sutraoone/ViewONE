package com.gurupatidar.viewone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    long time;
    WebView webView,webView2;
    String url,desk,flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_activity);
        webView = (WebView) findViewById(R.id.webView);
        webView2=(WebView) findViewById(R.id.webView2);

        time=99999999999l;
        Intent intent=getIntent();
        url=intent.getStringExtra("url");
        desk=intent.getStringExtra("desktop");
        flag=intent.getStringExtra("flag");

        if(flag.equalsIgnoreCase("True"))
        {
            time=intent.getLongExtra("time",100000l);
        }

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        // WEB View 2
        webView2.getSettings().setLoadsImagesAutomatically(true);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView2.getSettings().setLoadWithOverviewMode(true);
            webView2.getSettings().setUseWideViewPort(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setBuiltInZoomControls(true);
            webView2.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView.loadUrl(url);
        webView2.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
        webView2.setWebViewClient(new WebViewClient());

        content();
      }
    public void onBackPressed()
    {
        finish();
    }

    public void content()
      {
          reload(time);
      }

      public void reload(long time)
      {
          final Handler handler = new Handler();
          final Runnable runnable =new Runnable() {
              @Override
              public void run()
              {
                  content();
                  webView.loadUrl(url);
                  webView2.loadUrl(url);
                  webView.setWebViewClient(new WebViewClient());
                  webView2.setWebViewClient(new WebViewClient());
              }
          };
          handler.postDelayed(runnable,time);
      }

}
