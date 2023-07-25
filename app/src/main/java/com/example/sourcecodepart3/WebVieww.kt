package com.example.sourcecodepart3

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.window.OnBackInvokedCallback
import androidx.activity.OnBackPressedCallback
import java.lang.Override as Override

@Suppress("DEPRECATION")
class WebVieww : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webView = findViewById<WebView>(R.id.webView)
        val pgBar = findViewById<ProgressBar>(R.id.pgBar)
        webView.webViewClient = WebViewClient()

        val webSetting: WebSettings = webView.settings
        webSetting.javaScriptEnabled = true

        webView.loadUrl("https://www.google.com")
        webView.webViewClient = object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                pgBar.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                pgBar.visibility = View.GONE
            }
        }

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if(webView.canGoBack()){
                    webView.goBack()
                }
                else{
                    onBackPressed()
                }

            }
        })
    }

}