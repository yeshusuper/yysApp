package com.fuliaohui.yys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fuliaohui.yys.widget.TitleBar;

public class CaigouDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caigou_detail);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle("采购详情");
        titleBar.setActivity(this);

        findViewById(R.id.btn_baojia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2017/4/5 跳转到报价
            }
        });
    }
}
