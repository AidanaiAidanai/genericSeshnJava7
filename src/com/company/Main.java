package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Generic<Integer,String> generic = new Generic<>(18,"aidana");
        method(78);
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        met(list);
    }
    public static  <C> void method(C type){
        System.out.println(type);
    }
    public static void met(ArrayList<? extends  Number> list){
        System.out.println(list);
    }
}
