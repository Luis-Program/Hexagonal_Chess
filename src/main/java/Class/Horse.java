/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;

import javax.swing.JPanel;
import main.java.com.mycompany.chess.Jframe.chessHex;

/**
 *
 * @author luisc
 */
public class Horse extends Piece{
    
    public Horse(int posX, int posY, String name, String color, JPanel baseChess, chessHex ch) {
        super(posX, posY, name, color, baseChess, ch);
        this.setType("horse");
    }

    @Override
    public boolean Check(int x, int y) {
        if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
            if (this.getCh().getChess().get(y).get(x).isOccuped()) {
               if ((!this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))
                && ((Math.abs(this.gethX()-x) == 3 && Math.abs(this.gethY() - y) == 1) 
                || (Math.abs(this.gethX()-x) == 2 && Math.abs(this.gethY() - y) == 4)
                || (Math.abs(this.gethX()-x) == 1 && Math.abs(this.gethY() - y) == 5))) {
                return true;
            }else{
                return false;
            }             
            }else{
                if ((Math.abs(this.gethX()-x) == 3 && Math.abs(this.gethY() - y) == 1) 
                || (Math.abs(this.gethX()-x) == 2 && Math.abs(this.gethY() - y) == 4)
                || (Math.abs(this.gethX()-x) == 1 && Math.abs(this.gethY() - y) == 5)
                    ) {
                return true;
            }else{
                return false;
            }
            }
            
        }else{
            return false;
        }
    }

    @Override
    public boolean MoveAwayFrom(String name, int x) {
        return false;
    }

    @Override
    public boolean MoveToward(String name, int x) {
        return false;
    }

    @Override
    public boolean MoveTo(String name) {
        return false;
    }

    @Override
    public boolean Move(int x, int y) {
        if (this.Check(x, y)) {
            this.newPosition(x, y);
            return true;
        }else{
            return false;
        }
    }
    
}
