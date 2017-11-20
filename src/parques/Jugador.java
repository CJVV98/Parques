/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author johan
 */
public class Jugador {
 
   private int cedula;
   private Timestamp fecharegistro;
   private int puntos;
   private int id;



    public Jugador(int id,int cedula, Timestamp fecharegistro, int puntos) {
        this.id=id;
        this.cedula = cedula;
        this.fecharegistro = fecharegistro;
        this.puntos = puntos;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
   
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Timestamp getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Timestamp fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    public static Jugador crear(int id,int cedula, Timestamp fecharegistro,int puntos) {
        return new Jugador(id,cedula,fecharegistro,puntos);
    }
  
   
    
}
