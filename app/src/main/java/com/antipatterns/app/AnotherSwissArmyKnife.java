package com.antipatterns.app;

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
