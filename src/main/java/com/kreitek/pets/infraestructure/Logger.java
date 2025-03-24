package com.kreitek.pets.infraestructure;

public class Logger {
    private static int counter = 1;

    public void debug (String message){
        System.out.println("[debug][" + counter + "] - " + message);
        counter++;
    }
}
