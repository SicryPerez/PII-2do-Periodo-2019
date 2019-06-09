/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

/**
 *
 * @author sicry
 */
public class MiPrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de variables      
        int miPrimerVariable;
        miPrimerVariable = 49;

        System.out.println("*********USO DE PRINT, PRINTLN, PRINTF*************");

        //Estoy usando PRINTL
        System.out.println("Esta es mi primer varible entera con PRINTLN");
        System.out.println(miPrimerVariable);

        System.out.println("-------------------------------------------");

        //Estoy utilizando PRINT
        System.out.print("Esa es mi primer variable entera con PRINT: ");
        System.out.print(miPrimerVariable);
        System.out.print("\n-------------------------------------------");

        //Estoy utilizando PRINTF
        String miNombre = " CARLOS LOPEZ ";
        int miEdad = 23;
        System.out.printf("%nEste parrafo es con PRINTF%nMi nombre es%s, y tengo la edad de %d %n", miNombre, miEdad);
        System.out.println("-------------------------------------------");

        System.out.println("\n*********USO DE CARACTERES DE ESCAPE*************");
        //Estoy utilizando concatenacion
        System.out.println("Utilizo concatenación");
        System.out.println("Mi variable entera es: \n" + miPrimerVariable);
        System.out.println("-------------------------------------------");

        //TABULAR TEXTO
        System.out.println("Utilizo \\t y \\n");
        System.out.println("Estoy utilizando tabulador. \t Tabula aqui. \n\t Estoy utilizando cambio de linea con tabulador. ");

        //Escriber / y "
        System.out.println("Utilizo \\t y \"");
        System.out.println(" Mi nombre es: \"Sicry Perez\" ");
        System.out.println(" El directorio es C:\\miusuario\\documentos");

        System.out.println("\n*********CONVERSIONES DE DATOS PRIMITIVOS*************");
        byte miVariableByte = 6;
        int miVariableInt;

        //CONVERSION IMPLICITA
        System.out.println("\n------------CONVERSIONES IMPLICITA-----------");
        miVariableInt = miVariableByte;

        System.out.println("Esta es una conversion Implicita ");
        System.out.println("mi Variable INT:" + miVariableInt);

        //CONVERSION EXPLICITA
        System.out.println("\n------------CONVERSIONES EXPLICITA-----------");
        byte miVariableByte2;
        int miVariableInt2 = 790;

        miVariableByte2 = (byte) miVariableInt2;

        System.out.println("Esta es una conversion Explicita ");
        System.out.println("mi Variable BYTE:" + miVariableByte2);

        //CONVERTIR ENTERO A CHAR
        System.out.println("\n------------CONVERTIR ENTERO A CHAR-----------");
        int miVariableInt1 = 62;
        char miVaribleChar;
        miVaribleChar = (char) miVariableInt1;

        System.out.println("Convertir el entero: " + miVariableInt1 + " a char: " + miVaribleChar);
               
    }

}
