package com.leifu.loadingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.leifu.loadingviewlibrary.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    LoadingDialog loadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(v -> {
            loadingView = new LoadingDialog.Builder(this)
                    .setMessage("加载中...")
                    .setCancelable(true)
                    .setCancelOutside(true)
                    .create();

            loadingView.show();
        });

    }
}