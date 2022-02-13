package com.company;

public class WalkingApp {
    public static boolean locator (char[] walk) {
        int x = 0;
        int y = 0;
        int timer = 0;
        for (char step:walk) {
            timer++;
            if (step == 'n'){
                y+=1;
            } else if (step == 's'){
                y-=1;
            } else if (step == 'w'){
                x +=1;
            } else {
                x-=1;
            }

        }
        return (x == 0 && y == 0 && timer == 10);
    }
}
