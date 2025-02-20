
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
        
        
        // Crear algunos stands
        Stand stand1 = new Stand(1, "Pabellon A, Stand 1", "Grande","Libre");
        Stand stand2 = new Stand(2, "Pabellon B, Stand 2", "Mediano","Libre");
        gestionF.registrarStand(stand1);
        gestionF.registrarStand(stand2);
        
        while(true){
            
            System.out.println("\n----FERIA EMPRESARIAL----");
            System.out.println("---- Texto de bienvenida----");
            System.out.println("1. REGISTRO");
            System.out.println("2. CALIFICACION");
            System.out.println("3. REPORTES");
            
            
            
            
            System.out.println("\n----MENU DE EMPRESAS----");
            System.out.println("1. Registrar Empresa");
            System.out.println("2. Editar Empresas");
            System.out.println("3. Eliminar Empresas");
            
            System.out.println("4. Registrar Visita");
            System.out.println("5. Editar Visita");
            System.out.println("6. Eliminar Visita");
            System.out.println("7. Calificacion y comentarios");
            System.out.println("7. Mostrar Stands");
            System.out.println("8. Salir");
            System.out.print("\nSeleccione una opcion: ");
            
            int opcion = inPut.nextInt();
            inPut.nextLine();
            
            switch (opcion) {
                case 1:
                    // Registrar nueva empresa
                    System.out.print("\n\nInicio de Registro: ");
                    System.out.print("\n\nIngrese el nombre de la empresa: ");
                    String nombre = inPut.nextLine();

                    System.out.print("Ingrese el sector de la empresa: ");
                    String sector = inPut.nextLine();

                    System.out.print("Ingrese el correo de contacto: ");
                    String email = inPut.nextLine();
        
                    gestionF.agregarEmp(new Empresa (nombre,sector,email));
                    utilidades.presionarEnter();
       
                    break;
                case 2:
                    // Editar empresa
                    //utilidades.limpiarConsola();
                    gestionF.mostrarEmpresas();
                    System.out.print("\nSelecione la empresa a editar: ");
                    int numEmp = inPut.nextInt()-1;
                    inPut.nextLine();
                    System.out.println("\nDeje en blanco si no desea editar el campo");
                    System.out.print("\nNuevo nombre  ");
                    String nombreNew = inPut.nextLine();

                    System.out.print("Nuevo sector : ");
                    String sectorNew = inPut.nextLine();

                    System.out.print("Nuevo correo : ");
                    String emailNew = inPut.nextLine();
                    gestionF.editarEmp(numEmp, nombreNew, sectorNew, emailNew);
                    
                    utilidades.presionarEnter();
                    break; 
                    
                 case 3:
                     gestionF.mostrarEmpresas();
                     System.out.print("\nSelecione el Numero de la empresa a eliminar: ");  
                     int numDel = inPut.nextInt();
                     gestionF.eliminarEmpresa(numDel-1);
                     utilidades.presionarEnter();
                    break; 
                    
                 case 4:
                     gestionF.mostrarEmpresas();
                     utilidades.presionarEnter();
                    break; 
            
                case 6:
                     gestionF.mostrarStans();
                     utilidades.presionarEnter();
                    break; 
                    
                case 7:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    inPut.close(); 
                    System.exit(0);

                default:
                    System.out.println("!! Opcion no valida. Intente de nuevo !!");
            }
        }
    }
}
