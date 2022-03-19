package com.company;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        magic.setHealth(450);
        magic.setDamage(85);
        magic.setTypeOfSupSkill("Magic");
        Warrior warrior = new Warrior();
        warrior.setHealth(550);
        warrior.setDamage(55);
        warrior.setTypeOfSupSkill("FireShield");
        Medic medic = new Medic();
        medic.setHealth(300);
        medic.setDamage(15);
        medic.setTypeOfSupSkill("WaterShield");
        medic.setHealPoints(30);
        Hero[] heroes = {magic,
                medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            medic.increaseExperience();

        }



    }





}
