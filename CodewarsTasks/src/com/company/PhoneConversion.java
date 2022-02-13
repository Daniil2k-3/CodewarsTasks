package com.company;

public class PhoneConversion {
    public static String createPhoneNumber(int[] numbers) {
        String par = "(";
        StringBuilder phStringBl = new StringBuilder(par);
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length && i != 2 && i != 5){
                phStringBl.append(numbers[i]).toString();
            } else if (i == 2) {
                phStringBl.append(numbers[i] + ") ").toString();
            } else {
                phStringBl.append(numbers[i] + "-").toString();
            }

        }
        return phStringBl.toString();
    }
}
