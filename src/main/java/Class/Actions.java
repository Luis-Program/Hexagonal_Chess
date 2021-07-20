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
public interface Actions {
    
    
    public boolean Move(int x,int y);
    
    public boolean MoveTo(String name);
    
    public boolean MoveToward(String name, int x);
    
    public boolean MoveAwayFrom(String name,int x);
    
    public boolean Check(int x, int y);
    
    public void Name(String name);
    
    public Integer PosX();
    
    public Integer PosY();
    
    
}
