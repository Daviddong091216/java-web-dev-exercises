package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(int num) {

        if (num == 1) {
            return "¡Hola, Mundo!";
        } else if (num == 2) {
            return "Bonjour, le monde!";
        } else {
            return "Hello, World!";
        }
    }
}
