package com.khystudent.trd_totalyrandomdungeon;

public class Player {

    protected static int playerHealthPoints;
    protected static int playerMinAttackPoints;
    protected static int playerMaxAttackPoints;

    static void generateHero(){
        playerMinAttackPoints = RandomNumberGenerator.createRandomStats(10,20);
        playerMaxAttackPoints = RandomNumberGenerator.createRandomStats(30,50);
        playerHealthPoints = RandomNumberGenerator.createRandomStats(100, 1000);
    }



}
