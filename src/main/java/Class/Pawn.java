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
public class Pawn extends Piece {
    
    private boolean FirstMove;
    
    public Pawn(int posX, int posY, String name, String color, JPanel baseChess, chessHex ch) {
        super(posX, posY, name, color, baseChess, ch);
        this.setType("pawn");
        this.FirstMove = true;
  
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

     public boolean ValidateTo(int x, int y, int type, int amount){
        int oX = this.gethX();
        int oY = this.gethY();
        //Movimiento valido revisar que direccion va
        switch(type){
            //Toward
            case 1:
                if (this.getCh().getWhite()) {
            //White Up
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
                      if (this.Check(oX, oY-(amount*2))) {
                          this.newPosition(oX, oY-(amount*2));
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
              }
        }else{
            //Black Above
             //4
                  if (oX>x && oY<y) {
                    if (this.Check(oX-amount, oY+amount)) {
                    this.newPosition(oX-amount, oY+amount);
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX==x && oY<y) {
                  if (this.Check(oX, oY+(amount*2))) {
                    this.newPosition(oX, oY+(amount*2));
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
            
        }
            case 2:
            //AwayFrom
               if (this.getCh().getWhite()) {
            //White Up
            
             //4
                  if (oX>x && oY<y) {
                   // System.out.println("22");
                    //System.out.println(x+"--"+y);
                   // System.out.println(oX+"--"+oY);
                    //System.out.println((oX+amount)+"--"+(oY-amount));
                    if (this.Check(oX+amount, oY-amount)) {
                       // System.out.println("221");
                    this.newPosition(oX+amount, oY-amount);
                    
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX==x && oY<y) {
                  if (this.Check(oX, oY-(amount*2))) {
                    this.newPosition(oX, oY-(amount*2));
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
        }else{
            //Black Above
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
                      if (this.Check(oX, oY+(amount*2))) {
                          this.newPosition(oX, oY+(amount*2));
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
              }
            
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
    public boolean Validate(int x, int y){
        int oX = this.gethX();
        int oY = this.gethY();
        //Movimiento valido revisar que direccion va
        if (this.getCh().getWhite()) {
            //White Up
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
              }
        }else{
            //Black Above
             //4
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
           return false; 
    }
    @Override
    public boolean MoveTo(String name) {
        
        if (this.getCh().getWhite()) {
            if (this.getCh().getPlayer1().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (this.CheckTo(p.gethX(),(p.gethY()))) {
                        this.Validate(p.gethX(),(p.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (this.CheckTo(b.gethX(),(b.gethY()))) {
                        this.Validate(b.gethX(),(b.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (this.CheckTo(h.gethX(),(h.gethY()))) {
                        this.Validate(h.gethX(),(h.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (this.CheckTo(t.gethX(),(t.gethY()))) {
                        this.Validate(t.gethX(),t.gethY());
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (this.CheckTo(q.gethX(),(q.gethY()))) {
                        this.Validate(q.gethX(),(q.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    if (this.CheckTo(k.gethX(),(k.gethY()))) {
                        this.Validate(k.gethX(),(k.gethY()));
                        return true;
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
                    if (this.CheckTo(p.gethX(),(p.gethY()))) {
                        this.Validate(p.gethX(),(p.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (this.CheckTo(b.gethX(),(b.gethY()))) {
                        this.Validate(b.gethX(),(b.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (this.CheckTo(h.gethX(),(h.gethY()))) {
                        this.Validate(h.gethX(),(h.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (this.CheckTo(t.gethX(),(t.gethY()))) {
                        this.Validate(t.gethX(),(t.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen)this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (this.CheckTo(q.gethX(),(q.gethY()))) {
                        this.Validate(q.gethX(),(q.gethY()));
                        return true;
                    }else{
                        return false;
                        }
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    if (this.CheckTo(k.gethX(),(k.gethY()))) {
                        this.Validate(k.gethX(),(k.gethY()));
                        return true;
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

    @Override
    public boolean Move(int x, int y) {
        if (this.Check(x, y)) {
            this.newPosition(x, y);
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean Check(int x, int y) {
        
         if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
             //Check color
             if (this.getCh().getWhite()) {
                 //White
                 if (FirstMove) {
                     //Firstmove
                     this.FirstMove = false;
                     if (this.gethX() == x && (this.gethY()-2 == y || this.gethY()-4 == y) && (this.getCh().getChess().get(y).get(x).isOccuped() == false)
                         ||(this.gethX()-1 == x && this.gethY()-1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped() && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))
                         ||(this.gethX()+1 == x && this.gethY()-1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped() && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))) {
                         return true;
                     }else{
                         return false;
                     }
                 }else{
                     //n move Here Can Eat
                     //Chech left
                     if ((this.gethX()-1 == x && this.gethY()-1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped()
                             && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))) {
                         return true;
                         //Check right
                     }else if ((this.gethX()+1 == x && this.gethY()-1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped()
                             && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))) {
                         return true;
                         //Check forward 
                     }else if (this.gethX() == x && (this.gethY()-2 == y)&& (this.getCh().getChess().get(y).get(x).isOccuped() == false)) {
                         return true;
                     }else{
                     return false;
                 }
                 }
             }else{
                 //Black
                 if (FirstMove) {
                     //FirstMove
                     this.FirstMove = false;
                     if (this.gethX() == x && (this.gethY()+2 == y || this.gethY()+4 == y) && (this.getCh().getChess().get(y).get(x).isOccuped() == false)
                         ||(this.gethX()-1 == x && this.gethY()+1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped() 
                             && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))
                         ||(this.gethX()+1 == x && this.gethY()+1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped())
                             && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor())) {
                         return true;
                     }else{
                         return false;
                     }
                 }else{
                     //n move Here Can Eat
                     //Chech left
                     if ((this.gethX()-1 == x && this.gethY()+1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped())
                             && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor())) {
                         return true;
                         //Check right
                     }else if ((this.gethX()+1 == x && this.gethY()+1 == y) && (this.getCh().getChess().get(y).get(x).isOccuped()
                             && !this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))) {
                         return true;
                         //Check forward 
                     }else if (this.gethX() == x && (this.gethY()+2 == y)&& (this.getCh().getChess().get(y).get(x).isOccuped() == false)) {
                         return true;
                     }else{
                     return false;
                 }
                 }
             }
        }else{
            return false;
        }
    }

    

    
}