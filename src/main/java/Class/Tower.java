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
public class Tower extends Piece{
    
    public Tower(int posX, int posY, String name, String color, JPanel baseChess, chessHex ch) {
        super(posX, posY, name, color, baseChess, ch);
        this.setType("tower");
    }

    @Override
    public boolean Check(int x, int y) {
        if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
            if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                if ((!this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor())) 
                    && ((x == this.gethX()) || (Math.abs(this.gethX()-x) == (Math.abs(this.gethY()-y))))) {
                    //Here 
                return this.IsOccuped(this.gethX(), this.gethY(), x, y);
            }else{
                return false;
            }
            }else{
                if ((x == this.gethX()) || (Math.abs(this.gethX()-x) == (Math.abs(this.gethY()-y)))) {
                    //Here
                return this.IsOccuped(this.gethX(), this.gethY(), x, y);
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
        
        if (this.getCh().getWhite()) {
            if (this.getCh().getPlayer1().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(p.gethX(),p.gethY())) {
                        return ValidateTo(p.gethX(),p.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop)this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(b.gethX(),b.gethY())) {
                        return ValidateTo(b.gethX(),b.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(h.gethX(),h.gethY())) {
                        return ValidateTo(h.gethX(),h.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(t.gethX(),t.gethY())) {
                        return ValidateTo(t.gethX(),t.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(q.gethX(),q.gethY())) {
                        return ValidateTo(q.gethX(),q.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(k.gethX(),k.gethY())) {
                        return ValidateTo(k.gethX(),k.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }
              
            }else{
                return false;
            }
        }else{
            if (this.getCh().getPlayer2().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(p.gethX(),p.gethY())) {
                        return ValidateTo(p.gethX(),p.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(b.gethX(),b.gethY())) {
                        return ValidateTo(b.gethX(),b.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(h.gethX(),h.gethY())) {
                        return ValidateTo(h.gethX(),h.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(t.gethX(),t.gethY())) {
                        return ValidateTo(t.gethX(),t.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(q.gethX(),q.gethY())) {
                        return ValidateTo(q.gethX(),q.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(k.gethX(),k.gethY())) {
                        return ValidateTo(k.gethX(),k.gethY(),2,x);
                    }else{
                        return false;
                    }
                    }
            }else{
                return false;
            }
        }
                
       return false;
    }
    public boolean ValidateTo(int x, int y, int type, int amount){
        int oX = this.gethX();
        int oY = this.gethY();
        //Movimiento valido revisar que direccion va
        switch(type){
            //Toward
            case 1:
                //1
              if (oX>x && oY>y) {
                if (this.Check(oX-amount, oY-amount)) {
                    this.newPosition(oX-amount, oY-amount);
                    return true;
                }else{
                       return false;
                     }
              }else //2
                  if (oX==x && oY>y) {
                      if (this.Check(oX, oY-(2*amount))) {
                          this.newPosition(oX, oY-(2*amount));
                          return true;
                        }else{
                        return false;
                            }
              }else //3
                  if (oX<x && oY>y) {
                  if (this.Check(oX+amount, oY-amount)) {
                    this.newPosition(oX+amount, oY-amount);
                    return true;
                }else{
                       return false;
                     }
              }else //4
                  if (oX>x && oY<y) {
                    if (this.Check(oX-amount, oY+amount)) {
                    this.newPosition(oX-amount, oY+amount);
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX==x && oY<y) {
                  if (this.Check(oX, oY+(2*amount))) {
                    this.newPosition(oX, oY+(2*amount));
                    return true;
                }else{
                       return false;
                     }
              }else //6
                  if (oX<x && oY<y) {
                  if (this.Check(oX+amount, oY+amount)) {
                    this.newPosition(oX+amount, oY+amount);
                    return true;
                }else{
                       return false;
                     }
              }else{
                      return false;   
                  }
            case 2:
                //AwayFrom
                //1
              if (oX>x && oY>y) {
                if (this.Check(oX+amount, oY+amount)) {
                    this.newPosition(oX+amount, oY+amount);
                    return true;
                }else{
                       return false;
                     }
              }else //2
                  if (oX==x && oY>y) {
                      if (this.Check(oX, oY+(2*amount))) {
                          this.newPosition(oX, oY+(2*amount));
                          return true;
                        }else{
                        return false;
                            }
              }else //3
                  if (oX<x && oY>y) {
                  if (this.Check(oX-amount, oY+amount)) {
                    this.newPosition(oX-amount, oY+amount);
                    return true;
                }else{
                       return false;
                     }
              }else //4
                  if (oX>x && oY<y) {
                    if (this.Check(oX+amount, oY-amount)) {
                    this.newPosition(oX+amount, oY-amount);
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX==x && oY<y) {
                  if (this.Check(oX, oY-(2*amount))) {
                    this.newPosition(oX, oY-(2*amount));
                    return true;
                }else{
                       return false;
                     }
              }else //6
                  if (oX<x && oY<y) {
                  if (this.Check(oX-amount, oY-amount)) {
                    this.newPosition(oX-amount, oY-amount);
                    return true;
                }else{
                       return false;
                     }
              }else{
                      return false;   
                  }
            default:
                return false;
        }
            
    }
    @Override
    public boolean MoveToward(String name, int x) {

        if (this.getCh().getWhite()) {
            if (this.getCh().getPlayer1().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(p.gethX(),p.gethY())) {
                        return ValidateTo(p.gethX(),p.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop)this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(b.gethX(),b.gethY())) {
                        return ValidateTo(b.gethX(),b.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(h.gethX(),h.gethY())) {
                        return ValidateTo(h.gethX(),h.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(t.gethX(),t.gethY())) {
                        return ValidateTo(t.gethX(),t.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(q.gethX(),q.gethY())) {
                        return ValidateTo(q.gethX(),q.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(k.gethX(),k.gethY())) {
                        return ValidateTo(k.gethX(),k.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }
              
            }else{
                return false;
            }
        }else{
            if (this.getCh().getPlayer2().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(p.gethX(),p.gethY())) {
                        return ValidateTo(p.gethX(),p.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(b.gethX(),b.gethY())) {
                        return ValidateTo(b.gethX(),b.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(h.gethX(),h.gethY())) {
                        return ValidateTo(h.gethX(),h.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(t.gethX(),t.gethY())) {
                        return ValidateTo(t.gethX(),t.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(q.gethX(),q.gethY())) {
                        return ValidateTo(q.gethX(),q.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(k.gethX(),k.gethY())) {
                        return ValidateTo(k.gethX(),k.gethY(),1,x);
                    }else{
                        return false;
                    }
                    }
            }else{
                return false;
            }
            
        }
        return false;
    }

    public boolean Validate(int x, int y){
        int oX = this.gethX();
        int oY = this.gethY();
        //Movimiento valido revisar que direccion va
            //1
              if (oX>x && oY>y) {
                if (this.Check(x+1, y+1)) {
                    this.newPosition(x+1, y+1);
                    return true;
                }else{
                       return false;
                     }
              }else //2
                  if (oX==x && oY>y) {
                      if (this.Check(x, y+2)) {
                          this.newPosition(x, y+2);
                          return true;
                        }else{
                        return false;
                            }
              }else //3
                  if (oX<x && oY>y) {
                  if (this.Check(x-1, y+1)) {
                    this.newPosition(x-1, y+1);
                    return true;
                }else{
                       return false;
                     }
              }else //4
                  if (oX>x && oY<y) {
                    if (this.Check(x+1, y-1)) {
                    this.newPosition(x+1, y-1);
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX==x && oY<y) {
                  if (this.Check(x, y-2)) {
                    this.newPosition(x, y-2);
                    return true;
                }else{
                       return false;
                     }
              }else //6
                  if (oX<x && oY<y) {
                  if (this.Check(x-1, y-1)) {
                    this.newPosition(x-1, y-1);
                    return true;
                }else{
                       return false;
                     }
              }else{
                      return false;
                  }
    }
    @Override
    public boolean MoveTo(String name) {
        
        if (this.getCh().getWhite()) {
            if (this.getCh().getPlayer1().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(p.gethX(),p.gethY())) {
                        return Validate(p.gethX(),p.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop)this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(b.gethX(),b.gethY())) {
                        return Validate(b.gethX(),b.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(h.gethX(),h.gethY())) {
                        return Validate(h.gethX(),h.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(t.gethX(),t.gethY())) {
                        return Validate(t.gethX(),t.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(q.gethX(),q.gethY())) {
                        return Validate(q.gethX(),q.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (CheckTo(k.gethX(),k.gethY())) {
                        return Validate(k.gethX(),k.gethY());
                    }else{
                        return false;
                    }
                    }
              
            }else{
                return false;
            }
        }else{
            if (this.getCh().getPlayer2().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(p.gethX(),p.gethY())) {
                        return Validate(p.gethX(),p.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(b.gethX(),b.gethY())) {
                        return Validate(b.gethX(),b.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(h.gethX(),h.gethY())) {
                        return Validate(h.gethX(),h.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(t.gethX(),t.gethY())) {
                        return Validate(t.gethX(),t.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(q.gethX(),q.gethY())) {
                        return Validate(q.gethX(),q.gethY());
                    }else{
                        return false;
                    }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (CheckTo(k.gethX(),k.gethY())) {
                        return Validate(k.gethX(),k.gethY());
                    }else{
                        return false;
                    }
                    }
            }else{
                return false;
            }
        }
                
       return false;
    }

    public boolean CheckTo(int x, int y){
        if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
            if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                if (((x == this.gethX()) || (Math.abs(this.gethX()-x) == (Math.abs(this.gethY()-y))))) {
                    //Here 
                return true;
            }else{
                return false;
            }
            }else{
                if ((x == this.gethX()) || (Math.abs(this.gethX()-x) == (Math.abs(this.gethY()-y)))) {
                    //Here
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
    public boolean Move(int x, int y) {
        if (this.Check(x, y)) {
            this.newPosition(x, y);
            return true;
        }else{
            return false;
        }
    }

    public boolean IsOccuped(int oX, int oY, int x , int y){
        
        //1
        boolean Occuped = true;
        if (oX>x && oY>y) {
            y++; x++;
            if (oX!=x && oY!=y) {
                while(oX!=x && oY!=y){
                    if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                        Occuped = false;
                        y++; x++;
                    }else{
                        y++; x++;
                }
                }
                return Occuped;
            }else{
                return true;
            }
            
        }else //2 
            if (oX==x && oY>y) {
                y = y+2;
             //y=+2;
            if (oY!=y) {
                while(oY!=y){
                    if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                        Occuped = false;
                        
                    }y = y+2;
                }
                return Occuped;
                
            }else{
                return true;
            }
        }else //3 
            if (oX<x && oY>y) {
             y++;x--; 
            if (oX!=x && oY!=y) {
                while(oX!=x && oY!=y){
                    if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                        Occuped = false;
                    }
                        y++; x--;
                
                }
                return Occuped;
                
            }else{
                return true;
            }
        }else //4
            if (oX<x && oY<y) {
             y--;x--; 
            if (oX!=x && oY!=y) {
                while(oX!=x && oY!=y){
                    if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                        Occuped = false;
                    }
                        y--; x--;
                }
                return Occuped;
                
            }else{
                return true;
            }
        }else //5
            if (oX==x && oY<y) {
             y = y-2;
            if (oY!=y) {
                while(oY!=y){
                    if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                        Occuped = false;
                    }
                        y = y-2;
               
                }
                return Occuped;
                
            }else{
                return true;
            }
        }else //6
            if (oX>x && oY<y) {
             y--;x++;
            if (oX!=x && oY!=y) {
                while(oX!=x && oY!=y){
                    if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                        Occuped = false;
                    }
                        y--;x++;
                
                }
                return Occuped;
                
            }else{
                return true;
            }
        }else{
                System.out.println("Error Tower In: -> Is Occuped");
                return false;
            }
        
        
        
    }

    
    
}
