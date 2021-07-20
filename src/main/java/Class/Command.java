/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;

/**
 *
 * @author luisc
 */
public class Command {
    
    private String PieceName;
    private String ToPieceName;
    private int Command;
    private int PosX;
    private int PosY;
    

    public Command(String PieceName,int Command) {
        this.PieceName = PieceName;
        this.Command = Command;
    }
    
    public Command(String PieceName, int Command, String ToPieceName) {
        this.PieceName = PieceName;
        this.Command = Command;
        this.ToPieceName = ToPieceName;
    }
     

    public Command(String PieceName, int Command, int PosX, int PosY) {
        this.PieceName = PieceName;
        this.Command = Command;
        this.PosX = PosX;
        this.PosY = PosY;
    }

    public Command(String PieceName, int Command, String ToPieceName, int PosX) {
        this.PieceName = PieceName;
        this.Command = Command;
        this.ToPieceName = ToPieceName;
        this.PosX = PosX;
    }

    public Command(int Command) {
        this.Command = Command;
    }
    
    
    public String getPieceName() {
        return PieceName;
    }

    public void setPieceName(String PieceName) {
        this.PieceName = PieceName;
    }

    public String getToPieceName() {
        return ToPieceName;
    }

    public void setToPieceName(String ToPieceName) {
        this.ToPieceName = ToPieceName;
    }

    public int getCommand() {
        return Command;
    }

    public void setCommand(int Command) {
        this.Command = Command;
    }

    public int getPosX() {
        return PosX;
    }

    public void setPosX(int PosX) {
        this.PosX = PosX;
    }

    public int getPosY() {
        return PosY;
    }

    public void setPosY(int PosY) {
        this.PosY = PosY;
    }

}
