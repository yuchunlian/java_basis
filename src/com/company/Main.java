package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //ifn
        if (arrayList == null) {

        }
        //inn
        if (arrayList != null) {

        }
        //xxx.nn
        if (arrayList != null) {

        }
        //xxx.null
        if (arrayList == null) {

        }


        //arrayList.for
        for (Object o : arrayList) {
            
        }
        //arrayList.fori  顺序遍历
        for (int i = 0; i < arrayList.size(); i++) {

        }
        //arrayList.forr  倒序遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {

        }

    }


    public void method(String a,int b){
        System.out.println("Main.method");
    }
}
