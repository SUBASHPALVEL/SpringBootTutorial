package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home3 {

    public Home3(){
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

