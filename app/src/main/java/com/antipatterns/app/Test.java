package com.antipatterns.app;

import java.util.HashMap;

/**
 * Created by geoffrey on 04/02/15.
 */
public class Test {

    public void method1(String s){
        System.out.println("method1 : "+s);
    }

    public void method2(){
        String a = "aaa";
        while (a.equals("aaa")){
            method1(a);
        }
        method2();
        for(int i=1; i> 10;i++){
            method1(a);
        }
        if(a.equals("aaa")){
            method1("aa");
        }else{
            method1("bb");
        }
    }
}
