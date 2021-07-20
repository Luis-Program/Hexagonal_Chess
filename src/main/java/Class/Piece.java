/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Class;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.java.com.mycompany.chess.Jframe.chessHex;

/**
 *
 * @author luisc
 */
public  class Piece implements Actions{
    
    private int posX;
    private int posY;
    private String name;
    private String color;
    private String type;
    private JPanel baseChess;
    private Graphics g;
    private chessHex ch;
    private int hX;
    private int hY;

    public Piece(int hX, int hY, String name, String color, JPanel baseChess,chessHex ch) {
        this.hX = hX;
        this.hY = hY;
        this.name = name;
        this.color = color;
        this.baseChess = baseChess;
        this.ch = ch;
        this.posX = this.ch.getChess().get(hY).get(hX).getPosX();
        this.posY = this.ch.getChess().get(hY).get(hX).getPosY();
    }

    public chessHex getCh() {
        return ch;
    }

        
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    

    public void newPosition(int x, int y){
        /*if (this.ch.getChess().containsKey(y) && this.ch.getChess().get(y).containsKey(x)) {
            //Limpiar posicion antigua del tablero
            this.ch.getChess().get(hY).get(hX).setPiece(null);
            this.ch.getChess().get(hY).get(hX).setOccuped(false);
            this.ch.getChess().get(hY).get(hX).setColor(null);
            this.hX = x;
            this.hY = y;
            this.posX = this.ch.getChess().get(y).get(x).getPosX();
            this.posY = this.ch.getChess().get(y).get(x).getPosY();
            //this.paint(this.g);
            //Colocar ocupado en la nueva posicion
            this.ch.getChess().get(y).get(x).setPiece(this);
            this.ch.getChess().get(y).get(x).setOccuped(true);
            this.ch.getChess().get(y).get(x).setColor(this.color);
            this.ch.repaint();
        }else{
            System.out.println("No existe esa posicion");
        }*/
        
        if(!this.ch.isPaused()){
            
        if (this.ch.getChess().get(y).get(x).isOccuped()) {
            if (this.ch.getWhite()) {
            //Obtener pieza del tablero que se va a eliminar y buscar que es ademas de eliminarla al jugador 2
                if (this.ch.getChess().get(y).get(x).getPiece() instanceof Pawn) {
                    Pawn p = (Pawn) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer2().getPlayerChess().remove(p.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Bishop) {
                    Bishop b = (Bishop) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer2().getPlayerChess().remove(b.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Horse) {
                    Horse h = (Horse) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer2().getPlayerChess().remove(h.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Tower) {
                    Tower t = (Tower) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer2().getPlayerChess().remove(t.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Queen) {
                    Queen q = (Queen) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer2().getPlayerChess().remove(q.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof King) {
                    King k = (King) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer2().getPlayerChess().remove(k.getName());
                }
            //Limpiar posicion antigua del tablero
            this.ch.getChess().get(hY).get(hX).setPiece(null);
            this.ch.getChess().get(hY).get(hX).setOccuped(false);
            this.ch.getChess().get(hY).get(hX).setColor(null);
            this.hX = x;
            this.hY = y;
            this.posX = this.ch.getChess().get(y).get(x).getPosX();
            this.posY = this.ch.getChess().get(y).get(x).getPosY();
            //this.paint(this.g);
            //Colocar ocupado en la nueva posicion
            this.ch.getChess().get(y).get(x).setPiece(this);
            this.ch.getChess().get(y).get(x).setOccuped(true);
            this.ch.getChess().get(y).get(x).setColor(this.color);
            this.ch.repaint();
            }else{
                 //Obtener pieza del tablero que se va a eliminar y buscar que es ademas de eliminarla al jugador 1
                if (this.ch.getChess().get(y).get(x).getPiece() instanceof Pawn) {
                    Pawn p = (Pawn) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer1().getPlayerChess().remove(p.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Bishop) {
                    Bishop b = (Bishop) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer1().getPlayerChess().remove(b.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Horse) {
                    Horse h = (Horse) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer1().getPlayerChess().remove(h.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Tower) {
                    Tower t = (Tower) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer1().getPlayerChess().remove(t.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof Queen) {
                    Queen q = (Queen) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer1().getPlayerChess().remove(q.getName());
                }else if (this.ch.getChess().get(y).get(x).getPiece() instanceof King) {
                    King k = (King) this.ch.getChess().get(y).get(x).getPiece();
                    this.ch.getPlayer1().getPlayerChess().remove(k.getName());
                }
            //Limpiar posicion antigua del tablero
            this.ch.getChess().get(hY).get(hX).setPiece(null);
            this.ch.getChess().get(hY).get(hX).setOccuped(false);
            this.ch.getChess().get(hY).get(hX).setColor(null);
            this.hX = x;
            this.hY = y;
            this.posX = this.ch.getChess().get(y).get(x).getPosX();
            this.posY = this.ch.getChess().get(y).get(x).getPosY();
            //this.paint(this.g);
            //Colocar ocupado en la nueva posicion
            this.ch.getChess().get(y).get(x).setPiece(this);
            this.ch.getChess().get(y).get(x).setOccuped(true);
            this.ch.getChess().get(y).get(x).setColor(this.color);
            this.ch.repaint();
            }
            
        }else{
            
            if (this.ch.getWhite()) {
                 //Limpiar posicion antigua del tablero
            this.ch.getChess().get(hY).get(hX).setPiece(null);
            this.ch.getChess().get(hY).get(hX).setOccuped(false);
            this.ch.getChess().get(hY).get(hX).setColor(null);
            this.hX = x;
            this.hY = y;
            this.posX = this.ch.getChess().get(y).get(x).getPosX();
            this.posY = this.ch.getChess().get(y).get(x).getPosY();
            //this.paint(this.g);
            //Colocar ocupado en la nueva posicion
            this.ch.getChess().get(y).get(x).setPiece(this);
            this.ch.getChess().get(y).get(x).setOccuped(true);
            this.ch.getChess().get(y).get(x).setColor(this.color);
            this.ch.repaint();
            }else{
                 
            //Limpiar posicion antigua del tablero
            this.ch.getChess().get(hY).get(hX).setPiece(null);
            this.ch.getChess().get(hY).get(hX).setOccuped(false);
            this.ch.getChess().get(hY).get(hX).setColor(null);
            this.hX = x;
            this.hY = y;
            this.posX = this.ch.getChess().get(y).get(x).getPosX();
            this.posY = this.ch.getChess().get(y).get(x).getPosY();
            //this.paint(this.g);
            //Colocar ocupado en la nueva posicion
            this.ch.getChess().get(y).get(x).setPiece(this);
            this.ch.getChess().get(y).get(x).setOccuped(true);
            this.ch.getChess().get(y).get(x).setColor(this.color);
            this.ch.repaint();
            }
           
        }
        
        int aux =main.java.com.mycompany.chess.Jframe.chessHex.getMovesCounter();
        aux--;
        main.java.com.mycompany.chess.Jframe.chessHex.setMovesCounter(aux);       
        main.java.com.mycompany.chess.Jframe.chessHex.getMLeft().setText("Moves Left: "+aux);
        if(main.java.com.mycompany.chess.Jframe.chessHex.getMovesCounter()==0){
           this.ch.setPaused(true);
           int o = 60; 
           main.java.com.mycompany.chess.Jframe.chessHex.setPlayerCounter(o);
           main.java.com.mycompany.chess.Jframe.chessHex.setMovesCounter(3);
           main.java.com.mycompany.chess.Jframe.chessHex.getMLeft().setText("Moves Left: "+main.java.com.mycompany.chess.Jframe.chessHex.getMovesCounter());
            /*if (this.ch.getWhite()) {
                this.ch.setWhite(false);
                this.ch.setBlack(true);
            }else{
                this.ch.setWhite(true);
                this.ch.setBlack(false);
            }*/
           
        }
        
         
           
         
        
        
        
        }
        
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int gethX() {
        return hX;
    }

    public int gethY() {
        return hY;
    }

    
    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public JPanel getBaseChess() {
        return baseChess;
    }

    public void setBaseChess(JPanel baseChess) {
        this.baseChess = baseChess;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    public void paint(Graphics g){
        this.g = g;
        ImageIcon i = new ImageIcon(getClass().getResource("/images/"+this.type+"_"+this.color+".png"));
        g.drawImage(i.getImage(), this.posX, this.posY, 25, 50,this.baseChess);
        //Save In Chess
        if (this.ch.getChess().containsKey(hY) && this.ch.getChess().get(hY).containsKey(hX)) {
            this.ch.getChess().get(hY).get(hX).setOccuped(true);
            this.ch.getChess().get(hY).get(hX).setPiece(this);
            this.ch.getChess().get(hY).get(hX).setColor(this.color);
        }
    }
   
    @Override
    public Integer PosX() {
        return this.gethX();
    }

    @Override
    public Integer PosY() {
        return this.gethY();
    }

    @Override
    public void Name(String name) {
       
        if (this.ch.getWhite()) {
            if (this.ch.getPlayer1().getPlayerChess().containsKey(name)) {
                JOptionPane.showMessageDialog(this.baseChess, "The name already exist", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                this.name = name;
                this.ch.getPlayer1().getPlayerChess().put(name, this);
                this.ch.getChess().get(hY).get(hX).setPiece(this);
                //this.ch.getPlayer1().getPlayerChess().remove(nameOld);
                
                
               
                                /*if (this.ch.getPlayer1().getPlayerChess().get(nameOld) instanceof Pawn) {
                                    Pawn p = (Pawn) this.ch.getPlayer1().getPlayerChess().get(nameOld);
                                    p.setName(name);
                                    this.ch.getChess().get(p.getPosY()).get(p.getPosX()).setPiece(p);
                                    this.ch.getPlayer1().getPlayerChess().put(name, p);
                                }else if (this.ch.getPlayer1().getPlayerChess().get(nameOld) instanceof Bishop) {
                                    Bishop b = (Bishop) this.ch.getPlayer1().getPlayerChess().get(nameOld);
                                    b.setName(name);
                                    this.ch.getChess().get(b.getPosY()).get(b.getPosX()).setPiece(b);
                                    this.ch.getPlayer1().getPlayerChess().put(name, b);
                                }else if (this.ch.getPlayer1().getPlayerChess().get(nameOld) instanceof Horse) {
                                    Horse h = (Horse) this.ch.getPlayer1().getPlayerChess().get(nameOld);
                                    h.setName(name);
                                    this.ch.getChess().get(h.getPosY()).get(h.getPosX()).setPiece(h);
                                    this.ch.getPlayer1().getPlayerChess().put(name, h);
                                }else if (this.ch.getPlayer1().getPlayerChess().get(nameOld) instanceof Tower) {
                                    Tower t = (Tower) this.ch.getPlayer1().getPlayerChess().get(nameOld);
                                    t.setName(name);
                                    this.ch.getChess().get(t.getPosY()).get(t.getPosX()).setPiece(t);
                                    this.ch.getPlayer1().getPlayerChess().put(name, t);
                                }else if (this.ch.getPlayer1().getPlayerChess().get(nameOld) instanceof Queen) {
                                    Queen q = (Queen) this.ch.getPlayer1().getPlayerChess().get(nameOld);
                                    q.setName(name);
                                    this.ch.getChess().get(q.getPosY()).get(q.getPosX()).setPiece(q);
                                    this.ch.getPlayer1().getPlayerChess().put(name, q);
                                }else if (this.ch.getPlayer1().getPlayerChess().get(nameOld) instanceof King) {
                                    King k = (King) this.ch.getPlayer1().getPlayerChess().get(nameOld);
                                    k.setName(name);
                                    this.ch.getChess().get(k.getPosY()).get(k.getPosX()).setPiece(k);
                                    this.ch.getPlayer1().getPlayerChess().put(name, k);
                                }
                                
                this.ch.getPlayer1().getPlayerChess().remove(nameOld);*/
            }

        }else{
            if (this.ch.getPlayer2().getPlayerChess().containsKey(name)) {
                JOptionPane.showMessageDialog(this.baseChess, "The name already exist", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                this.name = name;
                this.ch.getPlayer2().getPlayerChess().put(name, this);
                this.ch.getChess().get(posY).get(posX).setPiece(this);
                //this.ch.getPlayer2().getPlayerChess().remove(nameOld);
                               /* if (this.ch.getPlayer2().getPlayerChess().get(nameOld) instanceof Pawn) {
                                    Pawn p = (Pawn) this.ch.getPlayer2().getPlayerChess().get(nameOld);
                                    p.setName(name);
                                    this.ch.getChess().get(p.getPosY()).get(p.getPosX()).setPiece(p);
                                    this.ch.getPlayer2().getPlayerChess().put(name, p);
                                }else if (this.ch.getPlayer2().getPlayerChess().get(nameOld) instanceof Bishop) {
                                    Bishop b = (Bishop) this.ch.getPlayer2().getPlayerChess().get(nameOld);
                                    b.setName(name);
                                    this.ch.getChess().get(b.getPosY()).get(b.getPosX()).setPiece(b);
                                    this.ch.getPlayer2().getPlayerChess().put(name, b);
                                }else if (this.ch.getPlayer2().getPlayerChess().get(nameOld) instanceof Horse) {
                                    Horse h = (Horse) this.ch.getPlayer2().getPlayerChess().get(nameOld);
                                    h.setName(name);
                                    this.ch.getChess().get(h.getPosY()).get(h.getPosX()).setPiece(h);
                                    this.ch.getPlayer2().getPlayerChess().put(name, h);
                                }else if (this.ch.getPlayer2().getPlayerChess().get(nameOld) instanceof Tower) {
                                    Tower t = (Tower) this.ch.getPlayer2().getPlayerChess().get(nameOld);
                                    t.setName(name);
                                    this.ch.getChess().get(t.getPosY()).get(t.getPosX()).setPiece(t);
                                    this.ch.getPlayer2().getPlayerChess().put(name, t);
                                }else if (this.ch.getPlayer2().getPlayerChess().get(nameOld) instanceof Queen) {
                                    Queen q = (Queen) this.ch.getPlayer2().getPlayerChess().get(nameOld);
                                    q.setName(name);
                                    this.ch.getChess().get(q.getPosY()).get(q.getPosX()).setPiece(q);
                                    this.ch.getPlayer2().getPlayerChess().put(name, q);
                                }else if (this.ch.getPlayer2().getPlayerChess().get(nameOld) instanceof King) {
                                    King k = (King) this.ch.getPlayer2().getPlayerChess().get(nameOld);
                                    k.setName(name);
                                    this.ch.getChess().get(k.getPosY()).get(k.getPosX()).setPiece(k);
                                    this.ch.getPlayer2().getPlayerChess().put(name, k);
                                }
                                
                this.ch.getPlayer2().getPlayerChess().remove(nameOld);    */           
            }
        }
                
        this.setName(name);
    }

   
    @Override
    public boolean Move(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean MoveTo(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean MoveToward(String name, int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean MoveAwayFrom(String name, int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Check(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}