/*
Ingresar una palabra por consola almacenarlas en un String, emplear un método para invertir el texto ingresado e imprimir las dos palabras (ingresada /invertida)
*/
package uso_cadenas;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        
        Scanner digite = new Scanner(System.in);
        
        String palabra, palabraInvertida = "";
        
        //pido que ingrese la palabra
        System.out.print("Ingrese una palabra: ");
        palabra = digite.nextLine();
        
        //ciclo for para invertir la palabra
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        
        //imprimo los resultados
        System.out.println("Palabra ingresada: " + palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);
    }
}
    
