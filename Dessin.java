/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teest;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author acces_libre
 */
public class Dessin extends JPanel{
    
    private ArrayList<Integer> listX = new ArrayList<Integer>();
    private ArrayList<Integer> listY = new ArrayList<Integer>();
        
    public void azer(){
    
        System.out.println("azerty");
    }
    public Dessin(){
        
        System.out.println("1111123456");
       this.addMouseListener(new MouseAdapter(){
       
           public void mousePressed(MouseEvent e){
           
               listX.add(e.getX());
               listY.add(e.getY());
               System.out.println("123456");
           }
       });
        repaint();
    }

    
    public void paintComponent(Graphics g){
    
        g.fillOval(10, 50, 55, 123);
    }
    
    
}
