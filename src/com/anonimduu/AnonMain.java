package com.anonimduu;

import java.util.Comparator;

public class AnonMain {
    public static void main(String[] args) {
      /*  Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        Car car = new Car() {
            @Override
            public void method() {
                System.out.println();
            }
        };
        car.method();*/
    AbleToEat ableToEat = (name, age) -> {
    System.out.println(name+age);
    };
    ableToEat.eat("Aigen",18);
    }
}
interface Car {
    void method(String name, int age);
}

interface AbleToEat{
    void eat(String name,int age);
}
