package com.khystudent.trd_totalyrandomdungeon;

public class RandomNumberGenerator {

    static int createRandomStats(int min, int max){

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    static int createRandomDamage(int min, int max){

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

}
