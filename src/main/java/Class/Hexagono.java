/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;

import java.awt.Graphics2D;

/**
 *
 * @author luisc
 */
public class Hexagono {
    
    private int posX;
    private int posY;
    private Graphics2D grap;
    private boolean occuped;
    private Object piece;
    private String color;
    public Hexagono(int posX, int posY, Graphics2D grap) {
        this.posX = (posX * (25+12)) + 100;
        this.posY = ((posY * 42 + (posX%2) * 21) - 15)+112;
        this.grap = grap;
        this.occuped = false;
        this.piece = null;
    }

    public Object getPiece() {
        return piece;
    }

    public void setPiece(Object piece) {
        this.piece = piece;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Graphics2D getGrap() {
        return grap;
    }

    public void setGrap(Graphics2D grap) {
        this.grap = grap;
    }

    public boolean isOccuped() {
        return occuped;
    }

    public void setOccuped(boolean occuped) {
        this.occuped = occuped;
    }    
}
