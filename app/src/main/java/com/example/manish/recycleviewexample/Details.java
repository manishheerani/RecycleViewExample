package com.example.manish.recycleviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.manish.recycleviewexample.model.President;

/**
 * Created by Manish on 11/19/2017.
 */

public class Details extends AppCompatActivity{

    WebView mWebview;
    ProgressBar progressBar;
    Activity context;
    President president;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.president_detail_layout);

        mWebview = (WebView)findViewById(R.id.webview);

        progressBar = (ProgressBar)findViewById(R.id.progress);
        context=this;

        if(getIntent().getExtras()!=null&&getIntent().getExtras().getSerializable("president")!=null)
        {
        president = (President) getIntent().getExtras().getSerializable("president");
        }
        mWebview.getSettings().setJavaScriptEnabled(true);

        mWebview.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.INVISIBLE);
                mWebview.setVisibility(View.VISIBLE);
            }
        });
        try {
            mWebview.loadUrl(president.getWiki_url());
        }
        catch (Exception e)
        {
            Toast.makeText(context,getString(R.string.web_view_msg), Toast.LENGTH_SHORT).show();
            this.finish();
        }
    }
}
