package com.company;

public class Primer {
    public static boolean isPrime(int num) {
        double numD = num;
        double[] div = {2, 3, 4, 5, 6, 7, 8, 9};
        int check = 0;
        for (double pos:div) {
            if (numD % pos == 0){
                check++;
            }
        }
        if (num <= 1) {
            return false;
        } else if (num == 3 || num == 5 || num == 7) {
            return true;
        } else if (check !=0) {
            return false;
        } return check == 0;
    }

    // That works, but range of numbers is at 7-10 thousand





    public static boolean isPrime2(int num) {
        if (num == 2 || num == 3)
            return true;
        if (num <= 1)
            return false;
        if ((num % 2 == 0) || (num % 3 == 0))
            return false;
        double nNumber = 5;
        while (Math.pow(nNumber, 2) <= num) {
            if (num % nNumber == 0 || num % (nNumber + 2) == 0)
                return false;
            nNumber += 6;
        }

        return true;
    }
}
