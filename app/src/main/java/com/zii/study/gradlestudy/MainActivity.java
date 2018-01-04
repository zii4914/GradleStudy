package com.zii.study.gradlestudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView tv = findViewById(R.id.tv);
    tv.setText("appId:    " + BuildConfig.APPLICATION_ID
        + "\n\nbuildType:    " + BuildConfig.BUILD_TYPE
        + "\n\nflavor:    " + BuildConfig.FLAVOR
        + "\n\nversionName:    " + BuildConfig.VERSION_NAME
        + "\n\nversionCode:    " + BuildConfig.VERSION_CODE
        + "\n\nminSdk:    " + BuildConfig.MIN_SDK_VERSION
        + "\n\ntargetSdk:    " + BuildConfig.TARGET_SDK_VERSION
        + "\n\nDebug:    " + BuildConfig.DEBUG
    );

    //homeDebug   -->D    构建类型>Main
    //homeRelease -->M    无构建类型               G-APP
    //proDebug    -->P(d) 构建变体>产品风味>Main    G-ProVD
    //proRelease  -->P    产品风味>Main
    //构建变体>构建类型>产品风味>Main
    ImageView iv = findViewById(R.id.iv);
    iv.setImageResource(R.drawable.letter);
  }
}
