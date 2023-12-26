package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {

    @Autowired
    private InternetConnection modem;

    private String owner;
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getDoorno() {
        return doorno;
    }
    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }
    private int doorno;

    public void connect(){
        modem.switchOn();
        System.out.println("Internet is connecting");
    }

    
}
