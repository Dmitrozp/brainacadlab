package com.brainacad.laba19;

public class Game {

    private final String name;
    private final Ganre ganre;
    private Type type;

    private Game(String name, Ganre ganre) {
        this.name = name;
        this.ganre = ganre;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

   public static class GameDisk{
       // private final String description;
       // private final Game data;

   }



}
