package com.zipcodewilmington.assessment2.part1;


import java.util.logging.Logger;

public class WuTangConcatenator {
    private Integer input;
    private String name;

    private static Logger logger = Logger.getGlobal();


    public WuTangConcatenator(Integer input) {
        this.input = input;


    }

    public Boolean isWu() {
        return this.input % 3 == 0;
    }


    public Boolean isTang() {
        return this.input % 5 == 0;
    }

    public Boolean isWuTang() {
        return isWu() && isTang();
    }
}

