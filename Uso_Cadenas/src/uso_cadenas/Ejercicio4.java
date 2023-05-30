/*
Ingresar una frase y contar el numero de vocales con contiene imprimir el resultado.
 */
package uso_cadenas;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
       Scanner digite = new Scanner(System.in);
       
       String frase;
       int contadorVocales = 0;
        
        //pido que digite la frase
        System.out.print("Ingrese una frase: ");
        frase = digite.nextLine();
        
        //ciclo for para contar el numero de vocales de la frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contadorVocales++;
            }
        }
        
        //imprimo el resultado
        System.out.println("La frase ingresada contiene " + contadorVocales + " vocales.");
    }
}

