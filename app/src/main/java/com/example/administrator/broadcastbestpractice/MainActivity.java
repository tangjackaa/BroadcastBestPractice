package com.example.administrator.broadcastbestpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline = (Button) findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.administrator.broadcastbestpractice.FORCE_OFFLINE");
                sendBroadcast(intent);//点击按钮后发出com.example.administrator.broadcastbestpractice.FORCE_OFFLINE的广播(但强制用户下线的逻辑不写在MainActivity中,避免依附于界面)
            }
        });
    }
}
