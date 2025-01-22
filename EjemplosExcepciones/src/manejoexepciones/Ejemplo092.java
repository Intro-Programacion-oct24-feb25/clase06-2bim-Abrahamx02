/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            try {
                System.out.println("Ingrese un pais");
                String pais = entrada.nextLine();
                pais = pais.toLowerCase();
                char letra = pais.charAt(0);
                
                if (letra =='a' || letra =='e' || letra =='i'
                        || letra =='o'|| letra =='u') {
                    
                    throw new Exception("Incorrecto el pais empieza con vocal deberia iniciar con una consonante");
                }
                bandera = false;
             System.out.printf("%s\n", pais);
            } catch (Exception a) {
                System.out.printf("Ocurrio una excepcion %s\n", a);
            }
           
        }
        
    }
}
