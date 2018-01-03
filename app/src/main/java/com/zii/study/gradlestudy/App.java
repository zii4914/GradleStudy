package com.zii.study.gradlestudy;

import android.app.Application;
import android.content.Context;

import com.zii.study.gradlestudy.util.LogUtils;

/**
 * @create Created by zii on 2018/1/3.
 */

public class App extends Application {
  public static Context sContext;

  @Override
  public void onCreate() {
    super.onCreate();

    sContext = this.getApplicationContext();

    LogUtils.getConfig()
        .setLogSwitch(BuildConfig.DEBUG)
        .setGlobalTag("zii-study");

  }
}
