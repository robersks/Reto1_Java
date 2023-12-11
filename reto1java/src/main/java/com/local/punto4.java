package com.local;

public class punto4 {
    public static void main(String[] args) {
        System.out.println("Punto 4:");
        System.out.println(" ");


        // EJERCICIO:
        // El ejercicio tiene el fin de imprimir en pantalla una serie de 10 números, el siguiente número será el doble que el número anterior 

        // Declarar las variables a & b como variable de tipo de dato entero
        int a = 0 , b = 1;
        
        // Se crea un ciclo con el fin de imprimir 10 numeros resultado de una operacion
        for (int i = 0; i < 10 ; i++) {
            System.out.print(a + " "); // se imprime el valor inicial los numero , este caso se inicia en 0
            a = b ; // el numero anterior tomará el valor del numero siguiente 
            b = a + b; // el numero siguiente tomara el valor de el boble del numero anterior
        }
        System.out.println(" "); // se implime linea en blanco para separar la serie de numeros y verla con mejor claridad
    }
}