package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home2 {

    public Home2(){
        System.out.println("Home Home");
    }

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
        System.out.println("Internet is connecting");
    }
}
