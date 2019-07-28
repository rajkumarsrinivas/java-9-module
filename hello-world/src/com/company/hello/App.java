package com.company.hello;

import com.company.data.MyData;
import com.company.user.MyUser;

import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {
        MyUser m = new MyUser();
        m.print();

        MyData d = new MyData();
        d.print();

    }
}
