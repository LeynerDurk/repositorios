/*
Ingresar por consola una frase con varias palabras eliminar los espacios en blanco y Realizar el mismo proceso de inversión de letras. Imprimir el resultado
 */
package uso_cadenas;

import java.util.Scanner;

public class Ejercicio3 {

   
    public static void main(String[] args) {
       
        Scanner digite = new Scanner(System.in);
        String frase, fraseSinEspacios = "", fraseInvertida = "";
        
        //pido que ingrese la frase
        System.out.print("Ingrese una frase: ");
        frase = digite.nextLine();
        
        // ciclo for para eliminar los espacios en blanco
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                fraseSinEspacios += frase.charAt(i);
            }
        }
        
        // ciclo for para Invertir la frase sin espacios
        for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
            fraseInvertida += fraseSinEspacios.charAt(i);
        }
        
        //imprimo el resultado
        System.out.println("La frase ingresada es: " + frase);
        System.out.println("La frase sin espacioses: " + fraseSinEspacios);
        System.out.println("La frase invertida es: " + fraseInvertida);
    }
}
