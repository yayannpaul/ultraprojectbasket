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
public class Skill {
    private String name;
    private int dmg;

    public Skill(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    
}
