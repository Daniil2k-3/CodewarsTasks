package com.company;

public class CamelCaser {
    public static String getCamelCaseOf(String initial,String separator, char type) {
        String [] test1 = initial.split(separator);
        StringBuilder finalWord = new StringBuilder();

        if (type == 's' || type == 'S'){
            for (int i = 0; i < test1.length; i++) {
                if(i == 0){
                    finalWord.append(test1[i]);
                } else {
                    finalWord.append(test1[i].substring(0, 1).toUpperCase()).append(test1[i].substring(1));
                }
            }
            return finalWord.toString();
        } else if (type == 'g' || type == 'G'){
            for (String word:test1) {
                finalWord.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            }
        } return finalWord.toString();
    }
}
