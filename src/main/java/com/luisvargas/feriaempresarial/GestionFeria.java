package com.luisvargas.feriaempresarial;

import java.util.ArrayList;
import java.util.List;


public class GestionFeria {
   
    private final List<Empresa> empresas;
    private final List<Stand> stands;
    private final List<Visitante> visitas;
    private final List<Comentario> comentarios;  
    int controlStand = -1;
    
    //inicializamos las ArrayList 
    public GestionFeria() {
        empresas = new ArrayList<>();
        stands = new ArrayList<>();
        visitas = new ArrayList<>();
        comentarios = new ArrayList<>();  
    }
    
    
    //-----------------------------------------
    //metodos Gestion de Empresas
    //------------------------------------------
    public void agregarEmp(Empresa newEmpresa){
        controlStand = controlStand+1;
        empresas.add(newEmpresa);
        stands.get(controlStand).setEstado("Ocupado");
        System.out.println("\nEmpresa registrada con exito");
        System.out.println("------------------------------------------");
        System.out.println("Estand asignado ");
        System.out.println("------------------------------------------");
        System.out.println( stands.get(controlStand).getNumeroStand()+" "+stands.get(controlStand).getUbicacion()+" "+stands.get(controlStand).getTamaño());
        
    }
    
    public void editarEmp(int numEmp, String nuevoNombre, String nuevoSector,String nuevoEmail){
        Empresa editEmp = empresas.get(numEmp);
        
        if (!nuevoNombre.isEmpty()){
            editEmp.setNombre(nuevoNombre);
        }
        
        if (!nuevoSector.isEmpty()){
            editEmp.setSector(nuevoSector);
        }
        
        if (!nuevoEmail.isEmpty()){
            editEmp.setEmail(nuevoEmail);
        }
        System.out.println("\n Empresa actualizada con exito."); 
    }
    
    public void eliminarEmpresa(int numDel){
        
        if(numDel >= 0 && numDel < empresas.size()){
            Empresa eliminada = empresas.remove(numDel);
            System.out.println("\nEmpresa "+ eliminada.getNombre()+" eliminada con exito " );
            stands.get(numDel).setEstado("Libre");
        }
        else{
            
            System.out.println("\nEsta empresa no se a registrado");
        }
    }
    
    public boolean  mostrarEmpresas() {
        boolean a = true;
        System.out.println("\n-----------------------------------------");
        System.out.println(" Lista de empresas y Stands");
        System.out.println("-----------------------------------------");
        if(empresas.isEmpty()){
            System.out.println("\n ...No hay empresas registradas...\n");
            a= false;
        }
        else{
            for (int i = 0; i < empresas.size(); i++) {
            Empresa empresa = empresas.get(i);
            Stand stand = stands.get(i);
            System.out.println("------------------" +" Numero "+stand.getNumeroStand()+"---------------------");
            System.out.println("Empresa: " + empresa.getNombre());
            System.out.println("Sector: " + empresa.getSector());
            System.out.println("Correo: " + empresa.getEmail());
            System.out.println("Stand: "+ stand.getNumeroStand()+" "+stand.getUbicacion()+" "+stand.getTamaño());
            a=true;
            } 
         }
        return(a);
    }
    
    public  boolean existeEmpresa(int numEmpresa){
        boolean esta;
        if(numEmpresa >= 0 && numEmpresa < empresas.size()){
            System.out.println("\nEmpresa registrada ");
            esta = true;
        }
        else{
            
            System.out.println("\nEsta enpresa no se a registrado");
            esta = false;
        }
        return (esta);
    }
    
    //-----------------------------------------
    //metodos Gestion de Stands
    //------------------------------------------
    public void mostrarStans() {
         System.out.println("\nEStado de Stands:");
         System.out.println("----------------------------");
         for (int i = 0; i < stands.size(); i++) {
             Stand stand = stands.get(i);
             System.out.println(stand.getNumeroStand()+" "+stand.getUbicacion()+" "+stand.getTamaño()+" "+stand.getTestado());  
             System.out.println("----------------------------");
         }
        
    }
    
    public void registrarStand(Stand satands){
        stands.add(satands);  
    }
    
     //-----------------------------------------
    //metodos Gestion de Visitas
    //------------------------------------------

    public void agregarVisita(Visitante newVisita){
        
        visitas.add(newVisita);
        System.out.println("\nVisitante registrada con exito");
        System.out.println("------------------------------------------");
        
    }
    
    public void editarVisita(int numEmp, String nuevoNombre, String nuevoSector,String nuevoEmail){
        Empresa editEmp = empresas.get(numEmp);
        
        if (!nuevoNombre.isEmpty()){
            editEmp.setNombre(nuevoNombre);
        }
        
        if (!nuevoSector.isEmpty()){
            editEmp.setSector(nuevoSector);
        }
        
        if (!nuevoEmail.isEmpty()){
            editEmp.setEmail(nuevoEmail);
        }
        System.out.println("\n Empresa actualizada con exito."); 
    }
    
    public void eliminarVisita(int numDel){
        
        if(numDel >= 0 && numDel < visitas.size()){
            Visitante eliminado = visitas.remove(numDel);
            System.out.println("Visitantes eliminado: " + eliminado.getNombreVist());
        }
        else{
            
            System.out.println("Este Visitante no esta registrado");
        }
    }
    
    public void mostrarVisita(){
        System.out.println("\n-------------------------");
        System.out.println(" Lista de Visitantes");
        System.out.println("----------------------------");
        if(visitas.isEmpty()){
            System.out.println("\n ...No hay Visitas registradas...");
        }
        else{
            for (int i = 0; i < visitas.size(); i++) {
            Visitante visita = visitas.get(i);
            System.out.println("------------------" +" Visitante  "+(i+1)+". -------------------");
            System.out.println("Nombre: " + visita.getNombreVist());
            System.out.println("Identificacion: " + visita.getIdVist());
            System.out.println("Correo: " + visita.getEmailVit());
            } 
         }  
    }
    
     public  boolean existeVisita(int numVisita){
        boolean esta;
        if(numVisita >= 0 && numVisita< visitas.size()){
            System.out.println("\nVisitante  registrado ");
            esta = true;
        }
        else{
            
            System.out.println("\nVisitante no registrado");
            esta = false;
        }
        return (esta);
    }
    

}