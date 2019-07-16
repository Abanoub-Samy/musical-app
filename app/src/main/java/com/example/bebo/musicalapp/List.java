package com.example.bebo.musicalapp;

import java.io.Serializable;

public class List implements Serializable {
    String mode;

    public List(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setSong(String song) {
        this.mode = mode;
    }

}
