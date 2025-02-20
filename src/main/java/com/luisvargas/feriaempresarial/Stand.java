package com.luisvargas.feriaempresarial;

public class Stand {
    
    private int numeroStand;
    private String ubicacion;
    private String tamaño;
    private String estado;
    private boolean libre;
    
    //constructor
    public Stand(int numeroStand, String ubicacion, String tamaño, String estado){
        this.numeroStand = numeroStand;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.estado = estado;
        this.libre = true;
    }
    
    //metodos getters 

    public int getNumeroStand() { return numeroStand; }
    public String getUbicacion() { return ubicacion; }
    public String getTamaño() { return tamaño; }
    public String getTestado() { return estado; }
    
    //metodos Setters
     public void setNumeroStand(int numeroStand) {
        this.numeroStand = numeroStand;
    }
     public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
      public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
      public void setEstado(String estado) {
          this.estado = estado;
      }
    
    public boolean isLibre() {
        return libre;
    }

   

   

 
    //metodos control de stand
    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    public void ocuparStand() {
        this.libre = false;
    }

    public void liberarStand() {
        this.libre = true;
    }
  
}
