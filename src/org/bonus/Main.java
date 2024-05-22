package org.bonus;

public class Main {
    public static void main(String[] args) {
        String device1String= "Playstation";
        String device2String= "Lettore dvd";
        Device device1= Creator.create(device1String);
        Device device2= Creator.create(device2String);

        System.out.println("*********");
        device1.play();
        device1.stop();

        System.out.println("*********");
        device2.play();
        device2.stop();
    }
}
