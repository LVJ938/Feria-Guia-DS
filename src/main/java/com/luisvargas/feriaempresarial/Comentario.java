package com.luisvargas.feriaempresarial;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Comentario {
    
   //private Visitante visita;
    private Stand stands;
    private Date fechaVist;
    private int calificacion;
    private String comentario;
    
    //metodo constructor
    public Comentario(Stand stands,int calificacion,String comentario){
        //this.visita = visita;
        this.stands = stands;
        this.fechaVist = new Date();
        this.calificacion = calificacion;
        this.comentario = comentario;   
    }
    
    //Metodos getter y setter
    /*
    public Visitante getVisita() {
        return visita;
    }
    */
    public Stand getStands() {
        return stands;
    }

    public Date getFechaVist() {
        return fechaVist;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }
    /*
    public void setVisita(Visitante visita) {
        this.visita = visita;
    }
    */
    public void setStands(Stand stands) {
        this.stands = stands;
    }

    public void setFechaVist(Date fechaVist) {
        this.fechaVist = fechaVist;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String getFechaFormateada() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fechaVist);
    }
    
    @Override
    public String toString() {
        return "Calificacion " + calificacion + " estrellas\n" +
               "Stand " + stands + " \n" + 
                fechaVist + "\n" +
               "Comentario " + comentario;
    }
}
