package com.company;

public class Compl {
    public static String makeComplement(String dna){

    char [] dnaArr = dna.toCharArray();
    StringBuilder complimentaryDna = new StringBuilder();
        for (char particle:dnaArr) {
        if(particle == 'T') {
            particle = 'A';
        } else if (particle == 'A') {
            particle = 'T';
        } else if (particle == 'G') {
            particle = 'C';
        } else {
            particle = 'G';
        }
        complimentaryDna.append(particle);
    } return complimentaryDna.toString();
    }
}
// replace method + switch method as well
// replace method could also be implied in previous camelcasing task