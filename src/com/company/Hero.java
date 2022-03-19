package com.company;

public abstract class Hero implements HavingSuperAbility {
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSupSkill() {
        return typeOfSupSkill;
    }

    public void setTypeOfSupSkill(String typeOfSupSkill) {
        this.typeOfSupSkill = typeOfSupSkill;
    }

    private int health;
    private int damage;
    private String typeOfSupSkill;
}
