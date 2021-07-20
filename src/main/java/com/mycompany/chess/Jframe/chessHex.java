/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.chess.Jframe;

import Lexical.Scanner;
import Syntactic.Parser;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import main.java.Class.Bishop;
import main.java.Class.Hexagono;
import main.java.Class.Horse;
import main.java.Class.King;
import main.java.Class.ListCommand;
import main.java.Class.Pawn;
import main.java.Class.Player;
import main.java.Class.Queen;
import main.java.Class.Tower;


/**
 *
 * @author luisc
 */
public class chessHex extends javax.swing.JFrame {

  private  Map<Integer,Map<Integer,Hexagono>> chess = new HashMap<>();
  private Parser pars;


    public Map<Integer, Map<Integer, Hexagono>> getChess() {
        return chess;
    }

    public void setChess(Map<Integer, Map<Integer, Hexagono>> chess) {
        this.chess = chess;
    }

    public Boolean getWhite() {
        return White;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Boolean getBlack() {
        return Black;
    }

    public void setWhite(Boolean White) {
        this.White = White;
    }

    public void setBlack(Boolean Black) {
        this.Black = Black;
    }

    public void DoActions(ListCommand l){
        

        
        if (!l.getListCommand().isEmpty()) {
            if (White) {
                for (int i = 0; i < l.getListCommand().size(); i++) {
                    if (l.getListCommand().get(i)!=null) {
                      if (!Black) {
                switch(l.getListCommand().get(i).getCommand()){
                    case 0:
                        // Comando PosX
                   if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosX( "+p.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosX( "+b.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosX( "+h.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosX( "+t.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosX( "+q.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosX( "+k.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }
              
                    }else{ JOptionPane.showMessageDialog(null, "No es existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 1:
                          // Comando PosY 
                   if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosY( "+p.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosY( "+b.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosY( "+h.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosY( "+t.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosY( "+q.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".PosY( "+k.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }
              
                    }else{ JOptionPane.showMessageDialog(null, " No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 2:
                        //Name Piece
                        if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = p.getName();
                    p.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player1: "+au+".Name( "+p.getName()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player1.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                     String au = b.getName();
                    b.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player1: "+au+".Name( "+b.getName()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player1.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = h.getName();
                    h.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player1: "+au+".Name( "+h.getName()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player1.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                     String au = t.getName();
                    t.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player1: "+au+".Name( "+t.getName()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player1.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                     String au = q.getName();
                    q.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player1: "+au+".Name( "+q.getName()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player1.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = k.getName();
                    k.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player1: "+au+".Name( "+k.getName()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player1.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    }
                    }else{ JOptionPane.showMessageDialog(null, " No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 3:
                        //Move
                        if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                            
                            if(!isPaused()){
                                
                           
                                if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                            String au =p.getName();
                            String rec = "Player1: "+au+".Move("+p.PosX()+","+p.PosY()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                         
                                }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                   if (b.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                         String au =b.getName();
                            String rec = "Player1: "+au+".Move("+b.PosX()+","+b.PosY()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                              
                            
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                          String au =h.getName();
                            String rec = "Player1: "+au+".Move("+h.PosX()+","+h.PosY()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                          
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                       // System.out.println("adentrodeed");
                    if (t.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                           String au =t.getName();
                            String rec = "Player1: "+au+".Move("+t.PosX()+","+t.PosY()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
         
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                            String au =q.getName();
                            String rec = "Player1: "+au+".Move("+q.PosX()+","+q.PosY()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                         String au =k.getName();
                            String rec = "Player1: "+au+".Move("+k.PosX()+","+k.PosY()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;  
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                                
                                
                        
                    }else{
                        
                        String rec = "Player1: supero el numero de Movimientos es turno de Player2 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                    }
                            
                            
                    
                    }else{ JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 4:
                        //MoveTo
                        if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                            
                            
                            if(!isPaused()){
                                
                                
                                
                                 if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                        Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            rec = "Player1:  "+l.getListCommand().get(i).getPieceName()+".MoveTo("+l.getListCommand().get(i).getToPieceName()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento hacia la pieza", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (b.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveTo("+l.getListCommand().get(i).getToPieceName()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento hacia la pieza", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveTo("+l.getListCommand().get(i).getToPieceName()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento hacia la pieza", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveTo("+l.getListCommand().get(i).getToPieceName()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento hacia la pieza", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveTo("+l.getListCommand().get(i).getToPieceName()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento hacia la pieza", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveTo("+l.getListCommand().get(i).getToPieceName()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento hacia la pieza", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                        
                    }else{
                        
                        String rec = "Player1: supero el numero de Movimientos es turno de Player2 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                    }
                            
                            
                            
                   
                    }else{ JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE); }
                        break;
                    case 5:
                        //MoveToward
                        if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                            
                            if(!isPaused()){
                                
                            if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveToward("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                          JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);   
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (b.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveToward("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveToward("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveToward("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveToward("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveToward("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+");"+"\n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                              JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }    
                                
                                
                        
                    }else{
                        
                        String rec = "Player1: supero el numero de Movimientos es turno de Player2 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                    }
                            
                            
                            
                    
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 6:
                        //MoveAwayFrom
                        if (player1.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                            
                            
                            if(!isPaused()){
                                
                                
                               if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                         JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);   
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (b.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                           JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE);  
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;   
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;  
                        }else{
                             JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;  
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            rec = "Player1: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                           JOptionPane.showMessageDialog(null, " No es  posible el movimiento ", "Warning", JOptionPane.WARNING_MESSAGE);  
                        }
                    } 
                        
                    }else{
                        
                        String rec = "Player1: supero el numero de Movimientos es turno de Player2 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                    }
                            
                            
                    
                    }else{ JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE); }
                        break;
                    case 7:
                        //Stats();
                        
                        rec=("player1: Stats()  White:"+this.p1Points+"- Black:"+p2Points+"\n");
                        RecN = RecN+rec;
                        Record.setText(RecN);
                        WriteFF();
                     
                        break;
                    case 8:
                        //DoNothing()
                        
                    if(!DoNothing){
                        DoNothing=true;
                    }else{}
              
                    PlayerCounter=60;
                    MovesCounter=3;
                    MLeft.setText("Moves Left: "+MovesCounter);
                      WriteFF();  
                        
                        break;
                    case 9:
                        //GiveUp
                        
                        
                        GameTime.cancel();
                        PlayerTime.cancel();
                 
                        White=false;
                        Black=false;
                 
                        rec= "Player1 surrender Player2 is the winner"+"\n";
                        RecN = RecN+rec;
                        Record.setText(RecN);

                        setEnded(true);
                        p2Points++;
                        double alter = p2Points;
                        Player2Score(alter);
                        WriteFF();
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, l.getListCommand().get(i).getPieceName()+"--> Falta Punto y Coma.", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, l.getListCommand().get(i).getPieceName()+" -->,<--. Se Esperaba Una Coma Pero Se Encontro Un Punto.", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                        
                }
            }else{
                          break;
                      }
                }}
                WriteFF();
            }else if(Black){
                
                for (int i = 0; i < l.getListCommand().size(); i++) {
                    if (l.getListCommand().get(i)!=null) {
                         if (!White) {
                            
                switch(l.getListCommand().get(i).getCommand()){
                    case 0:
                        // Comando PosX
                   if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosX( "+p.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosX( "+b.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosX( "+h.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosX( "+t.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosX( "+q.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosX( "+k.PosX()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }
              
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE); }
                        break;
                    case 1:
                          // Comando PosY 
                   if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2:"+l.getListCommand().get(i).getPieceName()+".PosY( "+p.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosY( "+b.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosY( "+h.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosY( "+t.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosY( "+q.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".PosY( "+k.PosY()+");"+"\n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    }
              
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 2:
                        //Name Piece
                        if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if (player1.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    p.Name(l.getListCommand().get(i).getToPieceName());
                    
                    
                    String au = p.getName();
                    p.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player2: "+au+".Name("+p.getName()+"); \n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player2.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = b.getName();
                    b.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player2: "+au+".Name("+b.getName()+"); \n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player2.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = h.getName();
                    h.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player2: "+au+".Name("+h.getName()+"); \n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player2.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = t.getName();
                    t.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player2: "+au+".Name("+t.getName()+"); \n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player2.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                   String au = q.getName();
                    q.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player2: "+au+".Name("+q.getName()+"); \n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player2.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    String au = k.getName();
                    k.Name(l.getListCommand().get(i).getToPieceName());
                    String rec = "Player2: "+au+".Name("+k.getName()+"); \n";
                    RecN = RecN+rec;
                    Record.setText(RecN);
                    player2.getPlayerChess().remove(l.getListCommand().get(i).getPieceName());
                    
                    }
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 3:
                        //Move
                        if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if(!isPaused()){
                       if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                            String au =p.getName();
                            String rec = "Player2:  "+au+".Move("+p.PosX()+","+p.PosY()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                   if (b.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                            String au =b.getName();
                            String rec = "Player2:  "+au+".Move("+b.PosX()+","+b.PosY()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                         String au =h.getName();
                            String rec = "Player2:  "+au+".Move("+h.PosX()+","+h.PosY()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;   
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                          String au =t.getName();
                            String rec = "Player2:  "+au+".Move("+t.PosX()+","+t.PosY()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                            String au =q.getName();
                            String rec = "Player2:  "+au+".Move("+q.PosX()+","+q.PosY()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.Move(l.getListCommand().get(i).getPosX(), l.getListCommand().get(i).getPosY())) {
                            String au =k.getName();
                            String rec = "Player2:  "+au+".Move("+k.PosX()+","+k.PosY()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        }else{
                            JOptionPane.showMessageDialog(null, " No es  posible el movimiento", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    } 
                    }else{
                            String rec = "Player2: supero el numero de Movimientos es turno de Player1 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;     
                    }
                    
                    
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 4:
                        //MoveTo
                        if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if(!isPaused()){
                       if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+" MoveTo ("+l.getListCommand().get(i).getToPieceName()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover hacia la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (b.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+" MoveTo ("+l.getListCommand().get(i).getToPieceName()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover hacia la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+" MoveTo ("+l.getListCommand().get(i).getToPieceName()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover hacia la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+" MoveTo ("+l.getListCommand().get(i).getToPieceName()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                           JOptionPane.showMessageDialog(null, "No se puede mover hacia la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+" MoveTo ("+l.getListCommand().get(i).getToPieceName()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover hacia la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.MoveTo(l.getListCommand().get(i).getToPieceName())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+" MoveTo ("+l.getListCommand().get(i).getToPieceName()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover hacia la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } 
                    }else{
                        
                        String rec = "Player2: supero el numero de Movimientos es turno de Player1 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                        
                    }
                    
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 5:
                        //MoveToward
                        if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                            
                            
                            if(!isPaused()){
                                
                                if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveToward( "+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                           JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (b.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveToward( "+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveToward( "+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveToward( "+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveToward( "+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.MoveToward(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveToward( "+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE); 
                        }
                    }
                                
                                
                            }else {String rec = "Player2: supero el numero de Movimientos es turno de Player1 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false;
                                
                            }
                    
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 6:
                        //MoveAwayFrom
                        if (player2.getPlayerChess().containsKey(l.getListCommand().get(i).getPieceName())) {
                    if(!isPaused()){
                       if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Pawn) {
                    Pawn p = (Pawn) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (p.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Bishop) {
                    Bishop b = (Bishop) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                        if (b.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Horse) {
                    Horse h = (Horse) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (h.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Tower) {
                    Tower t = (Tower) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (t.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof Queen) {
                    Queen q = (Queen) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (q.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                            JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }else if (player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName()) instanceof King) {
                    King k = (King) player2.getPlayerChess().get(l.getListCommand().get(i).getPieceName());
                    if (k.MoveAwayFrom(l.getListCommand().get(i).getToPieceName(), l.getListCommand().get(i).getPosX())) {
                            String rec = "Player2: "+l.getListCommand().get(i).getPieceName()+".MoveAwayFrom("+l.getListCommand().get(i).getToPieceName()+","+l.getListCommand().get(i).getPosX()+"); \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; 
                        }else{
                             JOptionPane.showMessageDialog(null, "No se puede mover la pieza ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } 
                    } else{ String rec = "Player2: supero el numero de Movimientos es turno de Player1 \n";
                            RecN = RecN+rec;
                            Record.setText(RecN);
                            DoNothing=false; }
                    
                    }else{JOptionPane.showMessageDialog(null, "No existe esa pieza", "Warning", JOptionPane.WARNING_MESSAGE);}
                        break;
                    case 7:
                        //Stats();
                        rec=("player2:Stats  White:"+this.p1Points+"- Black:"+p2Points+"\n");
                        RecN = RecN+rec;
                        Record.setText(RecN);
                        WriteFF();
                        break;
                    case 8:
                        //DoNothing()
                        
                        if(!DoNothing){
                        DoNothing=true;
                        }else{}
              
                        PlayerCounter=60;
                        MovesCounter=3;
                        MLeft.setText("Moves Left: "+MovesCounter);
                        WriteFF();
                        break;
                    case 9:
                        //GiveUp
                        
                        GameTime.cancel();
                        PlayerTime.cancel();
                 
                        White=false;
                        Black=false;
                 
                        rec= "player2 surrender Player2 is the winner"+"\n";
                        RecN = RecN+rec;
                        Record.setText(RecN);
                        
                        setEnded(true);
                        p1Points++;
                        double alter = p1Points;
                        Player1Score(alter);
                        WriteFF();
                        break;
                     case 10:
                        JOptionPane.showMessageDialog(null, l.getListCommand().get(i).getPieceName()+"--> Falta Punto y Coma.", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, l.getListCommand().get(i).getPieceName()+" -->,<--. Se Esperaba Una Coma Pero Se Encontro Un Punto.", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                        
                }
            }else{
                             break;
                         }}
                }
            WriteFF();}
            
        } 
            
         
        WriteFF();
       
    }
    public Integer PosXY(String pieceName, int m){
        WriteFF();
        if (White) {
            if (player1.getPlayerChess().containsKey(pieceName)) {
                if (m == 1) {
                    if (player1.getPlayerChess().get(pieceName) instanceof Pawn) {
               Pawn p = (Pawn) player1.getPlayerChess().get(pieceName);
               return p.PosX();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Bishop) {
                Bishop b = (Bishop) player1.getPlayerChess().get(pieceName);
                 return b.PosX();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Horse) {
                Horse h = (Horse) player1.getPlayerChess().get(pieceName);
                 return h.PosX();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Tower) {
                Tower t = (Tower) player1.getPlayerChess().get(pieceName);
                 return t.PosX();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Queen) {
                Queen q = (Queen) player1.getPlayerChess().get(pieceName);
                 return q.PosX();
            }else if (player1.getPlayerChess().get(pieceName) instanceof King) {
                King k = (King) player1.getPlayerChess().get(pieceName);
                 return k.PosX();
            }
                }else{
                    if (player1.getPlayerChess().get(pieceName) instanceof Pawn) {
               Pawn p = (Pawn) player1.getPlayerChess().get(pieceName);
               return p.PosY();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Bishop) {
                Bishop b = (Bishop) player1.getPlayerChess().get(pieceName);
                 return b.PosY();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Horse) {
                Horse h = (Horse) player1.getPlayerChess().get(pieceName);
                 return h.PosY();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Tower) {
                Tower t = (Tower) player1.getPlayerChess().get(pieceName);
                 return t.PosY();
            }else if (player1.getPlayerChess().get(pieceName) instanceof Queen) {
                Queen q = (Queen) player1.getPlayerChess().get(pieceName);
                 return q.PosY();
            }else if (player1.getPlayerChess().get(pieceName) instanceof King) {
                King k = (King) player1.getPlayerChess().get(pieceName);
                 return k.PosY();
            }
                }
            }else{
                return -30;
            }
            
        }else if(Black){
           if (player2.getPlayerChess().containsKey(pieceName)) {
                if (m == 1) {
                    if (player2.getPlayerChess().get(pieceName) instanceof Pawn) {
               Pawn p = (Pawn) player2.getPlayerChess().get(pieceName);
               return p.PosX();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Bishop) {
                Bishop b = (Bishop) player2.getPlayerChess().get(pieceName);
                 return b.PosX();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Horse) {
                Horse h = (Horse) player2.getPlayerChess().get(pieceName);
                 return h.PosX();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Tower) {
                Tower t = (Tower) player2.getPlayerChess().get(pieceName);
                 return t.PosX();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Queen) {
                Queen q = (Queen) player2.getPlayerChess().get(pieceName);
                 return q.PosX();
            }else if (player2.getPlayerChess().get(pieceName) instanceof King) {
                King k = (King) player2.getPlayerChess().get(pieceName);
                 return k.PosX();
            }
                }else{
                    if (player2.getPlayerChess().get(pieceName) instanceof Pawn) {
               Pawn p = (Pawn) player2.getPlayerChess().get(pieceName);
               return p.PosY();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Bishop) {
                Bishop b = (Bishop) player2.getPlayerChess().get(pieceName);
                 return b.PosY();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Horse) {
                Horse h = (Horse) player2.getPlayerChess().get(pieceName);
                 return h.PosY();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Tower) {
                Tower t = (Tower) player2.getPlayerChess().get(pieceName);
                 return t.PosY();
            }else if (player2.getPlayerChess().get(pieceName) instanceof Queen) {
                Queen q = (Queen) player2.getPlayerChess().get(pieceName);
                 return q.PosY();
            }else if (player2.getPlayerChess().get(pieceName) instanceof King) {
                King k = (King) player2.getPlayerChess().get(pieceName);
                 return k.PosY();
            }
                }
            }else{
                return -30;
            }
        }
      WriteFF();  
      return -30;
    }

    
    /**
     * Creates new form chessHex
     */
    private final int oneSideLength = 25;
    private final int sideTriangle = 12;
    private final int radius = 21;
    private final int border = 100;
    private final int height = 42;
    private boolean Save = true;
    private Player player1;
    private Player player2;
    
  public chessHex() {
        initComponents();
             this.setTitle("Final Project Chess");
        timer.scheduleAtFixedRate(GameTime,1500,1000);
        PlayerTimersxD();
        this.Record.setEnabled(false);
         try {
         callReaders();   
        } catch (IOException ex) {
          Logger.getLogger(chessHex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     void callReaders() throws IOException{
        Player1ScoreFile("Player1.txt");
        Player2ScoreFile("Player2.txt");
    }
     
        public static int getMovesCounter() {
        return MovesCounter;
    }

    public static void setMovesCounter(int MovesCounter) {
        chessHex.MovesCounter = MovesCounter;
    }

    public static JLabel getMLeft() {
        return MLeft;
    }

    public static void setMLeft(JLabel MLeft) {
        chessHex.MLeft = MLeft;
    }

    public static int getPlayerCounter() {
        return PlayerCounter;
    }

    public static void setPlayerCounter(int PlayerCounter) {
        chessHex.PlayerCounter = PlayerCounter;
    }

    public  boolean isEnded() {
        return Ended;
    }

    public void setEnded(boolean Ended) {
        this.Ended = Ended;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public static int getTotalCounter() {
        return totalCounter;
    }

    public static void setTotalCounter(int totalCounter) {
        chessHex.totalCounter = totalCounter;
    }


    
    
//----------------------timer and task's variables------------------------------    
    
    public void PlayerTimersxD(){
        timer.scheduleAtFixedRate(PlayerTime,1500,1000);  
    }
    
    Timer timer = new Timer();
   private Boolean White = true;
   private Boolean Black = false;
    Boolean DoNothing = true;
    
    public static int PlayerCounter = 00;
        
    int GameCounter = 00;
            
    int sec = 00;
    int mm = 00;
    int HH = 00;
    
    public static String rec = "";
       
    public static double p1Points=0;
    public static double p2Points=0;
    
    public static int MovesCounter = 3; 
    
    public boolean paused = false;
    
    String RecN = "";
    
    public boolean Ended = false;
    
    public boolean draw = false;
    
    public static int totalCounter = 0;

      TimerTask PlayerTime = new TimerTask(){
            public void run() {
             
             
             if(PlayerCounter>59){
                PlayerCounter=0;
                MovesCounter=3;
                MLeft.setText("Moves left: "+MovesCounter);
                if(White == true){
                   lbut.setText("Black's Turn");
                   White = false;
                   Black = true;
                    if(DoNothing==true){
                       String rec = "Player1: DoNothing() "+"\n";
                       RecN = RecN+rec;
                       Record.setText(RecN);
                       }
                }else if(Black){
                  lbut.setText("White's Turn");  
                  White = true;
                  Black = false;
                    if(DoNothing==true){
                        String rec = "Player2: DoNothing() "+"\n";
                        RecN = RecN+rec;
                        Record.setText(RecN);
                     }
               }
               DoNothing=true;
             }
             String par = "Player Time: 00:"+Integer.toString(PlayerCounter);
             clock.setText(par); 
             PlayerCounter++;

            }
        };
        TimerTask GameTime = new TimerTask(){
        
                public void run(){
                 
                if(sec==60){
                   sec=0;
                   mm++;
                }
                if(mm==60){
                   mm=0;
                   HH++;
                }
                
                LGameTime.setText("Game Time: "+HH+":"+mm+":"+sec);
                sec++;
                }    
        };    
//------------------------------------------------------------------------------
    public void CreatePlayers(){
        
        //player white
        player1 = new Player("white");
        Map<String,Object> pc1 = new HashMap<>();
        //Nine pawn
        Pawn p1 = new Pawn(1,16,"Pawn1","white",this.virtualChess,this);
        pc1.put("Pawn1", p1);
        Pawn p2 = new Pawn(2,15,"Pawn2","white",this.virtualChess,this);
        pc1.put("Pawn2", p2);
        Pawn p3 = new Pawn(3,14,"Pawn3","white",this.virtualChess,this);
        pc1.put("Pawn3", p3);
        Pawn p4 = new Pawn(4,13,"Pawn4","white",this.virtualChess,this);
        pc1.put("Pawn4", p4);
        Pawn p5 = new Pawn(5,12,"Pawn5","white",this.virtualChess,this);
        pc1.put("Pawn5", p5);
        Pawn p6 = new Pawn(6,13,"Pawn6","white",this.virtualChess,this);
        pc1.put("Pawn6", p6);
        Pawn p7 = new Pawn(7,14,"Pawn7","white",this.virtualChess,this);
        pc1.put("Pawn7", p7);
        Pawn p8 = new Pawn(8,15,"Pawn8","white",this.virtualChess,this);
        pc1.put("Pawn8", p8);
        Pawn p9 = new Pawn(9,16,"Pawn9","white",this.virtualChess,this);
        pc1.put("Pawn9", p9);
        
        //Two horse
        Horse h1 = new Horse(3,18,"Horse1","white",this.virtualChess,this);
        pc1.put("Horse1", h1);
        Horse h2 = new Horse(7,18,"Horse2","white",this.virtualChess,this);
        pc1.put("Horse2", h2);
        
        //Two tower
        Tower t1 = new Tower(2,17,"Tower1","white",this.virtualChess,this);
        pc1.put("Tower1", t1);
        Tower t2 = new Tower(8,17,"Tower2","white",this.virtualChess,this);
        pc1.put("Tower2", t2);
        
        //Three bishop
        Bishop b1 = new Bishop(5,20,"Bishop1","white",this.virtualChess,this);
        pc1.put("Bishop1", b1);
        Bishop b2 = new Bishop(5,18,"Bishop2","white",this.virtualChess,this);
        pc1.put("Bishop2", b2);
        Bishop b3 = new Bishop(5,16,"Bishop3","white",this.virtualChess,this);
        pc1.put("Bishop3", b3);
        
        //One king
        King k1 = new King(4,19,"King1","white",this.virtualChess,this);
        pc1.put("King1", k1);
        
        //One queen
        Queen q1 = new Queen(6,19,"Queen1","white",this.virtualChess,this);
        pc1.put("Queen1", q1);
        
        //Save hash map
        player1.setPlayerChess(pc1);
        
        //player black
        player2 = new Player("black");
        Map<String,Object> pc2 = new HashMap<>();
        //Nine pawn
        Pawn p01 = new Pawn(1,4,"Pawn1","black",this.virtualChess,this);
        pc2.put("Pawn1", p01);
        Pawn p02 = new Pawn(2,5,"Pawn2","black",this.virtualChess,this);
        pc2.put("Pawn2", p02);
        Pawn p03 = new Pawn(3,6,"Pawn3","black",this.virtualChess,this);
        pc2.put("Pawn3", p03);
        Pawn p04 = new Pawn(4,7,"Pawn4","black",this.virtualChess,this);
        pc2.put("Pawn4", p04);
        Pawn p05 = new Pawn(5,8,"Pawn5","black",this.virtualChess,this);
        pc2.put("Pawn5", p05);
        Pawn p06 = new Pawn(6,7,"Pawn6","black",this.virtualChess,this);
        pc2.put("Pawn6", p06);
        Pawn p07 = new Pawn(7,6,"Pawn7","black",this.virtualChess,this);
        pc2.put("Pawn7", p07);
        Pawn p08 = new Pawn(8,5,"Pawn8","black",this.virtualChess,this);
        pc2.put("Pawn8", p08);
        Pawn p09 = new Pawn(9,4,"Pawn9","black",this.virtualChess,this);
        pc2.put("Pawn9", p09);
        
        //Two horse
        Horse h01 = new Horse(3,2,"Horse1","black",this.virtualChess,this);
        pc2.put("Horse1", h01);
        Horse h02 = new Horse(7,2,"Horse2","black",this.virtualChess,this);
        pc2.put("Horse2", h02);
        
        //Two tower
        Tower t01 = new Tower(2,3,"Tower1","black",this.virtualChess,this);
        pc2.put("Tower1", t01);
        Tower t02 = new Tower(8,3,"Tower2","black",this.virtualChess,this);
        pc2.put("Tower2", t02);
        
        //Three bishop
        Bishop b01 = new Bishop(5,0,"Bishop1","black",this.virtualChess,this);
        pc2.put("Bishop1", b01);
        Bishop b02 = new Bishop(5,2,"Bishop2","black",this.virtualChess,this);
        pc2.put("Bishop2", b02);
        Bishop b03 = new Bishop(5,4,"Bishop3","black",this.virtualChess,this);
        pc2.put("Bishop3", b03);
        
        //One king
        King k01 = new King(4,1,"King1","black",this.virtualChess,this);
        pc2.put("King1", k01);
        
        //One queen
        Queen q01 = new Queen(6,1,"Queen1","black",this.virtualChess,this);
        pc2.put("Queen1", q01);
        
        //Save hash map
        player2.setPlayerChess(pc2);
        
    }
    /*public void CreatePieces(){
       pa = new Pawn(5, 0,"pawn1","white",this.virtualChess,this);
    }*/
    
    
     public void saveHexMap(int axisX,int axisY, Hexagono h){
         if (Save) {
             if (chess.containsKey(axisX)) {
             chess.get(axisX).put(axisY, h);
         }else{
             HashMap<Integer,Hexagono> hex = new HashMap<>();
             hex.put(axisY, h);
             chess.put(axisX, hex);
         }
         } 
     }
    @Override
    public void paint(Graphics g){
        int row = 0;
        Graphics2D g2 = (Graphics2D)g;
        
        super.paint(g2);
        
        drawHex(1,5,0,g2);
        Hexagono h = new Hexagono(5,0,g2);
        saveHexMap(row,5,h);
        //Triangulo
        for (int i = 3; i < 8; i++) {
            if (i%2 == 0) {
                drawHex(2,i,1,g2);
                Hexagono h1 = new Hexagono(i,1,g2);
                saveHexMap(row-1,i,h1);
            }else{
                row =2;
                drawHex(3,i,1,g2);
                Hexagono h2 = new Hexagono(i,1,g2);
                saveHexMap(row,i,h2);
            }
        }
        for (int i = 1; i < 10; i++) {
            if (i%2 == 0) {
                 Hexagono h1 = new Hexagono(i,2,g2);
                saveHexMap(row-1,i,h1);
                drawHex(1,i,2,g2);
            }else{
                row =4;
                 Hexagono h2 = new Hexagono(i,2,g2);
                saveHexMap(row,i,h2);
                drawHex(2,i,2,g2);
            }
        }
       //Bloque 
       int typeColor= 3;
        for (int i = 3; i < 9; i++) {
            for (int j = 0; j < 11; j++) {
                switch (typeColor) {
                    case 3:
                        if (j%2 == 0) {
                            drawHex(3,j,i,g2);
                            if (i == 3) {
                                row = 5;
                                Hexagono h1 = new Hexagono(j,i,g2);
                                saveHexMap(row,j,h1); 
                            }else{
                                row = 11;
                                Hexagono h1 = new Hexagono(j,i,g2);
                                saveHexMap(row,j,h1); 
                            }
                            //System.out.println("a "+i);
                        }else{
                            drawHex(1,j,i,g2);
                             //System.out.println("b "+i);
                            Hexagono h2 = new Hexagono(j,i,g2);
                             saveHexMap(row+1,j,h2);
                        }   break;
                        
                    case 2:
                        if (j%2 == 0) {
                            drawHex(2,j,i,g2);
                            if (i == 4) {
                                row = 7;
                                Hexagono h1 = new Hexagono(j,i,g2);
                                saveHexMap(row,j,h1); 
                            }else{
                                row = 13;
                                Hexagono h1 = new Hexagono(j,i,g2);
                                saveHexMap(row,j,h1); 
                            }
                            }else{
                            drawHex(3,j,i,g2);
                            Hexagono h2 = new Hexagono(j,i,g2);
                             saveHexMap(row+1,j,h2);
                        }   break;
                    case 1:
                        if (j%2 == 0) {
                            drawHex(1,j,i,g2);
                            if (i == 5) {
                                row = 9;
                                Hexagono h1 = new Hexagono(j,i,g2);
                                saveHexMap(row,j,h1); 
                            }else{
                                row = 15;
                                Hexagono h1 = new Hexagono(j,i,g2);
                                saveHexMap(row,j,h1); 
                            }
                        }else{
                            drawHex(2,j,i,g2);
                            Hexagono h2 = new Hexagono(j,i,g2);
                             saveHexMap(row+1,j,h2);
                        }   break;
                    default:
                        break;
                }
            } switch (typeColor) {
                case 3:
                    typeColor = 2;
                    break;
                case 2:
                    typeColor = 1;
                    break;
                case 1:
                    typeColor = 3;
                    break;
                default:
                    break;
            }
        }
        
        for (int i = 2; i < 9; i++) {
           if (i%2 == 0) {
               //System.out.println("a "+i);
               row = 17;
                drawHex(3,i,9,g2);
                Hexagono h1 = new Hexagono(i,9,g2);
                saveHexMap(row,i,h1);
            }else{
               //System.out.println("b "+i);
                 drawHex(1,i,9,g2);
                 Hexagono h1 = new Hexagono(i,9,g2);
                saveHexMap(row+1,i,h1);
            } 
        }
       for (int i = 4; i < 7; i++) {
               if (i%2 == 0) {
                   row = 19;
                drawHex(2,i,10,g2);
                Hexagono h1 = new Hexagono(i,10,g2);
                saveHexMap(row,i,h1);
            }else{
                 drawHex(3,i,10,g2);
                 Hexagono h1 = new Hexagono(i,10,g2);
                saveHexMap(row+1,i,h1);
                 }      
        }
       
        /*for (int c: chess.keySet() ) {
            for (int ch: chess.get(c).keySet()) {
                System.out.println("Key1: "+c+" Key2: "+ch+" X: "+chess.get(c).get(ch).getPosX()+" Y: "+chess.get(c).get(ch).getPosY());
            }
        }*/
        //System.out.println("hash map "+chess);
        if (Save) {
            //this.CreatePieces();
            this.CreatePlayers();
        }
        //p.paint(g);
        DrawPieces(g);
        Save = false;
    }

    public void DrawPieces(Graphics g){
        //Pieces Whites
        for (String n: player1.getPlayerChess().keySet()) {
            if (player1.getPlayerChess().get(n) instanceof Pawn) {
               Pawn p = (Pawn) player1.getPlayerChess().get(n);
                p.paint(g);
            }else if (player1.getPlayerChess().get(n) instanceof Bishop) {
                Bishop b = (Bishop) player1.getPlayerChess().get(n);
                b.paint(g);
            }else if (player1.getPlayerChess().get(n) instanceof Horse) {
                Horse h = (Horse) player1.getPlayerChess().get(n);
                h.paint(g);
            }else if (player1.getPlayerChess().get(n) instanceof Tower) {
                Tower t = (Tower) player1.getPlayerChess().get(n);
                t.paint(g);
            }else if (player1.getPlayerChess().get(n) instanceof Queen) {
                Queen q = (Queen) player1.getPlayerChess().get(n);
                q.paint(g);
            }else if (player1.getPlayerChess().get(n) instanceof King) {
                King k = (King) player1.getPlayerChess().get(n);
                k.paint(g);
            }

        }
        
        //Pieces Blacks
        for (String n: player2.getPlayerChess().keySet()) {
            if (player2.getPlayerChess().get(n) instanceof Pawn) {
               Pawn p = (Pawn) player2.getPlayerChess().get(n);
                p.paint(g);
            }else if (player2.getPlayerChess().get(n) instanceof Bishop) {
                Bishop b = (Bishop) player2.getPlayerChess().get(n);
                b.paint(g);
            }else if (player2.getPlayerChess().get(n) instanceof Horse) {
                Horse h = (Horse) player2.getPlayerChess().get(n);
                h.paint(g);
            }else if (player2.getPlayerChess().get(n) instanceof Tower) {
                Tower t = (Tower) player2.getPlayerChess().get(n);
                t.paint(g);
            }else if (player2.getPlayerChess().get(n) instanceof Queen) {
                Queen q = (Queen) player2.getPlayerChess().get(n);
                q.paint(g);
            }else if (player2.getPlayerChess().get(n) instanceof King) {
                King k = (King) player2.getPlayerChess().get(n);
                k.paint(g);
            }
        } 
       /* for (int c: chess.keySet() ) {
            for (int ch: chess.get(c).keySet()) {
                
                if (chess.get(c).get(ch).getPiece() != null) {
                    System.out.println("Key1: "+c+" Key2: "+ch+" X: "+chess.get(c).get(ch).getPiece().toString());
                }else{
                System.out.println("Key1: "+c+" Key2: "+ch+" X: ");
            }
            }}*/
    }
    /**
     *
     * @param g
     */
    public  void drawHex(int color, int posX, int posY, Graphics2D gra2) {
		int alterX = posX * (oneSideLength+sideTriangle);
		int alterY = posY * height + (posX%2) * height/2;
		Polygon createPolygon = produceHex(alterX,alterY);
                switch(color){
                    case 1:
                        //gra2.setColor(new Color(198,137,16));
                        gra2.setColor(new Color(131,119,119));
                        gra2.fillPolygon(createPolygon);
                        gra2.setColor(Color.BLACK);
                        gra2.drawPolygon(createPolygon);
                        break;
                    case 2:
                        //gra2.setColor(new Color(236,168,32));
                        gra2.setColor(new Color(170,160,160));
                        gra2.fillPolygon(createPolygon);
                        gra2.setColor(Color.BLACK);
                        gra2.drawPolygon(createPolygon);
                        break;
                    case 3:
                        //gra2.setColor(new Color(245,207,131));
                        gra2.setColor(new Color(211,207,207));
                        gra2.fillPolygon(createPolygon);
                        gra2.setColor(Color.BLACK);
                        gra2.drawPolygon(createPolygon);
                        break;
                }	
                //Posit(posX,posY,alterX,alterY); 
	}
    
     public Polygon produceHex(int posX, int posY){
        int axisX = posX + border;
        int axisY = posY + border;
        int[] arrayX, arrayY;
       //System.out.println("x: "+axisX+" y: "+axisY);
        arrayX = new int[] {axisX,axisX+oneSideLength,axisX+oneSideLength+sideTriangle,axisX+oneSideLength,axisX,axisX-sideTriangle};
        arrayY = new int[] {axisY,axisY,axisY+radius,axisY+(radius*2),axisY+(radius*2),axisY+radius};
        return new Polygon(arrayX,arrayY,6);  
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        virtualChess = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Do = new javax.swing.JButton();
        MLeft = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        TxtField = new java.awt.TextField();
        LGameTime = new javax.swing.JLabel();
        lbut = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        LplayerTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Record = new javax.swing.JTextPane();
        LRec = new javax.swing.JLabel();
        Drawbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        virtualChess.setBackground(new java.awt.Color(153, 153, 153));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Do.setBackground(new java.awt.Color(102, 102, 102));
        Do.setForeground(new java.awt.Color(255, 255, 255));
        Do.setText("Go");
        Do.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoActionPerformed(evt);
            }
        });

        MLeft.setText("Moves Left: 3");

        Back.setBackground(new java.awt.Color(102, 102, 102));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        TxtField.setBackground(new java.awt.Color(102, 102, 102));
        TxtField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtField.setForeground(new java.awt.Color(255, 255, 255));
        TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldActionPerformed(evt);
            }
        });

        LGameTime.setText("Game Time : ");

        lbut.setBackground(new java.awt.Color(51, 255, 51));
        lbut.setText("White's Turn");

        clock.setText("Time:");

        LplayerTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LplayerTime.setText("Player Time");

        Record.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(Record);

        LRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LRec.setText("Actions Record ");

        Drawbutt.setBackground(new java.awt.Color(102, 102, 102));
        Drawbutt.setForeground(new java.awt.Color(255, 255, 255));
        Drawbutt.setText("Draw");
        Drawbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawbuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout virtualChessLayout = new javax.swing.GroupLayout(virtualChess);
        virtualChess.setLayout(virtualChessLayout);
        virtualChessLayout.setHorizontalGroup(
            virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(virtualChessLayout.createSequentialGroup()
                .addGroup(virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, virtualChessLayout.createSequentialGroup()
                        .addGap(0, 588, Short.MAX_VALUE)
                        .addGroup(virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Do, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(virtualChessLayout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Drawbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(virtualChessLayout.createSequentialGroup()
                        .addGap(576, 576, 576)
                        .addGroup(virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(virtualChessLayout.createSequentialGroup()
                                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(lbut))
                            .addGroup(virtualChessLayout.createSequentialGroup()
                                .addComponent(LGameTime, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LplayerTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, virtualChessLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LRec, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        virtualChessLayout.setVerticalGroup(
            virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(virtualChessLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MLeft)
                    .addComponent(LplayerTime)
                    .addComponent(LGameTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clock)
                    .addComponent(lbut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Do)
                .addGap(40, 40, 40)
                .addGroup(virtualChessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(jButton2)
                    .addComponent(Drawbutt))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(virtualChess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(virtualChess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
          String rec = Record.getText();
      try {
          PrintWriter Record = new PrintWriter("GameRecord.txt");
          Record.println(rec);
          Record.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(chessHex.class.getName()).log(Level.SEVERE, null, ex);
      }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoActionPerformed
            
          setPaused(false);
        
          String text = this.TxtField.getText().toString();     
          this.TxtField.setText("");
          
          CheckEnded();
          
          if(!isEnded()){
              
          if( text.equals("")){
           JOptionPane.showMessageDialog(null, " Enter a String ", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
         
            if(text.equals("")){}else{
             
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("fichero.txt");
            pw = new PrintWriter(fichero);

            pw.println(text.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }  
            ReadParserFile("fichero.txt");
         } 
       }
    }
  
          
    }                 
        public void ReadParserFile(String txt){
        
        try {
            this.pars= new  Parser(this,new Scanner(new FileInputStream(txt)));
            this.pars.parse() ;  
        
        } catch (Exception ex) {
           // System.out.println("Error fatal en compilación de entrada.");
            //System.out.println("Causa: "+ex.getCause());
        } 
    }//GEN-LAST:event_DoActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        GameTime.cancel();
        PlayerTime.cancel();
        setTotalCounter(0);
        setPlayerCounter(0);
        home h = new home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void DrawbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawbuttActionPerformed
        
                    
                GameTime.cancel();
                PlayerTime.cancel();
                 
                White=false;
                Black=false;
                 
                rec= "It's a Draw"+"\n";
                RecN = RecN+rec;
                Record.setText(RecN);
                        
                
                double alter1 = p1Points + 0.5;
                double alter2 = p2Points + 0.5;
                Player1Score(alter1);
                Player2Score(alter2);
                WriteFF();
                
                setEnded(true);
             
    }//GEN-LAST:event_DrawbuttActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Do;
    private javax.swing.JButton Drawbutt;
    private javax.swing.JLabel LGameTime;
    private javax.swing.JLabel LRec;
    private javax.swing.JLabel LplayerTime;
    private static javax.swing.JLabel MLeft;
    private javax.swing.JTextPane Record;
    private java.awt.TextField TxtField;
    private javax.swing.JLabel clock;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbut;
    private javax.swing.JPanel virtualChess;
    // End of variables declaration//GEN-END:variables



//----------------------- get methods and set Points ---------------------------
    public static void Player1Score(double points){
          
        try {
          PrintWriter Record = new PrintWriter("Player1.txt");
          Record.println(points);
          Record.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(chessHex.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
    public static void Player2Score(double points){
        
        try {
          PrintWriter Record = new PrintWriter("Player2.txt");
          Record.println(points);
          Record.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(chessHex.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
    //-----------------------------------------------------------------------//
    String strP1;
    public void Player1ScoreFile(String File)throws FileNotFoundException, IOException{
      
        String cadena;
        FileReader f = new FileReader(File);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
              this.strP1=cadena;
        }
        b.close();        
        p1Points = Double.parseDouble(this.strP1);
        //System.out.println(p1Points);
    }
    String strP2;
    public void Player2ScoreFile(String File)throws FileNotFoundException, IOException{
      
        
        String cadena;
        FileReader f = new FileReader(File);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
               this.strP2 = cadena;
        }
        b.close();
        p2Points = Double.parseDouble(this.strP2);
       // System.out.println(p2Points);
    }
//------------------------------------------------------------------------------ 
  public  void WriteFF(){
     String rec = Record.getText();
      try {
          PrintWriter Record = new PrintWriter("GameRecord.txt");
          Record.println(rec);
          Record.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(chessHex.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
  
//------------------------------------------------------------------------------
  
  public Boolean CheckEnded(){
      
      
     if(!isEnded()){
          if(player1.getPlayerChess().isEmpty()){
          
          
                        GameTime.cancel();
                        PlayerTime.cancel();
                 
                        White=false;
                        Black=false;
                 
                        rec= "Player1 lose Player2 is the winner"+"\n";
                        RecN = RecN+rec;
                        Record.setText(RecN);
                        
                        p2Points++;
                        double alter = p2Points;
                        Player2Score(alter);
                        WriteFF();
                        
                        setEnded(true);
                        
                        return true;

      }else if(player2.getPlayerChess().isEmpty()){
          
          
           
                        GameTime.cancel();
                        PlayerTime.cancel();
                 
                        White=false;
                        Black=false;
                 
                        rec= "Player2 lose Player1 is the winner"+"\n";
                        RecN = RecN+rec;
                        Record.setText(RecN);
                        
                        p1Points++;
                        double alter = p1Points;
                        Player1Score(alter);
                        WriteFF();
                        
                        setEnded(true);
             
                        return true;
          
      }  
          return false;
     }  
     
      
     
      return false;
      
      
      
  }

}


