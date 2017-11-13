/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *Aqui encapsula los dalos que llegan desde el pnael1 
 * @author johan
 */
public class Persona {
    private int id,cedula,edad;
    private String nombre, apellido,foto,contrasena;
    private Date fechanac;
    private Timestamp fecharegistro;

/**
 * Constructor persona
 * @param id
 * @param cedula
 * @param edad
 * @param nombre
 * @param apellido
 * @param tipo
 * @param fechanac
 * @param fecharegistro 
 */
    public Persona(int id, int cedula, int edad, String nombre, String apellido, Date fechanac, Timestamp fecharegistro, String foto, String contrasena) {
        this.id = id;
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
        this.fecharegistro = fecharegistro;
        this.contrasena=contrasena;
        this.foto=foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public Timestamp getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Timestamp fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

 

  /**
   * Metodo para crear el usuario
   * @param id
   * @param cedula
   * @param edad
   * @param nombre
   * @param apellido
   * @param tipo
   * @param fechanac
   * @param fecharegistro
   * @return 
   */
     public static Persona crear(int id, int cedula, int edad, String nombre, String apellido,Date fechanac, Timestamp fecharegistro, String foto, String contrasena) {
        return new Persona(id,cedula,edad,nombre,apellido,fechanac,fecharegistro,foto,contrasena );
    }

}
