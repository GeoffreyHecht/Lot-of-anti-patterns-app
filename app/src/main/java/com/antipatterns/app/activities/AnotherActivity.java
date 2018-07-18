package com.antipatterns.app.activities;

/**
 * NoLowMemoryResolver should not be found here (inheritance).
 */
public class AnotherActivity extends OtherActivity {


    /**
     * MemberIgnoringMethod should be find here.
     * @return
     */
    public String amethod(){
        return "a";
    }

    /**
     * No MIM here (override)
     * @return
     */
    public String methodUsingInternalgetter(){
       return "a";
    }


}
