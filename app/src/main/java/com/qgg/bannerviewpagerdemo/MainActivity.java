package com.qgg.bannerviewpagerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.qgg.bannerviewpager.BannerAdapter;
import com.qgg.bannerviewpager.BannerView;

public class MainActivity extends Activity {
    BannerView mBannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBannerView = findViewById(R.id.banner);
        mBannerView.hidePageIndicator();
        mBannerView.setAdapter(new BannerAdapter() {
            @Override
            public View getView(int position, View convertView) {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.mipmap.ic_launcher);
                return imageView;
            }

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public String getBannerDesc(int position) {
                return "哎哟，不错哦";
            }
        });
    }
}
