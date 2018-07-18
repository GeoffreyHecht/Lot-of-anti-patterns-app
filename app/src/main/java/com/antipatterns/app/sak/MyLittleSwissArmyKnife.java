package com.antipatterns.app.sak;

import com.antipatterns.app.interfaces.Interface1;
import com.antipatterns.app.interfaces.Interface2;
import com.antipatterns.app.interfaces.Interface3;
import com.antipatterns.app.interfaces.Interface4;
import com.antipatterns.app.interfaces.Interface5;

/**
 * Created by geoffrey on 10/11/14.
 */
public class MyLittleSwissArmyKnife implements Interface1,Interface2,Interface3,Interface4,Interface5 {
    public String aMethod(String arg){
        arg = arg + "b";
        return arg;
    }
    @Override
    public String method1() {
        return aMethod("abc");
    }

    @Override
    public String method2() {
        return aMethod("ab");
    }

    @Override
    public String method3() {
        return aMethod("abe");
    }

    @Override
    public String method4() {
        return aMethod("abg");
    }

    @Override
    public String method5() {
        return aMethod("abs");
    }
}
