/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luisc
 */
public class Player {
    
    private Map<String,Object> playerChess = new HashMap<>();
    private String color;

    public Player(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    
    public Map<String, Object> getPlayerChess() {
        return playerChess;
    }

    public void setPlayerChess(Map<String, Object> playerChess) {
        this.playerChess = playerChess;
    }
    
}
