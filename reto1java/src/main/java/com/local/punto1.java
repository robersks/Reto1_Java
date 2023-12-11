package com.local;

import java.util.Scanner;


public class punto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Punto 1:");
        System.out.println(" ");

        // Declaracion de variables :
        int n;
        int suma = 0 ;

        // LECTURA DE NÚMERO A TRABAJAR
        System.out.print("Digite un numero N: "); 
        n = scanner.nextInt(); 
        scanner.close();   

        // PROCEDIMIENTO
        for (int i = 1; i < n; i++) {
            
            // VALIDAR QUE NO SEAN MULTIPLOS DE 3 Y DE 5  ( NO PUEDE SER MULTIPLO DE LOS DOS)
            if ((i%3 == 0) && (i%5 == 0)) {
                continue;   // DE SER MULTIPLO DE LOS DOS, SALTARA AL SIGUIENTE NUMERO I , 
                            //OMITIENDO EL CODIGO RESTANTE
            }
            
            // VALIDAR SI ES MULTIPLO DE ALGUNO DE LOS NUMEROS, DE 3 O 5
            if ((i%3 == 0) || (i%5 == 0)) {
                suma += i; // EN VARIABLE SUMA IR ALMACENANDO LA SUMA DE LOS NUMEROS ENCONTRADOS
                System.out.print ( i + " + " ); // IMPRIMIR LOS NUMEROS ENCONTRADOS 
            }
        }

        System.out.println(" = " + suma); // FINALIZAR MOSTRANDO EL RESULTADO DE LA SUMA
    }
}