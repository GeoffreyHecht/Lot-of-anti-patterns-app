package com.antipatterns.app;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        AnotherActivity anotherActivity = new AnotherActivity();
        OtherActivity otherActivity = new OtherActivity();
        otherActivity.methodUsingInternalgetter();
    }

}
