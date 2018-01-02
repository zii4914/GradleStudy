package com.zii.study.gradlestudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("appId:    " + BuildConfig.APPLICATION_ID
            + "\n\nbuildType:    " + BuildConfig.BUILD_TYPE
            + "\n\nflavor:    " + BuildConfig.FLAVOR
            + "\n\nversionName:    " + BuildConfig.VERSION_NAME
            + "\n\nversionCode:    " + BuildConfig.VERSION_CODE
            + "\n\nDebug:    " + BuildConfig.DEBUG
        );
    }
}
