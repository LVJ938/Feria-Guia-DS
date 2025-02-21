
package com.luisvargas.feriaempresarial;

/**
 *
 * Luis Vargas
 */

import java.util.Scanner;

public class FeriaEmpresarial {
        
    public static void main(String[] args) {
        
        Scanner inPut = new Scanner(System.in);
        GestionFeria gestionF = new GestionFeria();
        int menuP,menuS;
        
        // Crear algunos stands----------------------------------------------------------------
        Stand stand1 = new Stand(1, "Pabellon A, Stand 1", "Grande","Libre");
        Stand stand2 = new Stand(2, "Pabellon B, Stand 2", "Mediano","Libre");
        gestionF.registrarStand(stand1);
        gestionF.registrarStand(stand2);
        //----------------------------------------------------------------------------------------------
        
        while(true){
            
            System.out.println("\n----FERIA EMPRESARIAL----");
            System.out.println("\n---- Texto de bienvenida----");
            System.out.println("1. REGISTRO DE EMPRESA");
            System.out.println("2. REGISTRO DE VISITA");
            System.out.println("3. CALIFICACION");
            System.out.println("4. REPORTES");
            System.out.println("0. SALIDA");
            System.out.print("\nSeleccione una opcion: ");
            menuP= inPut.nextInt();
            inPut.nextLine();
            
            switch(menuP){
                case 1:
                    //REGISTRO DE EMPRESA
                    do{
                            System.out.println("---------------------------------------");
                            System.out.println("REGISTRO DE EMPRESA");
                            System.out.println("---------------------------------------");
                            System.out.println("\n1. Registrar");
                            System.out.println("2. Editar");
                            System.out.println("3. Eliminar");
                            System.out.println("0. Salir");
                            System.out.print("\nSeleccione una opcion: ");
                            
                            menuS = inPut.nextInt();
                            inPut.nextLine();
                            switch(menuS){
                                case 1: 
                                    //Registrar Empresa
                                    System.out.print("\nInicio de Registro: ");

                                    System.out.print("\n\nNombre de la empresa: ");
                                    String nombre = inPut.nextLine();

                                    System.out.print("Sector de la empresa: ");
                                    String sector = inPut.nextLine();

                                    System.out.print("Correo de contacto: ");
                                    String email = inPut.nextLine();
                                    
                                    gestionF.agregarEmp(new Empresa(nombre,sector,email));
                                    utilidades.presionarEnter();
                                    break;
                                    
                                case 2: 
                                     //Editar Empresa
                                        boolean existeEmp = gestionF.mostrarEmpresas();
                                    if(existeEmp){
                                        System.out.print("\nSelecione la empresa a editar: ");
                                        int numEmp = inPut.nextInt()-1;
                                        inPut.nextLine();
                                        boolean estaEnlista = gestionF.existeEmpresa(numEmp);
                                        
                                        if(estaEnlista){
                                            System.out.println("\nDeje en blanco si no desea editar el campo");
                                            
                                            System.out.print("\nNuevo nombre: ");
                                            String nombreNew = inPut.nextLine();
                                            
                                            System.out.print("Nuevo sector : ");
                                            String sectorNew = inPut.nextLine();

                                            System.out.print("Nuevo correo : ");
                                            String emailNew = inPut.nextLine();
                                            
                                            gestionF.editarEmp(numEmp, nombreNew, sectorNew, emailNew);
                                            utilidades.presionarEnter();
                                             }   
                                         }
                                    break;
                                    
                                case 3: 
                                    //Eliminar Empresa
                                    boolean existeEmp2 = gestionF.mostrarEmpresas(); 
                                    if(existeEmp2){
                                        System.out.print("\nSelecione el Numero de la empresa a eliminar: ");  
                                        int numDel = inPut.nextInt();
                                        gestionF.eliminarEmpresa(numDel-1);
                                        utilidades.presionarEnter();
                                    }
                                    break;
                                    
                                case 0: 
                                    //Salir 
                                    System.out.println("\nVolviendo al Menu Principal...");
                                    break;
                                    
                                default:
                                    System.out.println("Opcion no valida. Intentalo de nuevo.");
                                    break;     
                            }
                    }while(menuS != 0);
                    break;
                    
                case 2:
                    System.out.print("REGISTRAR VISITA");
                    break;
                case 3:
                    System.out.print("REGISTRAR CALIFICACION");
                    break;
                case 4:
                    System.out.print("REPORTES");
                   break;
                case 0:
                    System.out.print("SALIDA");
                   break;
                default:
                    System.out.print("Opcion No Valida");
            }
        }
    }
}