package com.company;

public class SqareRoot {
    public static boolean isSquare(int n) {
        double sqrt = (Math.sqrt(n));

        if (n < 0){
            return false;
        }
        else if(n == 0 || n%sqrt == 0){
            return true;
        } else {
            return false;
        }

    }
    /* although the very elegant solution was just next 1 line
    return Math.sqrt(n) % 1 == 0;
     */
}
