package com.myst1k;

public class Log {
    public static int log2(int x) {
        double result = (Math.log(x) / Math.log(2));
        return (int) Math.ceil(result); // округление в большую сторону, если не нужно -> return result;
    }
}
