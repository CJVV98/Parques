/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import parques.Parques1;

/**
 *
 * @author STEVEN
 */
public class Contador2 extends Thread {
   Parques1 parques=new Parques1();

  int []auxiliar2={240,260,260,240,210,190,150,120,90,60,30,10,10,10,30,60,90,120,150,180,220,240,260,270,260,260,260,260,260,340,410,410,410,410,410,410,420,440,460,490,530,560,590,620,650,680,680,680,650,620,590,560,530,500,460,440,420,400,420,410,410,410,400,370,260,250,250,250};
 int []auxiliar1={110,140,180,210,230,250,260,270,280,280,270,270,330,440,440,440,440,440,420,420,430,460,490,530,560,590,610,640,670,670,670,640,610,580,550,520,490,460,430,410,400,400,400,400,400,400,330,250,230,230,230,260,260,260,240,210,180,150,120,90,60,30,0,0,0,30,60,90};
 int [] posicionSX={0,250,540,440,260};
 int [] posicionSY={0,120,240,560,560};
 JButton ficha1,ficha2,ficha3,ficha4;
 int mover;
 int j=0,auxiliar=11;
 int i=0;
 int x,y,jugador;
 int s=20;

    
    Contador2(JButton _label, int _mover, int x1,int y1,JButton _label2, int jugador1,JButton _label3,JButton _label4){
        this.ficha1=_label;
        this.ficha2=_label2;
        this.ficha3=_label3;
        this.ficha4=_label4;
        this.jugador=jugador1;
        this.mover=_mover;
        this.x=x1;
        this.y=y1;
 
                
    }
    
