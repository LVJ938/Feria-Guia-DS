package com.luisvargas.feriaempresarial;

public class Visitante {
    
    private String nombreVist;
    private int idVist;
    private String emailVist;
    
    public Visitante (String nombreVist, int idVist, String emailVist){
        this.nombreVist = nombreVist;
        this.idVist = idVist;
        this.emailVist = emailVist;
    }
    
    //mrtodos getter y setters

    public String getNombreVist() {
        return nombreVist;
    }

    public int getIdVist() {
        return idVist;
    }

    public String getEmailVit() {
        return emailVist;
    }

    public void setNombreVist(String nombreVist) {
        this.nombreVist = nombreVist;
    }

    public void setIdVist(int idVist) {
        this.idVist = idVist;
    }

    public void setEmailVit(String emailVit) {
        this.emailVist = emailVit;
    }
    
    // metodos Para administrar
    
    
}
