package com.task2;

import java.util.Random;

public class Task2Main {
    public static void main(String[] args) {
        Random random = new Random();
      Mypredicate mypredicate  = san -> {
          int s = random.nextInt(0, 10);
          System.err.println(s);
          if (san > s) {
             return true;
          } else {
              return  false;
          }

      };
        System.out.println(mypredicate.met(2));;



        Mypredicate2 mypredicate2  = b -> {
            int a = random.nextInt(0,10);
            System.err.println(a);
            System.out.println(b+a+" \n"+b*a+" \n"+b/a);
        };
        mypredicate2.met2(6);


    }
}
interface Mypredicate{
    Boolean met(int san);
}
interface Mypredicate2{
    void met2(int b);
}
