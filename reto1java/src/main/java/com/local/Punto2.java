package com.local;
import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {

        System.out.println("Punto 2:");
        System.out.println(" ");

        //String clave = "@1Aa0000";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite una clave: ");
        String clave = scanner.nextLine(); 
        scanner.close();

        boolean cont_minus = false;
        boolean cont_mayus = false;
        boolean cont_digit = false;
        boolean cont_simbolo = false;
        String simbolos = "!@#$%^&*";

        for (char caracter : clave.toCharArray()) {
            // System.out.println(caracter); // imprimir el caracter
            if (Character.isLowerCase(caracter)) {
                cont_minus = true;
            } else if (Character.isUpperCase(caracter)) {
                cont_mayus = true;
            } else if (Character.isDigit(caracter)) {
                cont_digit = true;
            }
            for (char caracter_2 : simbolos.toCharArray()) {
                if (caracter == caracter_2) {
                    cont_simbolo = true;
                }
            }
        }
        System.out.println("");
        if ((cont_simbolo == false || cont_minus == false || cont_mayus == false || cont_digit == false) || (clave.length() < 8) ) {
            System.out.println("ERROR: Esta clave no cumple con los requisitos.");
            System.out.println("");

            if (clave.length() < 8) {
                System.out.println("Debe contener al menos 8 digitos");
            }
            if (cont_minus == false) {
                System.out.println("Debe contener una minuscula");
            }
            if (cont_mayus == false) {
                System.out.println("Debe contener una mayuscula");
            }
            if (cont_digit == false) {
                System.out.println("Debe contener un número");
            }
            if (cont_simbolo == false) {
                System.out.println("Debe contener uno de los siguientes simbolos : !, @, #, $, %, ^, &, * ");
            }
        } else {
            System.out.println("Clave valida!");
        }
        System.out.println("");
    }
}



