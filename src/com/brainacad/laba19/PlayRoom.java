package com.brainacad.laba19;

public class PlayRoom {

    public static void main(String[] args) {

    Game[] games = new Game[4];

    games[0] = Game.getDisk("Марио", Ganre.ACTION, Type.PHYSICAL,"супер марио");
    games[1] = Game.getDisk("Контра", Ganre.ACTION, Type.PHYSICAL, "Контра");
    games[2] = Game.getDisk("Старкрафт", Ganre.ACTION, Type.PHYSICAL, "Старкрафт");
    games[3] = Game.getDisk("Редалерт", Ganre.ACTION, Type.PHYSICAL, "Редалерт");

    }

}