    public void run(){
        int vo=0;
 int []posicionesX={240,260,260,240,210,190,150,120,90,60,30,10,10,10,30,60,90,120,150,180,220,240,260,270,260,260,260,260,260,340,410,410,410,410,410,410,420,440,460,490,530,560,590,620,650,680,680,680,650,620,590,560,530,500,460,440,420,400,420,410,410,410,400,370,260,250,250,250};
 int []posicionesY={110,140,180,210,230,250,260,270,280,280,270,270,330,440,440,440,440,440,420,420,430,460,490,530,560,590,610,640,670,670,670,640,610,580,550,520,490,460,430,410,400,400,400,400,400,400,330,250,230,230,230,260,260,260,240,210,180,150,120,90,60,30,0,0,0,30,60,90};
     if(jugador==2){
         
          for(int x=0;x<=67;x++){
              
             if(s==68){
                 s=0;
             } 
             posicionesX[x]=auxiliar2[s];
             posicionesY[x]=auxiliar1[s];
             System.out.println("POSICIONES"+posicionesY[x]+"sssd"+s);
             s++;
         }
        
     }
      System.out.println(posicionesX[0]);
        switch(mover){
            
             case 1:{
                 System.out.println("SALIR DE BLOQUEO");
                  int bandera=0,posicion=0;
                    try{
                      if((ficha1.getX()>5&&ficha1.getX()<205)&&(ficha1.getY()>5&&ficha1.getY()<205) ){
                          System.out.println("aqui esta 1");
                          posicion=1;
                      }else{
                          if((ficha1.getX()>430 &&ficha1.getX()<660)&&(ficha1.getY()>5&&ficha1.getY()<205) ){
                              System.out.println("aqui esta 2");
                              posicion=2;
                      }
                      }
                      
                       while(x<=posicionSX[posicion] || y<=posicionSY[posicion]){
                           System.out.println("-----primera vex  X"+x+"xsd"+posicionSX[posicion]);
                           if(x<=posicionSX[posicion]){
                                System.out.println("-----primera vex  X"+x+"xsd"+posicionSX[posicion]);
                                    Thread.sleep(90);
                                    x+=10;
                                    ficha1.setLocation(x, y);

                           }
                           if(y<=posicionSY[posicion]){
                                System.out.println("++++++primera vexyy  Y"+y+"xsd"+posicionSY[posicion]);
                                Thread.sleep(90);
                                y+=10;
                                ficha1.setLocation(x, y);

                           }
                       }


                    } catch (InterruptedException ex) {
                     Logger.getLogger(Parques1.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    validarPosiciones();
                 break;
             }
           case  7:
           case  8:
           case  9:
           case  10:
           case  11:
           case  12:{ 
               vo=0;
                System.out.println("PRIMER CASO");
               System.out.println("CORRER 12 AQUI ESTA LRETYHJYGRFERA FICHA"+ficha1.getX());
               System.out.println("CORRER 7");
               try{
                 for( j=0;j<posicionesX.length;j++){
                     if((ficha1.getX()<=(posicionesX[j]+20) && ficha1.getX()>=(posicionesX[j]-20)) && (ficha1.getY()<=(posicionesY[j]+20) && ficha1.getY()>=(posicionesY[j]-20))  ){ 
                                    do{                                       
                                   Thread.sleep(90);                 
                                    System.out.println("CORRERewrgthyui 12"+posicionesX[j+1]+vo+"mover"+mover);
                                    x=posicionesX[j+vo];
                                    y=(posicionesY[j+vo]);
                                    ficha1.setLocation(x, y); 
                                    vo++;
                                    }while(vo<=mover);
                                  
                                    break;
                 }
              
          }
                } catch (InterruptedException ex) {
                     Logger.getLogger(Parques1.class.getName()).log(Level.SEVERE, null, ex);

                    }
                validarPosiciones();
                   break;  
           }
          
           case 5:
           case 2:
           case 3:
           case 4:
           case 6:{
               vo=0;
                 System.out.println("PRIMER CASO");
                 System.out.println("CORRER 5"); 
                 System.out.println("CORRER 12 AQUI ESTA LA FICHA"+ficha1.getX());
                 try{
                 for(j=0;j<posicionesX.length;j++){
                       if((ficha1.getX()<=(posicionesX[j]+20) && ficha1.getX()>=(posicionesX[j]-20)) && (ficha1.getY()<=(posicionesY[j]+20) && ficha1.getY()>=(posicionesY[j]-20))  ){ 
                                    do{
                                    Thread.sleep(90);                                                         
                                    System.out.println("COewrgthyhuRRsdER 12"+posicionesX[j+1]);
                                    x=posicionesX[j+vo];
                                    y=(posicionesY[j+vo]);
                                    ficha1.setLocation(x, y); 
                                    vo++;
                                    }while(vo<=mover);
                                    break;
                 }
                 }
          
                    } catch (InterruptedException ex) {
                     Logger.getLogger(Parques1.class.getName()).log(Level.SEVERE, null, ex);

                    }
                   break;  
           
           }
          
        }
         
        }
        

    
    public void reset(){
        this.mover=0;
        this.j=0;
       
    }
     private void validarPosiciones() {
        if((ficha1.getX()==ficha2.getX()) && (ficha1.getY()==ficha2.getY()) ){
            if((ficha1.getY()>=0 && ficha1.getY()<=210) || (ficha1.getY()>=470)){
                ficha1.setLocation((ficha1.getX()+15), ficha1.getY());
            }else{
                ficha1.setLocation((ficha1.getX()), ficha1.getY()+15);
            }
        }
    
        if(((ficha1.getX()<=(ficha3.getX()+20)) && (ficha1.getX()>=(ficha3.getX()+20))) && ((ficha1.getY()<=(ficha3.getY()+20)) || (ficha1.getY()>=(ficha3.getY()+20))) ){
           if(jugador==2){
               ficha3.setLocation(110, 90);
               parques.bandera3=0;
               parques.bandera4=0;
           }else{
               ficha3.setLocation(560, 80);
               parques.bandera=0;
               parques.bandera2=0;
               
           }
        }
        if(((ficha1.getX()<=(ficha4.getX()+20)) && (ficha1.getX()>=(ficha4.getX()+20))) && ((ficha1.getY()<=(ficha4.getY()+20)) || (ficha1.getX()>=(ficha4.getY()+20))) ){
           if(jugador==2){
               ficha4.setLocation(110, 60);
               parques.bandera3=0;
               parques.bandera4=0;
           }else{
              ficha4.setLocation(560, 120);
              parques.bandera=0;
              parques.bandera2=0;
           }
        }
    }
}
