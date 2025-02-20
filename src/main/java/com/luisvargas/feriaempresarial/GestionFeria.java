package com.luisvargas.feriaempresarial;

import java.util.ArrayList;
import java.util.List;


public class GestionFeria {
   
    private final List<Empresa> empresas;
    private final List<Stand> stands;
    private final List<Visitante> visitas;
    private final List<Comentario> comentarios;  
    private int controlStand = -1;
    
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
            System.out.println("Empresa eliminada: " + eliminada.getNombre());
            stands.get(numDel).setEstado("Libre");
        }
        else{
            
            System.out.println("Esta enpresa no se a registrado");
        }
    }
    
    public void mostrarEmpresas() {
        System.out.println("\n-----------------------------------------");
        System.out.println(" Lista de empresas y Stands");
        System.out.println("-----------------------------------------");
        if(empresas.isEmpty()){
            System.out.println("\n ...No hay empresas registradas...");
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
            
            } 
         }
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

    public void agregarVisita(Visitante newEmpresa){
      
        //visitas.add();
        stands.get(controlStand).setEstado("Ocupado");
        System.out.println("\nEmpresa registrada con exito");
        System.out.println("------------------------------------------");

    }
    

}