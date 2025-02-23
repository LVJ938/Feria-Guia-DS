package com.luisvargas.feriaempresarial;

public class Empresa {
    
    private String nombre;
    private String sector;
    private String email;
    private Stand standAsignado;
    
    public Empresa(String nombre,String sector, String email, Stand standAsignado) {
        this.nombre = nombre;
        this.sector = sector;
        this.email = email;
        this.standAsignado = standAsignado;
        
    }
    
    public void asignarStand (Stand standAsignado){
        if (standAsignado.isLibre()) {
            this.standAsignado = standAsignado;
            standAsignado.ocuparStand();
            System.out.println("Stand asignado a la empresa " + this.nombre);
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public String getEmail() {
        return email;
    }
    
    public Stand getStandAsignado(){
        return standAsignado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setStandAsignado(Stand standAsignado){
        this.standAsignado = standAsignado;
    }
       
}
