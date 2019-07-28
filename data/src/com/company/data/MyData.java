package com.company.data;

import com.company.secure.MySecurity;

public class MyData {

    public void print() {
        System.out.println("I am Data....");
        MySecurity m = new MySecurity();
        m.secure();
    }
}
