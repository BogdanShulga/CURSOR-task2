package main.java.classes;

import java.util.Random;

public class PlanetAdapter {
    public void adapt(Robot robot) {
        Random r = new Random();
        char c = (char) (r.nextInt(3) + 'A');
        System.out.println("c = " + c);
        if (c == 'A') {
            robot.setAdaptivArmor("water resistant " + robot.getArmor());
            System.out.println("Your " + robot.getName() + " is on the planet of seas now and he got adaptive " + robot.getAdaptivArmor() + "!");
        } else if (c == 'B') {
            robot.setAdaptivArmor("wind resistant " + robot.getArmor());
            System.out.println("Your " + robot.getName() + " is on the planet of wind now and he got adaptive " + robot.getAdaptivArmor() + "!");
        } else if (c == 'C') {
            robot.setAdaptivArmor("sun resistant " + robot.getArmor());
            System.out.println("Your " + robot.getName() + " is on the planet of sun now and he got adaptive " + robot.getAdaptivArmor() + "!");
        } else {
            robot.setAdaptivArmor("earth " + robot.getArmor());
            System.out.println("Your " + robot.getName() + " is on the Earth now and he got adaptive " + robot.getAdaptivArmor() + "!");
        }
    }
}
