package com.example;

import com.google.common.base.Joiner;

public class Main {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on(" ");
        System.out.println(joiner.join("Which process", "can I pipe some coffee from?"));
    }
}
