package com.example.bill.webviewprogress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void handleClick(View view) {
        startActivity(new Intent(this, WebViewActivity.class));
    }

    public void handleClick2(View view) {
        startActivity(new Intent(this, ProgressActivity.class));
    }
}
