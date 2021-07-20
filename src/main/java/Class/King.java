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
public class King extends Piece {
    
    public King(int posX, int posY, String name, String color, JPanel baseChess, chessHex ch) {
        super(posX, posY, name, color, baseChess, ch);
        this.setType("king");
    }

    @Override
    public boolean Check(int x, int y) {
        if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
            if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                 if ((!this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))
                && ((Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 1)
                || (Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 3)
                || (Math.abs(this.gethX() - x) == 2 && this.gethY() == y)
                || (this.gethX() == x && Math.abs(this.gethY() - y) == 2))) {
                return true;
            }else{
                return false;
            }     
            }else{
                if ((!this.getColor().equals(this.getCh().getChess().get(y).get(x).getColor()))
                && (Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 1)
                || (Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 3)
                || (Math.abs(this.gethX() - x) == 2 && this.gethY() == y)
                || (this.gethX() == x && Math.abs(this.gethY() - y) == 2)) {
                return true;
            }else{
                return false;
            }
            }
            
        }else{
            return false;
        }
    }

   public int CheckToT(int x, int y){
         if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
              if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                  //Occuped 
                  //Tower -->
                  if (((x == this.gethX()) || (Math.abs(this.gethX()-x) == (Math.abs(this.gethY()-y))))) {
                      //Here
                    return 1;
                    }else//Bishop
                         if ((this.gethY() == y)) {
                            return  2;
                            }else {
                                for (int i = 1; i < 5; i++) {
                            if (
                             Math.abs(this.gethX()-x)==i && Math.abs(this.gethY()-y)==(i*3)) {
                            return  2;
                                }
                         }
                }   
                  //End Occuped
              }else{
                  //Tower -->
                  if (((x == this.gethX()) || (Math.abs(this.gethX()-x) == (Math.abs(this.gethY()-y))))) {
                      //Here
                    return 1;
                    }else//Bishop
                         if ((this.gethY() == y)) {
                             return 2;
                            }else {
                            for (int i = 1; i < 5; i++) {
                            if (Math.abs(this.gethX()-x)==i && Math.abs(this.gethY()-y)==(i*3)) {
                                return 2;
                            }
                    }
                }
                    }
            
            }else{
            return 0;
        }
        return 0;
    }
    @Override
    public boolean MoveAwayFrom(String name, int x) {
       if (this.getCh().getWhite()) {
            if (this.getCh().getPlayer1().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(p.gethX(),p.gethY(),CheckToT(p.gethX(),p.gethY()),2,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop)this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(b.gethX(),b.gethY(),CheckToT(b.gethX(),b.gethY()),2,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(h.gethX(),h.gethY(),CheckToT(h.gethX(),h.gethY()),2,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(t.gethX(),t.gethY(),CheckToT(t.gethX(),t.gethY()),2,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(q.gethX(),q.gethY(),CheckToT(q.gethX(),q.gethY()),2,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(k.gethX(),k.gethY(),CheckToT(k.gethX(),k.gethY()),2,x);
                    }
              
            }else{
                return false;
            }
        }else{
            if (this.getCh().getPlayer2().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(p.gethX(),p.gethY(),CheckToT(p.gethX(),p.gethY()),2,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(b.gethX(),b.gethY(),CheckToT(b.gethX(),b.gethY()),2,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(h.gethX(),h.gethY(),CheckToT(h.gethX(),h.gethY()),2,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(t.gethX(),t.gethY(),CheckToT(t.gethX(),t.gethY()),2,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(q.gethX(),q.gethY(),CheckToT(q.gethX(),q.gethY()),2,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(k.gethX(),k.gethY(),CheckToT(k.gethX(),k.gethY()),2,x);
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
                    return ValidateTo(p.gethX(),p.gethY(),CheckToT(p.gethX(),p.gethY()),1,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop)this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(b.gethX(),b.gethY(),CheckToT(b.gethX(),b.gethY()),1,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(h.gethX(),h.gethY(),CheckToT(h.gethX(),h.gethY()),1,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(t.gethX(),t.gethY(),CheckToT(t.gethX(),t.gethY()),1,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(q.gethX(),q.gethY(),CheckToT(q.gethX(),q.gethY()),1,x);
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return ValidateTo(k.gethX(),k.gethY(),CheckToT(k.gethX(),k.gethY()),1,x);
                    }
              
            }else{
                return false;
            }
        }else{
            if (this.getCh().getPlayer2().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(p.gethX(),p.gethY(),CheckToT(p.gethX(),p.gethY()),1,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(b.gethX(),b.gethY(),CheckToT(b.gethX(),b.gethY()),1,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(h.gethX(),h.gethY(),CheckToT(h.gethX(),h.gethY()),1,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(t.gethX(),t.gethY(),CheckToT(t.gethX(),t.gethY()),1,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(q.gethX(),q.gethY(),CheckToT(q.gethX(),q.gethY()),1,x);
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return ValidateTo(k.gethX(),k.gethY(),CheckToT(k.gethX(),k.gethY()),1,x);
                    }
            }else{
                return false;
            }
        }
                
       return false;
    }

     public boolean ValidateTo(int x, int y, int t,int type, int amount){
        int oX = this.gethX();
        int oY = this.gethY();
        //Switch tower 1, bishop 2
        switch(t){
            //Tower
            case 1:
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
            //Bishop
            case 2:
               switch(type){
            //Toward
            case 1:
               //Movimiento valido revisar que direccion va
            //1
              if (oX>x && oY>y) {
                if (this.Check(oX-amount, oY-(3*amount))) {
                    this.newPosition(oX-amount, oY-(3*amount));
                    return true;
                }else{
                       return false;
                     }
              }else //2
                  if (oX<x && oY>y) {
                      if (this.Check(oX+amount, oY-(3*amount))) {
                          this.newPosition(oX+amount, oY-(3*amount));
                          return true;
                        }else{
                        return false;
                            }
              }else //3
                  if (oX<x && oY==y) {
                  if (this.Check(oX+(2*amount), oY)) {
                    this.newPosition(oX+(2*amount),oY);
                    return true;
                }else{
                       return false;
                     }
              }else //4
                  if (oX<x && oY<y) {
                    if (this.Check(oX+amount, oY+(3*amount))) {
                    this.newPosition(oX+amount, oY+(3*amount));
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX>x && oY<y) {
                  if (this.Check(oX-amount, oY+(3*amount))) {
                    this.newPosition(oX-amount, oY+(3*amount));
                    return true;
                }else{
                       return false;
                     }
              }else //6
                  if (oX>x && oY==y) {
                  if (this.Check(oX-(2*amount),oY)) {
                    this.newPosition(oX-(2*amount), oY);
                    return true;
                }else{
                       return false;
                     }
              }else{
                      return false;
                  }
            case 2:
                //AwayFrom
               //Movimiento valido revisar que direccion va
            //1
              if (oX>x && oY>y) {
                if (this.Check(oX+amount, oY+(3*amount))) {
                    this.newPosition(oX+amount, oY+(3*amount));
                    return true;
                }else{
                       return false;
                     }
              }else //2
                  if (oX<x && oY>y) {
                      if (this.Check(oX-amount, oY+(3*amount))) {
                          this.newPosition(oX-amount, oY+(3*amount));
                          return true;
                        }else{
                        return false;
                            }
              }else //3
                  if (oX<x && oY==y) {
                  if (this.Check(oX-(2*amount), oY)) {
                    this.newPosition(oX-(2*amount), oY);
                    return true;
                }else{
                       return false;
                     }
              }else //4
                  if (oX<x && oY<y) {
                    if (this.Check(oX-amount, oY-(3*amount))) {
                    this.newPosition(oX-amount, oY-(3*amount));
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX>x && oY<y) {
                  if (this.Check(oX-amount, oY-(3*amount))) {
                    this.newPosition(oX-amount, oY-(3*amount));
                    return true;
                }else{
                       return false;
                     }
              }else //6
                  if (oX>x && oY==y) {
                  if (this.Check(oX+(2*amount), oY)) {
                    this.newPosition(oX+(2*amount), oY);
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
            default:
                return false;
        }
       
            
    }
    public boolean CheckTo(int x, int y) {
        if (this.getCh().getChess().containsKey(y) && this.getCh().getChess().get(y).containsKey(x)) {
            if (this.getCh().getChess().get(y).get(x).isOccuped()) {
                 if (((Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 1)
                || (Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 3)
                || (Math.abs(this.gethX() - x) == 2 && this.gethY() == y)
                || (this.gethX() == x && Math.abs(this.gethY() - y) == 2)
                || (this.gethX() == x && Math.abs(this.gethY() - y) == 4))
                || (Math.abs(this.gethX() - x) == 4 && this.gethY() == y)
                || (Math.abs(this.gethX() - x) == 2 && Math.abs(this.gethY() - y) == 2)
                || (Math.abs(this.gethX() - x) == 2 && Math.abs(this.gethY() - y) == 4)) {
                return true;
            }else{
                return false;
            }     
            }else{
                if (((Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 1)
                || (Math.abs(this.gethX() - x) == 1 && Math.abs(this.gethY() - y) == 3)
                || (Math.abs(this.gethX() - x) == 2 && this.gethY() == y)
                || (this.gethX() == x && Math.abs(this.gethY() - y) == 2)
                || (this.gethX() == x && Math.abs(this.gethY() - y) == 4))
                || (Math.abs(this.gethX() - x) == 4 && this.gethY() == y)
                || (Math.abs(this.gethX() - x) == 2 && Math.abs(this.gethY() - y) == 2)
                || (Math.abs(this.gethX() - x) == 2 && Math.abs(this.gethY() - y) == 4)) {
                return true;
            }else{
                return false;
            }
            }
            
        }else{
            return false;
        }
    }
    public boolean Validate(int x, int y,int t){
        int oX = this.gethX();
        int oY = this.gethY();
         switch(t){
            //Tower
            case 1:
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
                  if (this.Check(x-1, y-1)) {
                    this.newPosition(x-1, y-1);
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

            //Bishop
            case 2:
               //Movimiento valido revisar que direccion va
            //1
              if (oX>x && oY>y) {
                if (this.Check(x+1, y+3)) {
                    this.newPosition(x+1, y+3);
                    return true;
                }else{
                       return false;
                     }
              }else //2
                  if (oX<x && oY>y) {
                      if (this.Check(x-1, y+3)) {
                          this.newPosition(x-1, y+3);
                          return true;
                        }else{
                        return false;
                            }
              }else //3
                  if (oX<x && oY==y) {
                  if (this.Check(x-2, y)) {
                    this.newPosition(x-2,y);
                    return true;
                }else{
                       return false;
                     }
              }else //4
                  if (oX<x && oY<y) {
                    if (this.Check(x-1, y-3)) {
                    this.newPosition(x-1, y-3);
                    return true;
                    }else{
                       return false;
                     }
              }else //5
                  if (oX>x && oY<y) {
                  if (this.Check(x+1, y-3)) {
                    this.newPosition(x+1, y-3);
                    return true;
                }else{
                       return false;
                     }
              }else //6
                  if (oX>x && oY==y) {
                  if (this.Check(x+2,y)) {
                    this.newPosition(x+2, y);
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
                        return Validate(p.gethX(),p.gethY(),CheckToT(p.gethX(),p.gethY()));
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return Validate(b.gethX(),b.gethY(),CheckToT(b.gethX(),b.gethY()));
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return Validate(h.gethX(),h.gethY(),CheckToT(h.gethX(),h.gethY()));
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return Validate(t.gethX(),t.gethY(),CheckToT(t.gethX(),t.gethY()));
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return Validate(q.gethX(),q.gethY(),CheckToT(q.gethX(),q.gethY()));
                    }else if (this.getCh().getPlayer1().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer1().getPlayerChess().get(name);
                    return Validate(k.gethX(),k.gethY(),CheckToT(k.gethX(),k.gethY()));
                    }
              
            }else{
                return false;
            }
        }else{
            if (this.getCh().getPlayer2().getPlayerChess().containsKey(name)) {
                if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Pawn) {
                    Pawn p = (Pawn) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return Validate(p.gethX(),p.gethY(),CheckToT(p.gethX(),p.gethY()));
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Bishop) {
                    Bishop b = (Bishop)this.getCh().getPlayer2().getPlayerChess().get(name);
                    return Validate(b.gethX(),b.gethY(),CheckToT(b.gethX(),b.gethY()));
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Horse) {
                    Horse h = (Horse) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return Validate(h.gethX(),h.gethY(),CheckToT(h.gethX(),h.gethY()));
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Tower) {
                    Tower t = (Tower) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return Validate(t.gethX(),t.gethY(),CheckToT(t.gethX(),t.gethY()));
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof Queen) {
                    Queen q = (Queen) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return Validate(q.gethX(),q.gethY(),CheckToT(q.gethX(),q.gethY()));
                    }else if (this.getCh().getPlayer2().getPlayerChess().get(name) instanceof King) {
                    King k = (King) this.getCh().getPlayer2().getPlayerChess().get(name);
                    return Validate(k.gethX(),k.gethY(),CheckToT(k.gethX(),k.gethY()));
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
    
}
