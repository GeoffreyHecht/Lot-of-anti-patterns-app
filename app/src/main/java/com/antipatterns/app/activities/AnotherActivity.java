package com.antipatterns.app.activities;

/**
 * NoLowMemoryResolver should not be found here (inheritance).
 */
public class AnotherActivity extends OtherActivity {


    // MIM
    public String amethod() {
        return "a";
    }

    // NO MIM
    public String methodUsingInternalgetter() {
        return "a";
    }


}
