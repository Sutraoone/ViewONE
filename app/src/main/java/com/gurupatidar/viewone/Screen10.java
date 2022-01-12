package com.gurupatidar.viewone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Screen10 extends AppCompatActivity {
    long time;
    WebView webView,webView2,webView3,webView4,webView5,webView6,webView7,webView8,webView9,webView10;
    String url,desk,flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen10);

        webView = (WebView) findViewById(R.id.webView);
        webView2=(WebView) findViewById(R.id.webView2);
        webView3=(WebView) findViewById(R.id.webView3);
        webView4=(WebView) findViewById(R.id.webView4);
        webView5=(WebView) findViewById(R.id.webView5);
        webView6=(WebView) findViewById(R.id.webView6);
        webView7=(WebView) findViewById(R.id.webView7);
        webView8=(WebView) findViewById(R.id.webView8);
        webView9=(WebView) findViewById(R.id.webView9);
        webView10=(WebView) findViewById(R.id.webView10);

        time=99999999999l;
        Intent intent10=getIntent();
        url=intent10.getStringExtra("url");
        desk=intent10.getStringExtra("desktop");
        flag=intent10.getStringExtra("flag");

        if(flag.equalsIgnoreCase("True"))
        {
            time=intent10.getLongExtra("time",100000l);
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
        // WebView3
        webView3.getSettings().setLoadsImagesAutomatically(true);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView3.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView3.getSettings().setLoadWithOverviewMode(true);
            webView3.getSettings().setUseWideViewPort(true);
            webView3.getSettings().setDomStorageEnabled(true);
            webView3.getSettings().setBuiltInZoomControls(true);
            webView3.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }

        webView4.getSettings().setLoadsImagesAutomatically(true);
        webView4.getSettings().setJavaScriptEnabled(true);
        webView4.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView4.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView4.getSettings().setLoadWithOverviewMode(true);
            webView4.getSettings().setUseWideViewPort(true);
            webView4.getSettings().setDomStorageEnabled(true);
            webView4.getSettings().setBuiltInZoomControls(true);
            webView4.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView5.getSettings().setLoadsImagesAutomatically(true);
        webView5.getSettings().setJavaScriptEnabled(true);
        webView5.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView5.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView5.getSettings().setLoadWithOverviewMode(true);
            webView5.getSettings().setUseWideViewPort(true);
            webView5.getSettings().setDomStorageEnabled(true);
            webView5.getSettings().setBuiltInZoomControls(true);
            webView5.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView6.getSettings().setLoadsImagesAutomatically(true);
        webView6.getSettings().setJavaScriptEnabled(true);
        webView6.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView6.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView6.getSettings().setLoadWithOverviewMode(true);
            webView6.getSettings().setUseWideViewPort(true);
            webView6.getSettings().setDomStorageEnabled(true);
            webView6.getSettings().setBuiltInZoomControls(true);
            webView6.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView7.getSettings().setLoadsImagesAutomatically(true);
        webView7.getSettings().setJavaScriptEnabled(true);
        webView7.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView7.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView7.getSettings().setLoadWithOverviewMode(true);
            webView7.getSettings().setUseWideViewPort(true);
            webView7.getSettings().setDomStorageEnabled(true);
            webView7.getSettings().setBuiltInZoomControls(true);
            webView7.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView8.getSettings().setLoadsImagesAutomatically(true);
        webView8.getSettings().setJavaScriptEnabled(true);
        webView8.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView8.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView8.getSettings().setLoadWithOverviewMode(true);
            webView8.getSettings().setUseWideViewPort(true);
            webView8.getSettings().setDomStorageEnabled(true);
            webView8.getSettings().setBuiltInZoomControls(true);
            webView8.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView9.getSettings().setLoadsImagesAutomatically(true);
        webView9.getSettings().setJavaScriptEnabled(true);
        webView9.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView9.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView9.getSettings().setLoadWithOverviewMode(true);
            webView9.getSettings().setUseWideViewPort(true);
            webView9.getSettings().setDomStorageEnabled(true);
            webView9.getSettings().setBuiltInZoomControls(true);
            webView9.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView10.getSettings().setLoadsImagesAutomatically(true);
        webView10.getSettings().setJavaScriptEnabled(true);
        webView10.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView10.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView10.getSettings().setLoadWithOverviewMode(true);
            webView10.getSettings().setUseWideViewPort(true);
            webView10.getSettings().setDomStorageEnabled(true);
            webView10.getSettings().setBuiltInZoomControls(true);
            webView10.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView.loadUrl(url);
        webView2.loadUrl(url);
        webView3.loadUrl(url);
        webView4.loadUrl(url);
        webView5.loadUrl(url);
        webView6.loadUrl(url);
        webView7.loadUrl(url);
        webView8.loadUrl(url);
        webView9.loadUrl(url);
        webView10.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
        webView2.setWebViewClient(new WebViewClient());
        webView3.setWebViewClient(new WebViewClient());
        webView4.setWebViewClient(new WebViewClient());
        webView5.setWebViewClient(new WebViewClient());
        webView6.setWebViewClient(new WebViewClient());
        webView7.setWebViewClient(new WebViewClient());
        webView8.setWebViewClient(new WebViewClient());
        webView9.setWebViewClient(new WebViewClient());
        webView10.setWebViewClient(new WebViewClient());
        content();
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
                webView3.loadUrl(url);
                webView4.loadUrl(url);
                webView5.loadUrl(url);
                webView6.loadUrl(url);
                webView7.loadUrl(url);
                webView8.loadUrl(url);
                webView9.loadUrl(url);
                webView10.loadUrl(url);
                webView.setWebViewClient(new WebViewClient());
                webView2.setWebViewClient(new WebViewClient());
                webView3.setWebViewClient(new WebViewClient());
                webView4.setWebViewClient(new WebViewClient());
                webView5.setWebViewClient(new WebViewClient());
                webView6.setWebViewClient(new WebViewClient());
                webView7.setWebViewClient(new WebViewClient());
                webView8.setWebViewClient(new WebViewClient());
                webView9.setWebViewClient(new WebViewClient());
                webView10.setWebViewClient(new WebViewClient());
            }
        };
        handler.postDelayed(runnable,time);
    }
}