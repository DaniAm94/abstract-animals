package org.bonus;

public abstract class Creator {

    public static Device create(String deviceString){
        Device device = null;
        if (deviceString.toLowerCase().equals("playstation")){
            device= new Playstation();
        } else if(deviceString.toLowerCase().equals("lettore dvd")){
            device= new DvdPlayer();
        }
        return device;
    }
}
