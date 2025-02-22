package com.luisvargas.feriaempresarial;

public class Visitante {
    
    private String nombreV;
    private int idV;
    private String emailV;
    
    public Visitante (String nombreVis, String emailVis, int idVis){
        this. nombreV= nombreVis;
        this.idV = idVis;
        this.emailV = emailVis;
    }
    
    //mrtodos getter y setters

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

    public void setEmailV(String emailV) {
        this.emailV = emailV;
    }

    public String getNombreV() {
        return nombreV;
    }

    public int getIdV() {
        return idV;
    }

    public String getEmailV() {
        return emailV;
    }
    
    

    
    
    
}
