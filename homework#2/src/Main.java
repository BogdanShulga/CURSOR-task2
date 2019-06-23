import classes.Failureable;
import classes.Robocop;
import classes.Robot;
import classes.T800;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Failureable failureableRobot = null;
        int action = 0;
        Scanner in = new Scanner(System.in);
        boolean stop = false;
        Robot robot = null;

        System.out.println("Hi! It is a robot control center.");

        while (!stop) {
            System.out.println("Pleas, choose a type of the robot:");
            System.out.println("1 + enter - Robot");
            System.out.println("2 + enter - Robocop");
            System.out.println("3 + enter - T800");
            System.out.println("4 + enter - quit from the robot control center");

            try {
                action = in.nextInt();
                System.out.println("You entered " + action);
            } catch (java.util.InputMismatchException ex) {
                System.out.println("You entered incorrect data!");
                in.nextLine();
            }

            if (action == 1) {
                robot = new Robot();
            } else if (action == 2) {
                robot = new Robocop();
            } else if (action == 3) {
                robot = new T800();
            } else if (action == 4) {
                stop = true;
                continue;
            } else {
                System.out.println("You entered incorrect data!");
            }

            while (!stop) {
                System.out.println();
                System.out.println("Please, input what are you want the " + robot + " to do:");
                System.out.println("1 + enter - to move");
                System.out.println("2 + enter - to shoot");
                System.out.println("3 + enter - to change form randomly");
                System.out.println("4 + enter - to shout out");
                System.out.println("5 + enter - to change a name of the " + robot);
                System.out.println("6 + enter - to change an armor of the " + robot);
                System.out.println("7 + enter - to go to previous menu");
                System.out.println("8 + enter - to quit");
                if (robot instanceof Failureable) {
                    System.out.println("9 + enter - to test the " + robot);
                }
                if (robot instanceof T800) {
                    System.out.println("10 + enter - to kill T1000");
                }

                try {
                    action = in.nextInt();
                    System.out.println("You entered " + action);
                } catch (java.util.InputMismatchException ex) {
                    System.out.println("You entered incorrect data!");
                    in.nextLine();
                }

                if (action == 1) {
                    robot.move();
                } else if (action == 2) {
                    robot.shoot();
                } else if (action == 3) {
                    robot.changeForm();
                } else if (action == 4) {
                    robot.shoutOut();
                } else if (action == 5) {
                    System.out.println("Pleas, type a new name");
                    String s = in.next();
                    robot.setName(s);
                } else if (action == 6) {
                    System.out.println("Pleas, type a new armor");
                    String s = in.next();
                    robot.setArmor(s);
                } else if (action == 7) {
                    break;
                } else if (action == 8) {
                    stop = true;
                    continue;
                } else if (action == 9) {
                    failureableRobot = (Failureable)robot;
                    failureableRobot.failure();
                } else if (robot instanceof T800 && action == 10) {
                    ((T800) robot).killT1000();
                } else {
                    System.out.println("You entered incorrect data!");
                }
            }
        }
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
