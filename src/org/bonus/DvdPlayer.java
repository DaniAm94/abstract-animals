package org.bonus;

public class DvdPlayer implements Device{

    @Override
    public void play() {
        System.out.println("Sono un lettore Dvd e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono un lettore Dvd e sono in modalità stop");
    }
}
