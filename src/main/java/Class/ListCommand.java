/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;

import java.util.ArrayList;

/**
 *
 * @author luisc
 */
public class ListCommand {
    private ArrayList<Command> listCommand;

    public ListCommand(ArrayList<Command> listCommand) {
        this.listCommand = listCommand;
    }

   
    public ArrayList<Command> getListCommand() {
        return listCommand;
    }

    public void setListCommand(ArrayList<Command> listCommand) {
        this.listCommand = listCommand;
    }
    
}
