package com.creational.stdpdesignpattern;

public class ChildSingleton extends ParentSingleton {

    private static ChildSingleton instance;

    public static synchronized ParentSingleton getInstance() {
       if (instance == null) {
          instance = new ChildSingleton();
       }

       return instance;
    }       
}
