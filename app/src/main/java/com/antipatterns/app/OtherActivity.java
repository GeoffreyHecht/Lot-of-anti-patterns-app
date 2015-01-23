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
        MyNonStaticLeakingInnerClass myNonStaticLeakingInnerClass = new MyNonStaticLeakingInnerClass();
        myNonStaticLeakingInnerClass.setAfield(myNonStaticLeakingInnerClass.getAfield() + "a");

        AnotherInnnerClass myClass = new AnotherInnnerClass();
        myClass.setAfield(myClass.getAfield() + "a");

        AStaticInnnerClass myClass2 = new AStaticInnnerClass();
        myClass2.setAfield(myClass2.getAfield() + "a");

    }

    class MyNonStaticLeakingInnerClass{
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

    static class AStaticInnnerClass{
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
        setMyfield(myfield);
    }

    public String getMyfield() {
        return myfield;
    }

    public void setMyfield(String myfield) {
        this.myfield = myfield;
    }

    public String methodUsingInternalgetter(){
        String c = getMyfield();
        c = c + "a";
        return c;
    }
}
