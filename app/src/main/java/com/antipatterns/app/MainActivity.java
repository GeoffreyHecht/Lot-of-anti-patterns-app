package com.antipatterns.app;

import android.app.Activity;
import android.app.AlarmManager;
import android.os.Bundle;

/**
 * NoLowMemoryResolver should  be find here.
 */
public class MainActivity extends Activity {
    private String myfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myfield = "a";
        MyBlobClass myBlobClass = new MyBlobClass();
        myBlobClass.averyComplexandLongMethod();
        myBlobClass.aBadMethod1();
        myfield = myBlobClass.averyComplexandLongMethod();
        setTitle(myfield);
        AnotherActivity anotherActivity = new AnotherActivity();
        anotherActivity.amethod();
        OtherActivity otherActivity = new OtherActivity();
        otherActivity.methodUsingInternalgetter();
        otherActivity.onLowMemory();
        CloneActivity cloneActivity = new CloneActivity();
        cloneActivity.onCreate(savedInstanceState);
        Test test = new Test();
        test.method2();
        NotSoGoodView notSoGoodView = new NotSoGoodView(this.getApplicationContext());
        notSoGoodView.invalidate();
    }

}
