package com.task1;

public class Task1Main {
    public static void main(String[] args) {
        tablissa tablissa = new tablissa() {
            @Override
            public void method(int san) {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(san*i);
                }
            }
        };
        tablissa.method(2);
    }
}
interface tablissa{
    void method(int san);
}
