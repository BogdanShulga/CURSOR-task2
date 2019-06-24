package main.java.classes;

import java.util.Random;

public class Robocop extends Robot {

    private String name = "Robocop";

    private String armor = "super armor";

    @Override
    public void shoot() {
        failure();
        System.out.println("Bang-bang-bang!");
    }

    @Override
    public void shoutOut() {
        failure();
        System.out.println("Stand still, don't move, I'm a cop!");
    }

    @Override
    public void move() {
        failure();
        System.out.println("I approach you, do not be afraid!");
    }

    @Override
    public void changeForm() {
        failure();
        Random random = new Random();
        int k = random.nextInt(12) + 1;

        if (k <= 3) {
            System.out.println("Robocop now in blue form");
        } else if (k <= 8) {
            System.out.println("Robocop now in white form");
        } else {
            System.out.println("Robocop now in black form");
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
            System.out.println("You are all a virus, you all must die! Bang-bang-bang!");
            System.exit(0);
        } else {
            System.out.println("I'm working properly!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Ha ha! I am a robot with a super armor, you can't change me!");
    }

    @Override
    public String getArmor() {
        return armor;
    }

    @Override
    public void setArmor(String armor) {
        System.out.println("Ha ha! I am a robot with a super armor, you can't change me!");
    }
}
