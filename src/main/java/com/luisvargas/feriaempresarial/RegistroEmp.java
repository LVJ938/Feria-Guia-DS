package com.luisvargas.feriaempresarial;

import java.util.List;
import java.util.ArrayList;
//import java.util.Scanner;

public class RegistroEmp {
    
    private final List <Empresa> empresas;
    private List <Stand> stands;
  
    //Scanner numIn = new Scanner(System.in);
    
    //contructor
    public RegistroEmp(){
        this.empresas = new ArrayList<>();
    }
    
    //metodos
    //---------------------Agregar--------------------------
    public void agregarEmp(Empresa newEmpresa){
        empresas.add(newEmpresa);
        
        System.out.println("\nEmpresa registrada con exito");
    }
    
    //---------------------Editar-------------------------
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
        System.out.println("\n Empresa actualizada con éxito."); 
    }
    
    //---------------------Eliminar--------------------------
    public void eliminarEmpresa(int numDel){
        if(numDel >= 0 && numDel < empresas.size()){
            Empresa eliminada = empresas.remove(numDel);
            System.out.println("Empresa eliminada: " + eliminada.getNombre());
        }
        else{
            System.out.println("Esta enpresa no se a registrado");
        }
    }
    //---------------------Mostrar--------------------------
    public void mostrarEmp(){
       if (empresas.isEmpty()){
        System.out.println("\n No hay Empresas registradas:");
       }
       else{
            System.out.println("\nEmpresas registradas:");
            System.out.println("------------------------");
            for (int i = 0; i < empresas.size(); i++) {
            System.out.println((i + 1) + ". " + empresas.get(i).getNombre()+ "|" + empresas.get(i).getSector()+ "|" +empresas.get(i).getEmail());
           }  
        }       
    }
}
