package com.antipatterns.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * NoLowMemoryResolver should  be find here.
 */
public class CloneActivity extends Activity {
    private String myfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

}
