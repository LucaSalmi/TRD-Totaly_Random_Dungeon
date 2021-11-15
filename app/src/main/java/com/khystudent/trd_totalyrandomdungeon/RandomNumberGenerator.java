package com.khystudent.trd_totalyrandomdungeon;

import android.content.Context;

public class RandomNumberGenerator {

    static int createRandomSingleNumber(int min, int max){

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    static int createRandomStats(int min, int max){

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    static int createRandomDamage(int min, int max){

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    static int randomEnemyPortrait(){


        switch (createRandomSingleNumber(1, 2)){

            case 1:
                return R.drawable.goblin_rescaled;
            case 2:
                return R.drawable.warrior_rescaled;
            default:
                return R.drawable.swords_icon;


        }
    }

    static String randomEnemyName(Context context){

        String a;
        String b;

        switch(createRandomSingleNumber(1, 3)){
            case 1:
                a = context.getString(R.string.enemy_name_1);
                break;
            case 2:
                a = context.getString(R.string.enemy_name_2);
                break;
            case 3:
                a = context.getString(R.string.enemy_name_3);
                break;
            default:
                a = "error";
                break;
        }

        switch(createRandomSingleNumber(1, 3)){

            case 1:
                b = context.getString(R.string.enemy_forname_1);
                break;
            case 2:
                b = context.getString(R.string.enemy_forname_2);
                break;
            case 3:
                b = context.getString(R.string.enemy_forname_3);
                break;
            default:
                b = "error";
                break;
        }

        return b+a;

    }

}
