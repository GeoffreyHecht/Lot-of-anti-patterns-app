package com.antipatterns.app.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;

/**
 * NoLowMemoryResolver should not be found here.
 */
public class OtherActivity extends Activity {

    private String myfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myfield = "a";
        MyNonStaticLeakingInnerClass myNonStaticLeakingInnerClass = new MyNonStaticLeakingInnerClass();
        myNonStaticLeakingInnerClass.setAfield(myNonStaticLeakingInnerClass.getAfield() + "a");

        AnotherInnnerClass myClass = new AnotherInnnerClass();
        myClass.setAfield(myClass.getAfield() + "a");

        AStaticInnnerClass myClass2 = new AStaticInnnerClass();
        myClass2.setAfield(myClass2.getAfield() + "a");

        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock mWakeLock = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK | PowerManager.ON_AFTER_RELEASE, "My Tag");
        mWakeLock.acquire(100);

    }

    class MyNonStaticLeakingInnerClass {
        private String afield;

        public String getAfield() {
            return afield;
        }

        public void setAfield(String afield) {
            this.afield = afield;
        }
    }

    class AnotherInnnerClass {
        private String afield;

        public String getAfield() {
            return afield;
        }

        public void setAfield(String afield) {
            this.afield = afield;
        }
    }

    static class AStaticInnnerClass {
        private String afield;

        public String getAfield() {
            return afield;
        }

        public void setAfield(String afield) {
            this.afield = afield;
        }
    }

    @Override
    public void onLowMemory() {
        myfield = "b";
        setMyfield(myfield);
    }

    public String getMyfield() {
        return myfield;
    }

    public void setMyfield(String myfield) {
        this.myfield = myfield;
    }

    public String methodUsingInternalgetter() {
        String c = getMyfield();
        c = c + "a";
        return c;
    }
}
