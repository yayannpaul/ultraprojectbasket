/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucero.training.controller;

/**
 *
 * @author PaulRyan
 */
public class Hero {
    private String name;
    private String type;
    private Skill attackSkill;
    private Skill blockSkill;

    public Hero(String name, String type, Skill attackSkill, Skill blockSkill) {
        this.name = name;
        this.type = type;
        this.attackSkill = attackSkill;
        this.blockSkill = blockSkill;
    }

    public Hero() {
    }
    
    public void attack() {
        String attackName = attackSkill.getName();
        int dmg = attackSkill.getDmg();
        System.out.println(this.name+"("+this.type+") attacks with "+attackName+". Deals "+dmg+" damage.");
        
    }
    
    public void block() {
        String blockName = blockSkill.getName();
        int blockscore = blockSkill.getDmg();
        System.out.println(this.name+"("+this.type+") blocks with "+blockName+" ("+blockscore+") defense.");
        System.out.println();
    }
    
}
