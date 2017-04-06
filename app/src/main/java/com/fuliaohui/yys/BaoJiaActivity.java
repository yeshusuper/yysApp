package com.fuliaohui.yys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.fuliaohui.yys.widget.TitleBar;

public class BaoJiaActivity extends AppCompatActivity {

    private ImageView ivType1;
    private ImageView ivType2;
    private ImageView ivType3;
    private EditText etType1;
    private EditText etType2_1;
    private EditText etType2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao_jia);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle("报价");
        titleBar.setActivity(this);

        ivType1 = (ImageView) findViewById(R.id.iv_type_1);
        ivType2 = (ImageView) findViewById(R.id.iv_type_2);
        ivType3 = (ImageView) findViewById(R.id.iv_type_3);
        etType1 = (EditText) findViewById(R.id.et_type_1);
        etType2_1 = (EditText) findViewById(R.id.et_type_2_1);
        etType2_2 = (EditText) findViewById(R.id.et_type_2_2);

        View.OnClickListener typeListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTypeMode(view.getId());
            }
        };
        findViewById(R.id.ll_type_1).setOnClickListener(typeListener);
        findViewById(R.id.ll_type_2).setOnClickListener(typeListener);
        findViewById(R.id.ll_type_3).setOnClickListener(typeListener);
        findViewById(R.id.btn_baojia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void setTypeMode(int viewId) {
        switch (viewId){
            case R.id.ll_type_1:
                ivType1.setImageResource(R.drawable.icon_check_bor_cur);
                ivType2.setImageResource(R.drawable.icon_check_bor_nor);
                ivType3.setImageResource(R.drawable.icon_check_bor_nor);
                etType1.setEnabled(true);
                etType2_1.setEnabled(false);
                etType2_2.setEnabled(false);
                break;
            case R.id.ll_type_2:
                ivType1.setImageResource(R.drawable.icon_check_bor_nor);
                ivType2.setImageResource(R.drawable.icon_check_bor_cur);
                ivType3.setImageResource(R.drawable.icon_check_bor_nor);
                etType1.setEnabled(false);
                etType2_1.setEnabled(true);
                etType2_2.setEnabled(true);
                break;
            case R.id.ll_type_3:
                ivType1.setImageResource(R.drawable.icon_check_bor_nor);
                ivType2.setImageResource(R.drawable.icon_check_bor_nor);
                ivType3.setImageResource(R.drawable.icon_check_bor_cur);
                etType1.setEnabled(false);
                etType2_1.setEnabled(false);
                etType2_2.setEnabled(false);
                break;
        }
    }
}
