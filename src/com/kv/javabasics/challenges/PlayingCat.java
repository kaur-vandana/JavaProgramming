package com.kv.javabasics.challenges;

public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer && 25<= temperature && temperature<=45)
            return true;

        else if(25<= temperature && temperature<=35)
            return true;

        return false;
    }
}