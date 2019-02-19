package edu.gatech.cs2340.spacetraderredux.ViewModels;

import android.arch.lifecycle.ViewModel;

import edu.gatech.cs2340.spacetraderredux.Model.*;

public class ConfigurationViewModel extends ViewModel {
    private static Game game;
    private String name = "Player1";
    public Difficulty difficulty = Difficulty.EASY;
    public int pilot;
    public int fighter;
    public int trader;
    public int engineer;
    private int remaining = 16;

    public void updateRemaining() {
        remaining = 16 - (pilot + fighter + trader + engineer);
    }

    public String getRemaining() {
        return Integer.toString(remaining);
    }
    public void incDifficulty() {
        difficulty = Difficulty.values()[(difficulty.ordinal() + 1) % Difficulty.values().length];
    }

    public void decDifficulty() {
        difficulty = Difficulty.values()[(difficulty.ordinal() + Difficulty.values().length - 1) % Difficulty.values().length];
    }

    public void decPoints(int flag) {
        switch (flag) {
            case 0:
                if (pilot > 0) pilot--;
                break;
            case 1:
                if (fighter > 0) fighter--;
                break;
            case 2:
                if (trader > 0) trader--;
                break;
            case 3:
                if (engineer > 0) engineer--;
                break;
        }
        updateRemaining();
    }

    public void incPoints(int flag) {
       if (remaining > 0) {
           switch (flag) {
               case 0:
                   pilot++;
                   break;
               case 1:
                   fighter++;
                   break;
               case 2:
                   trader++;
                   break;
               case 3:
                   engineer++;
                   break;
           }
       }
       updateRemaining();
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean validPlayer() {
        updateRemaining();
        return name.length() > 0 && (remaining == 0);
    }
    public String createPlayer() {
        Player player = new Player(name, pilot, fighter, trader, engineer);
        game = new Game(player, difficulty);
        return player.toString();

    }
}
