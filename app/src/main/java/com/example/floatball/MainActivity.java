package com.example.floatball;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button ButtonStart;
    private Button ButtonQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        if (Build.VERSION.SDK_INT >= 23) {//判断版本
            if (!Settings.canDrawOverlays(this)) {//检查权限
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);//跳转悬浮窗权限
                Toast.makeText(this, "请允许悬浮球的悬浮窗权限", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void initView() {
        ButtonStart = (Button) findViewById(R.id.btn_start);
        ButtonQuit = (Button) findViewById(R.id.btn_quit);//绑定ui
//点击事件预留位置
    }

    private void checkAccessibility() {
        // 判断辅助功能是否开启
        /*
        if () {
            // 引导至辅助功能设置页面
            startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
            Toast.makeText(this, "请先开启FloatBall辅助功能", Toast.LENGTH_SHORT).show();
        }
        */
    }
}
