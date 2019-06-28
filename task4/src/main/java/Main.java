package main.java;

import main.java.classes.BanknoteKeeper;

public class Main {
    public static void main(String[] args) {
        BanknoteKeeper banknoteKeeper = new BanknoteKeeper();
        System.out.println(banknoteKeeper.withdrawCash(23369.44));
    }
}
