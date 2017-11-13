/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos301;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author STEVEN
 */
public class Contador extends Thread {
    
    JLabel label;
    int velocidad;
    int i=0;

    
    Contador(JLabel _label, int _velocidad ){
        this.label=_label;
        this.velocidad=_velocidad;
 
    }
    
    public void run(){
    
        
        while(i<=300){
            try {
                label.setLocation(i, 20);
                Thread.sleep(velocidad);
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public void reset(){
        this.i=0;
    }
}
