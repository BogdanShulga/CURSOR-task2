package main.java.classes;

import java.util.Random;

public class T800 extends Robocop {

    private String name = "T800";

    private String armor = "super duper armor";

    @Override
    public void shoot() {
        failure();
        System.out.println("Kaboom-kaboom-kaboom!");
    }

    @Override
    public void shoutOut() {
        failure();
        System.out.println("I need your clothes!");
    }

    @Override
    public void move() {
        failure();
        System.out.println("I'm going to protect Sara and Jone Connor!");
    }

    @Override
    public void changeForm() {
        failure();
        Random random = new Random();
        int k = random.nextInt(12) + 1;

        if (k <= 3) {
            System.out.println("T800 now without clothing");
        } else if (k >= 4 && k <= 8) {
            System.out.println("T800 now in black glasses and without clothes");
        } else {
            System.out.println("T800 now in black glasses and leather clothes");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void failure() {
        Random r = new Random();
        if (r.nextInt(6) == 2) {
            System.out.println("You are all a virus, you all must die! Kaboom-kaboom-kaboom!");
            System.exit(0);
        } else {
            System.out.println("I'm working properly!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Ha ha! I am a robot with a super duper armor, you can't change me!");
    }

    @Override
    public String getArmor() {
        return armor;
    }

    @Override
    public void setArmor(String armor) {
        System.out.println("Ha ha! I am a robot with a super duper armor, you can't change me!");
    }

    public void killT1000() {
        System.out.println("KabooOOOOoom! Astalavista babe!");
    }
}
