package com.antipatterns.app.activities;

import android.app.Activity;
import android.os.Bundle;

import com.antipatterns.app.MyBlobClass;
import com.antipatterns.app.sak.MyLittleSwissArmyKnife;

// NLMR
public class CloneActivity extends Activity {

    private String myfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myfield = "a";
        MyLittleSwissArmyKnife myLittleSwissArmyKnife = new MyLittleSwissArmyKnife();
        myLittleSwissArmyKnife.aMethod(myfield);
        MyBlobClass myBlobClass = new MyBlobClass();
        myBlobClass.averyComplexandLongMethod();
        AnotherActivity anotherActivity = new AnotherActivity();
        anotherActivity.amethod();
        OtherActivity otherActivity = new OtherActivity();
        otherActivity.methodUsingInternalgetter();
    }

    public void aMethodWithTonsOfParams(int a, int b, int c, int d, int e, int f, int g, int r) {
        // LPL
    }

}
