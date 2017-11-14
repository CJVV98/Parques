/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos301;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import parques.Parques1;

/**
 *
 * @author STEVEN
 */
public class Contador extends Thread {
 int [] posX7={250,120,430,560};
 int [] posY7={130,440,560,250};
 int [] posX5={120,10,270,330,560,670,430,350};
 int [] posY5={260,350,560,670,440,340,130,18};
 int []posicionesX={270,120,10,120,260,340,430,560,670,560,420,340};
 int []posicionesY={130,260,350,440,560,670,560,420,340,250,130,18};
 int [] posicionSX={0,250,560,440,260};
 int [] posicionSY={0,130,230,560,560};
 JLabel ficha1,ficha2;
 int mover;
 int ficha,j=0;
 int i=0;
 int x,y;

    
    Contador(JLabel _label, int _velocidad, int _ficha, int _mover, int x1,int y1){
        this.ficha1=_label;
        this.ficha=_ficha;
        this.mover=_mover;
        this.x=x1;
        this.y=y1;
 
                
    }
    
    public void run(){
        switch(mover){
             case 1:{
                  int bandera=0,posicion=0;
        try{
          if((ficha1.getX()>5&&ficha1.getX()<205)&&(ficha1.getY()>5&&ficha1.getY()<205) ){
              posicion=1;
          }else{
              if((ficha2.getX()>430 &&ficha2.getX()<660)&&(ficha2.getY()>5&&ficha2.getY()<205) ){
                posicion=2;
          }
          }
           while(x<=posicionSX[posicion] || y<=posicionSY[posicion]){
               if(x<=posicionSX[posicion]){
               Thread.sleep(90);
               x+=10;
             
               }
               if(y<=posicionSY[posicion]){
                    Thread.sleep(90);
                    y+=10;
                    
               }
           }
          
        
        } catch (InterruptedException ex) {
         Logger.getLogger(Parques1.class.getName()).log(Level.SEVERE, null, ex);
        
        }
                 break;
             }
           case 7:{ 
                 for( j=0;j<posicionesX.length;j++){
                    if((ficha1.getX()<=(posicionesX[j]+20) && ficha1.getX()>=(posicionesX[j]-20)) && (ficha1.getY()<=(posicionesY[j]+20) && ficha1.getY()>=(posicionesY[j]-20))  ){  
                  for(int i=0;i<posX7.length;i++){
                  //  System.out.println(ficha2.getX()+"--"+posicionesX[i]+"---"+posicionesY[i]+"--"+ficha2.getY());
                   if((ficha1.getX()<=(posX7[i]+20) && ficha1.getX()>=(posX7[i]-20)) && (ficha1.getY()<=(posY7[i]+20) && ficha1.getY()>=(posY7[i]-20))  ){
                       System.out.println("AQUI ESTOY 12");
                       if(i==0||i==2){
                           System.out.println("AQUI ESTOY 13");
                        if(ficha2.getY()<=(posicionesY[j+1]+20) && ficha2.getY()>=(posicionesY[j+1]-20)){
                            System.out.println("AQUI ESTOY 14");
                            x=posicionesX[j+1];
                            y=(posicionesY[j+1]+15);
                            ficha1.setLocation(x, y);
                             System.out.println(ficha1.getX()+"--"+ficha1.getY());
                            j++;
                            break;
                        }else{
                            System.out.println("AQUI ESTOY 15");
                            x=posicionesX[j+1];
                            y=(posicionesY[j+1]);
                            ficha1.setLocation(x, y);
                             System.out.println(ficha1.getX()+"--"+ficha1.getY());
                            j++;
                              break;
                     }
                    }
                     else{
                           if(ficha2.getX()<=(posicionesX[j+1]+20) && ficha2.getX()>=(posicionesX[j+1]-20)){
                            System.out.println("AQUI ESTOY 16");
                            x=(posicionesX[j+1]+15);
                            y=posicionesY[j+1];
                            ficha1.setLocation(x, y);
                             System.out.println(ficha1.getX()+"--"+ficha1.getY());
                            j++;
                            break;
                        }else{
                            System.out.println("AQUI ESTOY 17");
                            x=posicionesX[j+1];
                            y=(posicionesY[j+1]);
                            ficha1.setLocation(x, y);
                             System.out.println(ficha1.getX()+"--"+ficha1.getY());
                            j++;
                            break;
                            
                     }
                     }
                  }
                }
                }
              }
                break;  
          }
          
          
           case 5:{
               System.out.println("ENTRE A FICHA 5-----------------");
             switch(ficha){
               case 1:{
                 for(j=0;j<posicionesX.length;j++){
                        if((ficha1.getX()<=(posicionesX[j]+20) && ficha1.getX()>=(posicionesX[j]-20)) && (ficha1.getY()<=(posicionesY[j]+20) && ficha1.getY()>=(posicionesY[j]-20))  ){  
                          for(int i=0;i<posX5.length;i++){
                          
                           if((ficha1.getX()<=(posX5[i]+20) && ficha1.getX()>=(posX5[i]-20)) && (ficha1.getY()<=(posY5[i]+20) && ficha1.getY()>=(posY5[i]-20))  ){
                               System.out.println("AQUI ESTOY 121");
                               if(i==0||i==1 || i==4 || i==5){
                                   System.out.println("AQUI ESTOY 131");
                                if(ficha2.getY()<=(posicionesY[j+1]+20) && ficha2.getY()>=(posicionesY[j+1]-20)){
                                    System.out.println("AQUI ESTOY 141");
                                    x=posicionesX[j+1];
                                    y=(posicionesY[j+1]+15);
                                    ficha1.setLocation(x, y);
                                    j++;
                                    System.out.println(ficha1.getX()+"--"+ficha1.getY());
                                    break;
                                }else{
                                    System.out.println("AQUI ESTOY 151");
                                    x=posicionesX[j+1];
                                    y=(posicionesY[j+1]);
                                    ficha1.setLocation(x, y);
                                     j++;
                                     System.out.println(ficha1.getX()+"--"+ficha1.getY());
                                      break;
                             }
                            }
                             else{
                                   if(ficha2.getX()<=(posicionesX[j+1]+20) && ficha2.getX()>=(posicionesX[j+1]-20)){
                                    System.out.println("AQUI ESTOY 161");
                                    x=(posicionesX[j+1]+15);
                                    y=posicionesY[j+1];
                                    ficha1.setLocation(x, y);
                                     j++;
                                     System.out.println(ficha1.getX()+"--"+ficha1.getY());
                                    break;
                                }else{
                                    System.out.println("AQUI ESTOY 171");
                                    x=posicionesX[j+1];
                                    y=(posicionesY[j+1]);
                                    ficha1.setLocation(x, y);
                                     j++;
                                     System.out.println(ficha1.getX()+"--"+ficha1.getY());
                                    break;

                             }
                             }
                          }
                        }
                        }}
                        break;  
                    }
           }
             
           }
    }
     
        
        
    }
    
    public void reset(){
        this.mover=0;
        this.ficha=0;
    }
}
