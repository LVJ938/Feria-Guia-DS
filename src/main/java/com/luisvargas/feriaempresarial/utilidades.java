
package com.luisvargas.feriaempresarial;

import java.util.Scanner;
public class utilidades {
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {  // Imprime 50 líneas en blanco
            System.out.println();
        }
    }
public static void presionarEnter() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nPresiona ENTER para continuar...");
    scanner.nextLine();  // Espera hasta que el usuario presione Enter
   }
}
