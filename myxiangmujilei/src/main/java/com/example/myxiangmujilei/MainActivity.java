package com.example.myxiangmujilei;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends MyBaseActivity {

    private Button Btn;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        setContentView(R.layout.activity_main);
       Btn= findViewById(R.id.Btn);

    }

    @Override
    protected void initListener() {

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openActivity(Main2Activity.class);
               showShort("我要跳转了");

            }
        });
    }



}
