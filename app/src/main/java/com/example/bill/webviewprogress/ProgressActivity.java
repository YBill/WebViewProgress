package com.example.bill.webviewprogress;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (1 == msg.what) {
                progress += 2;
                progressBar.setProgress(progress);
                if (progress + 2 <= 100)
                    progressBar.setSecondaryProgress(progress + 2);
                if (progress == 100) {
                    handler.removeMessages(1);
                } else {
                    handler.sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        progressBar = (ProgressBar) findViewById(R.id.pb_progress);
    }

    public void handleClick(View view) {
        progress = 0;
        handler.sendEmptyMessage(1);
    }
}
