package org.bonus;

public class Playstation implements Device {

    @Override
    public void play() {
        System.out.println("Sono una playstation e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una playstation e sono in modalità stop");
    }
}
