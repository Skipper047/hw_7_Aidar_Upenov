package com.company;

public class Medic extends Hero{
    public double getHealPoints() { return healPoints; }

    public void setHealPoints(double healPoints) { this.healPoints = healPoints; }

    private double healPoints;
    // public Medic(int health, int damage, String typeOfSkill, double healPoints){
       // super();
        // setHealth(health);
        //setDamage(damage);
        // setTypeOfSupSkill(typeOfSkill);
        // this.healPoints = healPoints;
    // }
    @Override
    public void applySuperAbility() {
        System.out.println("The Medic used HEALING SPELL");
    }
    public void increaseExperience(){
        healPoints = 30;
        double percentHeal =10;
        double newHeal = healPoints * percentHeal /100;
        double healing = healPoints + newHeal;
        System.out.println(healing);
    }


}
