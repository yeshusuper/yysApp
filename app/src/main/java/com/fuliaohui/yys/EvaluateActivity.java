package com.fuliaohui.yys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.fuliaohui.yys.widget.TitleBar;

public class EvaluateActivity extends AppCompatActivity
        implements View.OnClickListener{

    private ImageView ivQuality1;
    private ImageView ivQuality2;
    private ImageView ivQuality3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle("订单评价");
        titleBar.setActivity(this);

        ivQuality1 = (ImageView) findViewById(R.id.iv_quality_1);
        ivQuality2 = (ImageView) findViewById(R.id.iv_quality_2);
        ivQuality3 = (ImageView) findViewById(R.id.iv_quality_3);

        findViewById(R.id.ll_quality_1).setOnClickListener(this);
        findViewById(R.id.ll_quality_2).setOnClickListener(this);
        findViewById(R.id.ll_quality_3).setOnClickListener(this);
        findViewById(R.id.btn_submit).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_quality_1:
                ivQuality1.setImageResource(R.drawable.icon_check_bor_cur);
                ivQuality2.setImageResource(R.drawable.icon_check_bor_nor);
                ivQuality3.setImageResource(R.drawable.icon_check_bor_nor);
                break;
            case R.id.ll_quality_2:
                ivQuality2.setImageResource(R.drawable.icon_check_bor_cur);
                ivQuality1.setImageResource(R.drawable.icon_check_bor_nor);
                ivQuality3.setImageResource(R.drawable.icon_check_bor_nor);
                break;
            case R.id.ll_quality_3:
                ivQuality3.setImageResource(R.drawable.icon_check_bor_cur);
                ivQuality1.setImageResource(R.drawable.icon_check_bor_nor);
                ivQuality2.setImageResource(R.drawable.icon_check_bor_nor);
                break;
            case R.id.btn_submit:
                finish();
                break;
        }
    }
}
