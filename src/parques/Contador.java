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
public class Contador extends Thread {
   Parques1 parques=new Parques1();


  int []auxiliar2={250,120,10,120,250,330,440,560,680,560,430,340};
 int []auxiliar1={110,240,350,430,550,670,560,440,330,260,110,0};//Y
 int [] posicionSX={0,250,550,410,120};
 int [] posicionSY={0,110,250,550,440};
 JButton ficha1,ficha2,ficha3,ficha4;
 int mover;
 int j=0,auxiliar=11;
 int i=0;
 int x,y,jugador;
 int s=9;

    
    Contador(JButton _label, int _mover, int x1,int y1,JButton _label2, int jugador1,JButton ficha3,JButton ficha4){
        this.ficha1=_label;
        this.ficha2=_label2;
        this.ficha3=ficha3;
        this.ficha4=ficha4;
        this.jugador=jugador1;
        this.mover=_mover;
        this.x=x1;
        this.y=y1;
 
                
    }
    
    public void run(){
 int []posicionesX={250,120,10,120,250,330,440,560,680,560,430,340};
 int []posicionesY={110,240,350,430,550,670,560,420,330,250,110,0};
     if(jugador==2){
           
          for(int x=0;x<=11;x++){
              
             if(s==12){
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
                       validarPosiciones();
                       
                    } catch (InterruptedException ex) {
                     Logger.getLogger(Parques1.class.getName()).log(Level.SEVERE, null, ex);

                    }
                 break;
             }
           case 7:{ 
               System.out.println("CORRER 12 AQUI ESTA LRETYHJYGRFERA FICHA"+ficha1.getX());
               System.out.println("CORRER 7");
               
                 for( j=0;j<posicionesX.length;j++){
                     if((ficha1.getX()<=(posicionesX[j]+30) && ficha1.getX()>=(posicionesX[j]-30)) && (ficha1.getY()<=(posicionesY[j]+30) && ficha1.getY()>=(posicionesY[j]-30))  ){ 
                                    System.out.println("CORRER 12"+posicionesX[j+1]);
                                    x=posicionesX[j+1];
                                    y=(posicionesY[j+1]);
                                    ficha1.setLocation(x, y); 
                                    validarPosiciones();
                                     
                                    break;
                 }
              
          }
              
                   break;  
           }
          
           case 5:{
                 System.out.println("CORRER 5"); 
                 System.out.println("CORRER 12 AQUI ESTA LA FICHA"+ficha1.getX());
                 
                 for(j=0;j<posicionesX.length;j++){
                       if((ficha1.getX()<=(posicionesX[j]+30) && ficha1.getX()>=(posicionesX[j]-30)) && (ficha1.getY()<=(posicionesY[j]+30) && ficha1.getY()>=(posicionesY[j]-30))  ){ 
                                    System.out.println("CORRER 12"+posicionesX[j+1]);
                                    x=posicionesX[j+1];
                                    y=(posicionesY[j+1]);
                                    ficha1.setLocation(x, y); 
                                    validarPosiciones();
                                    break;
                 }
                       
                } 
                
                   break;  
           
           }
           case 12:{
                 System.out.println("CORRER 12");
                   System.out.println("CORRER 12 AQUI ESWEWEWEWA LA FICHA"+ficha1.getX());
                for(j=0;j<posicionesX.length;j++){
                    
                        if((ficha1.getX()<=(posicionesX[j]+30) && ficha1.getX()>=(posicionesX[j]-30)) && (ficha1.getY()<=(posicionesY[j]+30) && ficha1.getY()>=(posicionesY[j]-30))  ){ 
                                    System.out.println("CORRER 12"+posicionesX[j+2]);
                                    x=posicionesX[j+2];
                                    y=(posicionesY[j+2]);
                                    ficha1.setLocation(x, y); 
                                    validarPosiciones();
                                    break;
                        }
           }
           break;}
           case 10:{
                System.out.println("CORRER 12");
                   System.out.println("CORRER 12 AQUI ESWEWEWEWA LA FICHA"+ficha1.getX());
                for(j=0;j<posicionesX.length;j++){
                    
                        if((ficha1.getX()<=(posicionesX[j]+30) && ficha1.getX()>=(posicionesX[j]-30)) && (ficha1.getY()<=(posicionesY[j]+30) && ficha1.getY()>=(posicionesY[j]-30))  ){ 
                                    System.out.println("CORRER 12"+posicionesX[j+2]);
                                    x=posicionesX[j+2];
                                    y=(posicionesY[j+2]);
                                    ficha1.setLocation(x, y); 
                                    validarPosiciones();
                                    break;
                        }
           }
                
                break;}
        }
         
        }
        

    
    public void reset(){
        this.mover=0;
        this.j=0;
       
    }

      private void validarPosiciones() {
        if(((ficha1.getX()==ficha2.getX()) && (ficha1.getY()==ficha2.getY())) || ((ficha1.getX()==ficha3.getX()) && (ficha1.getY()==ficha3.getY())) || ((ficha1.getX()==ficha4.getX()) && (ficha1.getY()==ficha4.getY()))){
                 System.out.println("ESTAN EN LA MISMA POSICION");
            if((ficha1.getY()>=0 && ficha1.getY()<=210) || (ficha1.getY()>=470)){
                ficha1.setLocation((ficha1.getX()+9), ficha1.getY());
            }else{
                ficha1.setLocation((ficha1.getX()), ficha1.getY()+9);
            }
        }
         
        System.out.println("Es mayor que "+(ficha4.getX()-14)+"Es menor que "+(ficha4.getX()+14)+"Posicion"+ficha1.getX());
        for(int i=0;i<posicionSX.length;i++){
                System.out.println("Es mayor que "+(ficha4.getX()-14)+"Es menor que "+(ficha4.getX()+14)+"Posicion"+ficha1.getX());
             if((ficha1.getX()<=(posicionSX[i]+20) && ficha1.getX()>=(posicionSX[i]-20)) && (ficha1.getY()<=(posicionSY[i]+20) && ficha1.getY()>=(posicionSY[i]-20))  ){
                 System.out.println("Es maqwergtfyuiouytryor que "+(ficha4.getX()-14)+"Es menor que "+(ficha4.getX()+14)+"Posicion"+ficha1.getX());
                 if(((ficha1.getX()<=(ficha4.getX()+20)) && (ficha1.getX()>=(ficha4.getX()-20))) && ((ficha1.getY()<=(ficha4.getY()+20)) && (ficha1.getY()>=(ficha4.getY()-20))) ){
                     System.out.println("Entre 1FDFDF2");
                   if(jugador==2){
                        ficha4.setLocation(150, 50);
                       parques.bandera3=0;
                       parques.bandera4=0;
                }else{
                  ficha4.setLocation(560, 120);
                  parques.bandera=0;
                  parques.bandera2=0;
           }
        }
            System.out.println("Es mayor que "+(ficha3.getX()-14)+"Es menor que "+(ficha3.getX()+14)+"Posicion"+ficha1.getX());
            if(((ficha1.getX()<=(ficha3.getX()+20)) && (ficha1.getX()>=(ficha3.getX()-20))) && ((ficha1.getY()<=(ficha3.getY()+20)) && (ficha1.getY()>=(ficha3.getY()-20))) ){
               System.out.println("Entre rWEDFGRFTYer12");
                if(jugador==2){

                   ficha3.setLocation(150, 90);
                   parques.bandera3=0;
                   parques.bandera4=0;
               }else{
                   ficha3.setLocation(560, 80);
                   parques.bandera=0;
                   parques.bandera2=0;

               }
            }  
            }
        }
       
    }
}

    
