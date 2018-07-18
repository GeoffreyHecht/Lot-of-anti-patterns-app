package com.antipatterns.app.sak;

import com.antipatterns.app.interfaces.Interface1;
import com.antipatterns.app.interfaces.Interface2;
import com.antipatterns.app.interfaces.Interface3;
import com.antipatterns.app.interfaces.Interface4;

/**
 * Created by geoffrey on 10/11/14.
 */
public class AnotherSwissArmyKnife implements Interface1,Interface2,Interface3,Interface4 {
    public String aMethod(String arg){
        return arg;
    }
    @Override
    public String method1() {
        return aMethod("adbc");
    }

    @Override
    public String method2() {
        return aMethod("abdqsc");
    }

    @Override
    public String method3() {
        return aMethod("adsqsdbc");
    }

    @Override
    public String method4() {
        return aMethod("adqsdbc");
    }
}
