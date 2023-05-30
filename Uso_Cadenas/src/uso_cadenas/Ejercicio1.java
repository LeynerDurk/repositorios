
package uso_cadenas;


public class Ejercicio1 {

    public static void main(String[] args) {
    
         // creo los dos Strings
           String cadena1 = "cadena one";
           String cadena2 = "CADENA two";
        
        // Las imprimo
           System.out.println(cadena1);
           System.out.println(cadena2);
        
        // Imprimo el carácter en la posición 6 de la cadena1
           System.out.println(cadena1.charAt(6));
        
        // Obtengo las longitudes de las cadenas y imprimo las longitudes
           int longitud1 = cadena1.length();
           int longitud2 = cadena2.length();
           System.out.println("LA LONGITUD DE LA CADENA 1 ES: " + longitud1);
           System.out.println("LA LONGITUD DE LA CADENA 2 ES: " + longitud2);
        
        // Encuentro la primera ocurrencia del carácter "e" en la cadena1
           int indiceE = cadena1.indexOf('e');
           System.out.println("LA PRIMERA OCURRENCIA DE 'E' EN CADENA 1 ES : " + indiceE);
        
        // Encuentro la última ocurrencia del carácter "e" en la cadena2
           int ultimaIndiceE = cadena2.lastIndexOf('e');
           System.out.println("LA PRIMERA OCURRENCIA DE 'E' EN CADENA 2 ES : " + ultimaIndiceE);
        
        // Convierto cadena1 a mayúsculas
           String cadena1Mayusculas = cadena1.toUpperCase();
           System.out.println("LA CADENA 1 EN MAYUSCULAS ES: " + cadena1Mayusculas);
        
        // Convierto cadena2 a minúsculas
           String cadena2Minusculas = cadena2.toLowerCase();
           System.out.println("LA CADENA 2 EN MINUSCULAS: " + cadena2Minusculas);
        
        // Comparo los contenidos de la cadena1 y cadena2
           boolean iguales = cadena1.equals(cadena2);
           System.out.println("¿CADENA 1 Y CADENA 2 SON IGUALES?: " + iguales);
        
        // Comparo los contenidos de la cadena1 y cadena2 ignorando mayúsculas o minúsculas
           boolean igualesSinCase = cadena1.equalsIgnoreCase(cadena2);
           System.out.println("¿CADENA 1 Y CADENA 2 SON IGUALES IGNORANDO LAS LETRAS MAYUSCULAS O MINUSCULAS?: " + igualesSinCase);
        
        // Concateno la cadena1 y cadena2
           String concatenacion = cadena1 + cadena2;
           System.out.println("CONCATENACION DE LA CADENA 1 Y CADENA 2: " + concatenacion);
        
        // Pregunto si la cadena1 contiene una subcadena
           boolean contiene = cadena1.contains("esta");
           System.out.println("¿CADENA 1 CONTIENE LA SUBCADENA 'ESTA'?: " + contiene);
        
        // muestro la subcadena contenida en la cadena1, desde i hasta f (0 - 6)
           String subcadena = cadena1.substring(0, 7);
           System.out.println("LA SUBCADENA DE CADENA 1 DESDE I HASTA F (0 - 6): " + subcadena);
        
        // Reemplazo el primer carácter por el segundo en toda la cadena
           String reemplazo = cadena1.replace('a', 'i');
           System.out.println("REEMPLAZO DE 'A' POR 'I'EN LA CADENA 1 : " + reemplazo);
    }
}

