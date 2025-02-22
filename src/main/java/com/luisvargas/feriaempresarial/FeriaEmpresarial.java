
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
        Stand stand1 = new Stand(1, "Pabellon A, Stand 1", "Large","Libre");
        Stand stand2 = new Stand(2, "Pabellon B, Stand 2", "Medium","Libre");
        Stand stand3 = new Stand(3, "Pabellon C, Stand 3", "Small","Libre");
        gestionF.registrarStand(stand1);
        gestionF.registrarStand(stand2);
        gestionF.registrarStand(stand3);
        //----------------------------------------------------------------------------------------------
        
        while(true){
            
            System.out.println("\n----FERIA EMPRESARIAL----");
            System.out.println("\n---- Texto de bienvenida----");
            System.out.println("1. REGISTRO DE EMPRESA");
            System.out.println("2. REGISTRO DE VISITA");
            System.out.println("3. REPORTES");
            System.out.println("4. DEJANOS UN COMENTARIO");
            System.out.println("0. SALIDA");
            System.out.print("\nSeleccione una opcion: ");
            menuP= inPut.nextInt();
            inPut.nextLine();
            
            switch(menuP){
                case 1:
                    //REGISTRO DE EMPRESA
                    do{
                            System.out.println("\n---------------------------------------");
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
                                    
                                    gestionF.agregarEmp(nombre,sector,email);
                                    utilidades.presionarEnter();
                                    break;
                                    
                                case 2: 
                                     //Editar Empresa
                                    boolean existeEmp = gestionF.mostrarEmpresas();
                                    if(existeEmp){
                                        System.out.print("\nSelecione el numero de la empresa a editar: ");
                                        int numEmp = inPut.nextInt()-1;
                                        inPut.nextLine();
                                        boolean estaEnlista = gestionF.existeEmpresa(numEmp);
                                        utilidades.presionarEnter();
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
                                    System.out.println("\nVolviendo al Menu Principal...\n");
                                    break;
                                    
                                default:
                                    System.out.println("\nOpcion no valida. Intentalo de nuevo. \n");
                                    break;     
                            }
                    }while(menuS != 0);
                    break;
                    
                case 2:
                    //Registro Visitas
                    do{
                            System.out.println("\n---------------------------------------");
                            System.out.println("REGISTRO DE VISITAS");
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
                                    //Registrar visita
                                    System.out.print("\nInicio de Registro: ");

                                    System.out.print("\n\nNombre: ");
                                    String nombreVis = inPut.nextLine();

                                   
                                    System.out.print("Correo de contacto: ");
                                    String emailVis = inPut.nextLine();
                                    
                                    System.out.print("Identificacion: ");
                                    int  IDVis = inPut.nextInt();
                                   
                                    gestionF.agregarVisita(new Visitante(nombreVis,emailVis, IDVis));
                                    utilidades.presionarEnter();
                                    break;
                                    
                                case 2: 
                                     //Editar visita
                                        boolean existeVi = gestionF.mostrarVisita();
                                        if(existeVi){
                                            System.out.print("\nSelecione el Visistante a editar: ");
                                            int numVis = inPut.nextInt()-1;
                                            inPut.nextLine();
                                            boolean estaEnlista = gestionF.existeVisita(numVis);

                                            if(estaEnlista){
                                                System.out.println("\nDeje en blanco si no desea editar el campo");

                                                System.out.print("\nNuevo nombre: ");
                                                String nombreNew = inPut.nextLine();

                                                System.out.print("Nuevo correo : ");
                                                String emailNew = inPut.nextLine();
                                                
                                                System.out.print("Nueva ID : ");
                                                int IDNew = inPut.nextInt();

                                                gestionF.editarVisita(numVis,nombreNew, IDNew, emailNew);
                                                utilidades.presionarEnter();
                                             }   
                                         }
                                    break;
                                    
                                case 3: 
                                    //Eliminar visita
                                    boolean existeVi2 = gestionF.mostrarVisita(); 
                                    if(existeVi2){
                                        System.out.print("\nSelecione el Numero de la empresa a eliminar: ");  
                                        int numDel = inPut.nextInt();
                                        gestionF.eliminarEmpresa(numDel-1);
                                        utilidades.presionarEnter();
                                    }
                                    break;
                                    
                                case 0: 
                                    //Salir 
                                    System.out.println("\nVolviendo al Menu Principal...\n");
                                    break;
                                    
                                default:
                                    System.out.println("\nOpcion no valida. Intentalo de nuevo.\n");
                                    break;     
                            }
                    }while(menuS != 0);
                    break;
                   
                case 3:
                    do{
                        System.out.println("---------------------------------------");
                        System.out.println("CONSULTA");
                        System.out.println("---------------------------------------");
                        System.out.println("\n1. Estado de Stands");
                        System.out.println("2. Mostrar Visitas");
                        System.out.println("3. Consultar ");
                        System.out.println("0. Salir");
                        System.out.print("\nSeleccione una opcion: ");
                            
                        menuS = inPut.nextInt();
                        inPut.nextLine();
                        
                        switch(menuS){
                            case 1:
                                //Mostrar Stands
                                gestionF.mostrarStans();
                                utilidades.presionarEnter();
                                break;
                            case 2:
                                //Mostrar Visitas
                                break;
                            case 3:
                                //Mostrar Calificaciones
                                break;
                            case 0:
                                //Salir del menu Reportes
                                System.out.println("\nVolviendo al Menu Principal...\n");
                                break;
                            default:
                                System.out.println("\nOpcion no valida. Intentalo de nuevo.\n");
                                break;
                        }
                    }while(menuS !=0);
                   break;  
                case 4:
                    //COMENTARIOS
                    
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    inPut.close(); 
                    System.exit(0);
                   break;
                default:
                    System.out.print("\nOpcion No Valida\n");
            }
        }
    }
}