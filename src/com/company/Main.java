package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic doctor = new Medic();
        Warrior warrior = new Warrior();


        Hero[] hero = {magic, doctor, warrior};
        for (Hero heroes : hero) {

            heroes.applySuperAbility("");
        }


    }
}
