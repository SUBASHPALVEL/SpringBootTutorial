package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
    private String ipAddress;
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    private int speed;

    public void switchOn(){
        System.out.println("Internet is switching on");
    }

}
