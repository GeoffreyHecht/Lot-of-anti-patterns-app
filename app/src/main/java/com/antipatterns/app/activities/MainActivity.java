package com.antipatterns.app.activities;

import android.app.Activity;
import android.os.Bundle;

import com.antipatterns.app.MyBlobClass;
import com.antipatterns.app.views.NotSoGoodView;

// NLMR
public class MainActivity extends Activity {

    private String myfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        NotSoGoodView notSoGoodView = new NotSoGoodView(this.getApplicationContext());
        // NO IWR
        notSoGoodView.invalidate();
    }

}
