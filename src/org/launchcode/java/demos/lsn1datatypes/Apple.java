package org.launchcode.java.demos.lsn1datatypes;

public class Apple {

    int i = 0;

    Apple eatApple() {
        System.out.println(i);
        i++;
        return this;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eatApple().eatApple().eatApple();
    }

}
