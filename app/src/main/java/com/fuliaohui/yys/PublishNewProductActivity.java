package com.fuliaohui.yys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fuliaohui.yys.fragments.RightClassSelecterDialogFragment;
import com.fuliaohui.yys.widget.TitleBar;

public class PublishNewProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_new_product);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle("发布新产品");
        titleBar.setActivity(this);

        findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        findViewById(R.id.rl_class_selecter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightClassSelecterDialogFragment dialogFragment = new RightClassSelecterDialogFragment();
                dialogFragment.show(getSupportFragmentManager());
            }
        });
    }
}
