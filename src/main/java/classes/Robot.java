package main.java.classes;

import main.java.interfaces.Failureable;

import java.util.Random;

public class Robot implements Failureable {

    private String name = "Robot";

    private String armor = "armor";

    private String adaptivArmor = "";

    public void shoot() {
        failure();
        System.out.println("pif-pif");
    }

    public void shoutOut() {
        failure();
        System.out.println("I'm a man, not a robot!");
    }

    public void move() {
        failure();
        System.out.println("I'm moving!");
    }

    public void changeForm() {
        failure();
        Random random = new Random();
        int k = random.nextInt(12) + 1;

        if (k <= 3) {
            System.out.println("Robot now in form 1");
        } else if (k <= 8) {
            System.out.println("Robot now in form 2");
        } else {
            System.out.println("Robot now in form 3");
        }
    }

    public void failure() {
        Random r = new Random();
        if (r.nextInt(6) == 2) {
            System.out.println("You are all a virus, you all must die!");
            System.exit(0);
        } else {
            System.out.println("I'm working properly!");
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Ha ha! I am a robot with an armor, you can't change me!");
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        System.out.println("Ha ha! I am a robot with an armor, you can't change me!");
    }

    public void setAdaptivArmor(String adaptivArmor) {
        this.adaptivArmor = adaptivArmor;
    }

    public String getAdaptivArmor() {
        return adaptivArmor;
    }
}
