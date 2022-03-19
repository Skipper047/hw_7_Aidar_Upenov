package com.company;

public abstract class Hero implements HavingSuperAbility {
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getTypeOfSupSkill() {
        return typeOfSupSkill;
    }

    public void setTypeOfSupSkill(String typeOfSupSkill) {
        this.typeOfSupSkill = typeOfSupSkill;
    }

    private double health;
    private double damage;
    private String typeOfSupSkill;
}
