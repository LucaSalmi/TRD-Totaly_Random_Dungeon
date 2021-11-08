package com.khystudent.trd_totalyrandomdungeon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CombatActivity extends AppCompatActivity {

    TextView playerHpBar;
    TextView enemyHpBar;

    Button attackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat);

        playerHpBar = findViewById(R.id.player_hp);
        enemyHpBar = findViewById(R.id.enemy_hp);
        attackBtn = findViewById(R.id.attack_btn);

        Enemy enemy = new Enemy(RandomNumberGenerator.createRandomStats(100,200), 5,1);
        updateBars(enemy);

       playerTurn(enemy);
    }

    protected void enemyTurn(Enemy enemy){
        if(enemy.getEnemyHealthPoints() > 0){

            int dmg = RandomNumberGenerator.createRandomDamage(enemy.getEnemyMinAttack(), enemy.getEnemyMaxAttack());
            Player.playerHealthPoints -= dmg;
            Toast.makeText(CombatActivity.this, "You take: " + dmg + " damage", Toast.LENGTH_SHORT).show();
            updateBars(enemy);
            playerTurn(enemy);

        }else{

            Toast.makeText(CombatActivity.this, "You won!!", Toast.LENGTH_SHORT).show();
        }
    }

    protected void playerTurn(Enemy enemy){

        if(Player.playerHealthPoints > 0){

            attackBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int dmg = RandomNumberGenerator.createRandomDamage(Player.playerMinAttackPoints, Player.playerMaxAttackPoints);
                    enemy.setEnemyHealthPoints(enemy.getEnemyHealthPoints() - dmg);
                    Toast.makeText(CombatActivity.this, "You did: " + dmg + " damage", Toast.LENGTH_SHORT).show();
                    updateBars(enemy);
                    enemyTurn(enemy);
                }
            });

        }else{

            Toast.makeText(CombatActivity.this, "You died", Toast.LENGTH_SHORT).show();
        }

    }

    protected void updateBars(Enemy enemy){

        playerHpBar.setText(String.valueOf(Player.playerHealthPoints));
        enemyHpBar.setText(String.valueOf(enemy.getEnemyHealthPoints()));
    }
}