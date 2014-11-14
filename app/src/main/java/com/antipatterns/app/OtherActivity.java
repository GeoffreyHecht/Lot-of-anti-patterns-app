package com.antipatterns.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * NoLowMemoryResolver should not be find here.
 */
public class OtherActivity extends Activity {

    private String myfield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myfield = "a";

    }

    class myNonStaticLeakingInnerClass{
        private String afield;

        public String getAfield() {
            return afield;
        }

        public void setAfield(String afield) {
            this.afield = afield;
        }
    }

    class AnotherInnnerClass{
        private String afield;

        public String getAfield() {
            return afield;
        }

        public void setAfield(String afield) {
            this.afield = afield;
        }
    }

    @Override
    public void onLowMemory(){
        myfield = "b";
    }

    public String getMyfield() {
        return myfield;
    }

    public void setMyfield(String myfield) {
        this.myfield = myfield;
    }

    public void methodUsingInternalgetter(){
        String c = getMyfield();
        c = c + "a";
    }
}
