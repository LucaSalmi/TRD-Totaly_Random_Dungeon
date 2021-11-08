package com.khystudent.trd_totalyrandomdungeon;

public class Enemy {

    private int enemyHealthPoints;

    public Enemy(int enemyHealthPoints, int enemyMaxAttack, int enemyMinAttack) {
        this.enemyHealthPoints = enemyHealthPoints;
        this.enemyMaxAttack = enemyMaxAttack;
        this.enemyMinAttack = enemyMinAttack;
    }

    private int enemyMaxAttack;
    private int enemyMinAttack;

    public int getEnemyMinAttack() {
        return enemyMinAttack;
    }

    public void setEnemyMinAttack(int enemyMinAttack) {
        this.enemyMinAttack = enemyMinAttack;
    }

    public int getEnemyHealthPoints() {
        return enemyHealthPoints;
    }

    public void setEnemyHealthPoints(int enemyHealthPoints) {
        this.enemyHealthPoints = enemyHealthPoints;
    }

    public int getEnemyMaxAttack() {
        return enemyMaxAttack;
    }

    public void setEnemyMaxAttack(int enemyMaxAttack) {
        this.enemyMaxAttack = enemyMaxAttack;
    }
}
