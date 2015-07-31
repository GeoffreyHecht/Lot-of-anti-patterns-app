package com.antipatterns.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * NoLowMemoryResolver should not be find here (inheritance).
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
