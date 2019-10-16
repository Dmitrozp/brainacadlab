package com.brainacad.laba19;

public class Game {

    private final String name;
    private final Ganre ganre;
    private Type type;

    private Game(String name, Ganre ganre, Type type) {
        this.name = name;
        this.ganre = ganre;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public static GameDisk getDisk(String name, Ganre ganre, Type type, String description){
        return new GameDisk(name, ganre, type, description);

    }

    public static VirtualGame getVirtualGame(String name, Ganre ganre){
        return new VirtualGame(name,ganre);

    }


    public static class GameDisk{

        private String description;
        private Game data;

        private Game GameDisk(String name, Ganre ganre, Type type, String description) {
            new Game(name, ganre, type);
            this.description = description;
        }
   }

   public static class VirtualGame{

        private int rating;
        private  Game data;

       private VirtualGame(String name, Ganre ganre) {
           new Game(name,ganre, Type.VIRTUAL);

       }

       public int getRating() {
           return rating;
       }

       public void setRating(int rating) {
           this.rating = rating;
       }

       public Game getData() {
           return data;
       }
   }



}
