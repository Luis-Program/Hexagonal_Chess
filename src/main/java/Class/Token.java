/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;

import java.io.Serializable;

/**
 *
 * @author luisc
 */
public class Token implements Serializable{
    private int code;
    private String string;
    private int line;
    private int col;

    public Token(int code, String string, int line, int col) {
        this.code = code;
        this.string = string;
        this.line = line;
        this.col = col;
        
    }
    
    public Token(String str){
        this.string = str;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    public int toInteger(){
        return Integer.parseInt(this.string);
    }
    
    
    
}