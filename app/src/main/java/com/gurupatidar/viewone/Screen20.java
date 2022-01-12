package com.gurupatidar.viewone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Screen20 extends AppCompatActivity {
    long time;
    WebView webView,webView2,webView3,webView4,webView5,webView6,webView7,webView8,webView9,webView10,webView11,webView12
            ,webView13,webView14,webView15,webView16,webView17,webView18,webView19,webView20;
    String url,desk,flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen20);

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
        webView11=(WebView) findViewById(R.id.webView11);
        webView12=(WebView) findViewById(R.id.webView12);
        webView13=(WebView) findViewById(R.id.webView13);
        webView14=(WebView) findViewById(R.id.webView14);
        webView15=(WebView) findViewById(R.id.webView15);
        webView16=(WebView) findViewById(R.id.webView16);
        webView17=(WebView) findViewById(R.id.webView17);
        webView18=(WebView) findViewById(R.id.webView18);
        webView19=(WebView) findViewById(R.id.webView19);
        webView20=(WebView) findViewById(R.id.webView20);

        time=99999999999l;
        Intent intent20=getIntent();
        url=intent20.getStringExtra("url");
        desk=intent20.getStringExtra("desktop");
        flag=intent20.getStringExtra("flag");

        if(flag.equalsIgnoreCase("True"))
        {
            time=intent20.getLongExtra("time",100000l);
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

        webView11.getSettings().setLoadsImagesAutomatically(true);
        webView11.getSettings().setJavaScriptEnabled(true);
        webView11.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView11.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView11.getSettings().setLoadWithOverviewMode(true);
            webView11.getSettings().setUseWideViewPort(true);
            webView11.getSettings().setDomStorageEnabled(true);
            webView11.getSettings().setBuiltInZoomControls(true);
            webView11.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView12.getSettings().setLoadsImagesAutomatically(true);
        webView12.getSettings().setJavaScriptEnabled(true);
        webView12.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView12.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView12.getSettings().setLoadWithOverviewMode(true);
            webView12.getSettings().setUseWideViewPort(true);
            webView12.getSettings().setDomStorageEnabled(true);
            webView12.getSettings().setBuiltInZoomControls(true);
            webView12.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView13.getSettings().setLoadsImagesAutomatically(true);
        webView13.getSettings().setJavaScriptEnabled(true);
        webView13.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView13.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView13.getSettings().setLoadWithOverviewMode(true);
            webView13.getSettings().setUseWideViewPort(true);
            webView13.getSettings().setDomStorageEnabled(true);
            webView13.getSettings().setBuiltInZoomControls(true);
            webView13.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView14.getSettings().setLoadsImagesAutomatically(true);
        webView14.getSettings().setJavaScriptEnabled(true);
        webView14.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView14.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView14.getSettings().setLoadWithOverviewMode(true);
            webView14.getSettings().setUseWideViewPort(true);
            webView14.getSettings().setDomStorageEnabled(true);
            webView14.getSettings().setBuiltInZoomControls(true);
            webView14.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView15.getSettings().setLoadsImagesAutomatically(true);
        webView15.getSettings().setJavaScriptEnabled(true);
        webView15.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView15.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView15.getSettings().setLoadWithOverviewMode(true);
            webView15.getSettings().setUseWideViewPort(true);
            webView15.getSettings().setDomStorageEnabled(true);
            webView15.getSettings().setBuiltInZoomControls(true);
            webView15.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView16.getSettings().setLoadsImagesAutomatically(true);
        webView16.getSettings().setJavaScriptEnabled(true);
        webView16.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView16.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView16.getSettings().setLoadWithOverviewMode(true);
            webView16.getSettings().setUseWideViewPort(true);
            webView16.getSettings().setDomStorageEnabled(true);
            webView16.getSettings().setBuiltInZoomControls(true);
            webView16.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }

        webView17.getSettings().setLoadsImagesAutomatically(true);
        webView17.getSettings().setJavaScriptEnabled(true);
        webView17.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView17.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView17.getSettings().setLoadWithOverviewMode(true);
            webView17.getSettings().setUseWideViewPort(true);
            webView17.getSettings().setDomStorageEnabled(true);
            webView17.getSettings().setBuiltInZoomControls(true);
            webView17.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView18.getSettings().setLoadsImagesAutomatically(true);
        webView18.getSettings().setJavaScriptEnabled(true);
        webView18.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView18.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView18.getSettings().setLoadWithOverviewMode(true);
            webView18.getSettings().setUseWideViewPort(true);
            webView18.getSettings().setDomStorageEnabled(true);
            webView18.getSettings().setBuiltInZoomControls(true);
            webView18.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView19.getSettings().setLoadsImagesAutomatically(true);
        webView19.getSettings().setJavaScriptEnabled(true);
        webView19.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView19.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView19.getSettings().setLoadWithOverviewMode(true);
            webView19.getSettings().setUseWideViewPort(true);
            webView19.getSettings().setDomStorageEnabled(true);
            webView19.getSettings().setBuiltInZoomControls(true);
            webView19.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        }
        webView20.getSettings().setLoadsImagesAutomatically(true);
        webView20.getSettings().setJavaScriptEnabled(true);
        webView20.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);

        webView20.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if(desk.equalsIgnoreCase("true"))
        {
            webView20.getSettings().setLoadWithOverviewMode(true);
            webView20.getSettings().setUseWideViewPort(true);
            webView20.getSettings().setDomStorageEnabled(true);
            webView20.getSettings().setBuiltInZoomControls(true);
            webView20.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
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
        webView11.loadUrl(url);
        webView12.loadUrl(url);
        webView13.loadUrl(url);
        webView14.loadUrl(url);
        webView15.loadUrl(url);
        webView16.loadUrl(url);
        webView17.loadUrl(url);
        webView18.loadUrl(url);
        webView19.loadUrl(url);
        webView20.loadUrl(url);

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
        webView11.setWebViewClient(new WebViewClient());
        webView12.setWebViewClient(new WebViewClient());
        webView13.setWebViewClient(new WebViewClient());
        webView14.setWebViewClient(new WebViewClient());
        webView15.setWebViewClient(new WebViewClient());
        webView16.setWebViewClient(new WebViewClient());
        webView17.setWebViewClient(new WebViewClient());
        webView18.setWebViewClient(new WebViewClient());
        webView19.setWebViewClient(new WebViewClient());
        webView20.setWebViewClient(new WebViewClient());
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
                webView11.loadUrl(url);
                webView12.loadUrl(url);
                webView13.loadUrl(url);
                webView14.loadUrl(url);
                webView15.loadUrl(url);
                webView16.loadUrl(url);
                webView17.loadUrl(url);
                webView18.loadUrl(url);
                webView19.loadUrl(url);
                webView20.loadUrl(url);

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
                webView11.setWebViewClient(new WebViewClient());
                webView12.setWebViewClient(new WebViewClient());
                webView13.setWebViewClient(new WebViewClient());
                webView14.setWebViewClient(new WebViewClient());
                webView15.setWebViewClient(new WebViewClient());
                webView16.setWebViewClient(new WebViewClient());
                webView17.setWebViewClient(new WebViewClient());
                webView18.setWebViewClient(new WebViewClient());
                webView19.setWebViewClient(new WebViewClient());
                webView20.setWebViewClient(new WebViewClient());

            }
        };
        handler.postDelayed(runnable,time);
    }
}