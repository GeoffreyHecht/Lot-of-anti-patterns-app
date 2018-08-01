package com.antipatterns.app.sak;

import com.antipatterns.app.interfaces.Interface1;
import com.antipatterns.app.interfaces.Interface2;
import com.antipatterns.app.interfaces.Interface3;
import com.antipatterns.app.interfaces.Interface4;
import com.antipatterns.app.interfaces.Interface5;
import com.antipatterns.app.interfaces.Interface6;
import com.antipatterns.app.interfaces.Interface7;
import com.antipatterns.app.interfaces.Interface8;

/**
 * Created by geoffrey on 10/11/14.
 */
public class MySwissArmyKnife implements Interface1, Interface2, Interface3, Interface4, Interface5, Interface6, Interface7, Interface8 {
    public String aMethod(String arg) {
        arg = arg + "a";
        return arg;
    }

    @Override
    public String method1() {
        return aMethod("agfggbsd");
    }

    @Override
    public String method2() {
        return aMethod("asfbsd");
    }

    @Override
    public String method3() {
        return aMethod("abbsd");
    }

    @Override
    public String method4() {
        return aMethod("abazesd");
    }

    @Override
    public String method5() {
        return aMethod("agfbsd");
    }

    @Override
    public String method6() {
        return aMethod("absfdqd");
    }

    @Override
    public String method7() {
        return aMethod("abssdd");
    }

    @Override
    public String method8() {
        AnotherInnnerClass anotherInnnerClass = new AnotherInnnerClass();
        anotherInnnerClass.setAfield(anotherInnnerClass.getAfield() + "a");
        return aMethod("absdqs");
    }

    class AnotherInnnerClass {
        private String afield;

        public String getAfield() {
            return afield;
        }

        public void setAfield(String afield) {
            this.afield = afield;
        }
    }
}
