package com.company;

public class Generic <T1,T2> {
    private T1 pype1;
    private T2 pupe2;

    public Generic(T1 pype1, T2 pupe2) {
        this.pype1 = pype1;
        this.pupe2 = pupe2;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "pype1=" + pype1 +
                ", pupe2=" + pupe2 +
                '}';
    }
}
