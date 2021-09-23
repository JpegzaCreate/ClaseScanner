/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescanner;

import java.util.Scanner;

/**
 *
 * @author javip
 */
public class ClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);        
        System.out.printf("Introduce tu nombre: ");
        String nombre = ent.nextLine();
        System.out.printf("Tu nombre es: " + nombre);

        
        
    }
    
}
