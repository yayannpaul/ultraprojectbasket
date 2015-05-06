/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucero.training.view;

import com.lucero.training.controller.Hero;
import com.lucero.training.controller.Skill;
import java.util.Scanner;

/**
 *
 * @author PaulRyan
 */
public class Test {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[5];
        Scanner s = new Scanner(System.in);
        String heroName, heroType, attackSkill, blockSkill;
        
        int rand1, rand2;
        
        for(int x = 0; x < 5; x++) {
            System.out.print("Choose hero <heroname>: ");
            heroName = s.nextLine();
            System.out.print("Choose type <herotype>: ");
            heroType = s.nextLine();
            System.out.print("Attack with <skill>: ");
            attackSkill = s.nextLine();
            System.out.print("Block with <skill>: ");
            blockSkill = s.nextLine();
            
            rand1 = (int)(Math.random() * 1000 % 300);
            rand2 = (int)(Math.random() * 1000 % 300);
            
            Skill attack = new Skill(attackSkill, rand1);
            Skill block = new Skill(blockSkill, rand2);
            
            heroes[x] = new Hero(heroName, heroType, attack, block);
            System.out.println();
        }
        
        for(int x = 0; x < 5; x++) {
            heroes[x].attack();
            heroes[x].block();
        }
    }
}
