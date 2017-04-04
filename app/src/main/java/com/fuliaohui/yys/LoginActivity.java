package com.fuliaohui.yys;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fuliaohui.yys.fragments.RightClassSelecterDialogFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final View llLogin = findViewById(R.id.ll_login_container);
        final View llRegister = findViewById(R.id.ll_register_container);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llLogin.setVisibility(View.GONE);
                llRegister.setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, CaigouListActivity.class);
                startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.rl_class_selecter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightClassSelecterDialogFragment fragment = new RightClassSelecterDialogFragment();
                fragment.show(getSupportFragmentManager());
            }
        });
    }
}
