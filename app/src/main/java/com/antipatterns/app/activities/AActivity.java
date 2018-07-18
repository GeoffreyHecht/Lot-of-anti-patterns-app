package com.antipatterns.app.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;

import java.util.HashMap;

public class AActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock mWakeLock = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK | PowerManager.ON_AFTER_RELEASE, "My Tag");
        mWakeLock.acquire();
        HashMap <Object,Object> hashMap = new HashMap<Object, Object>();
        hashMap.put("haha",mWakeLock);
    }

    /**
     * NoLowMemoryResolver should not be found here.
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

}
