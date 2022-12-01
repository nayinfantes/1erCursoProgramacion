/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD1;
import java.util.Scanner;
/**
 *
 * @author nayra
 */
/*Escribe un programa que lea caracteres que introduce un usuario y cuente el
número de cada una de las vocales que introduzca.
El programa termina cuando el usuario introduzca un asterisco, momento en
el cual se debe imprimir el recuento de cada una de las vocales, el total de
letras introducidas y el número de letras que no eran vocales.*/
public class CuentaVocales {
    public static void main(String[] args)
    {
        int contaA=0, contaE=0, contaI=0, contaO=0, contaU=0;
        int totalCars = 0;
        String caracter;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print ("letra: ");
            caracter = teclado.next();
            totalCars++;
            switch (caracter.charAt(0))
            {
                case 'a': contaA++; break;
                case 'e': contaE++; break;
                case 'i': contaI++; break;
                case 'o': contaO++; break;
                case 'u': contaU++; break;
            }

        } while (caracter.charAt(0)!='*');
            System.out.println ("\nA: " + contaA);
            System.out.println ("E: " + contaE);
            System.out.println ("I: " + contaI);
            System.out.println ("O: " + contaO);
            System.out.println ("U: " + contaU);
            System.out.println ("\nNúmero total: " + totalCars);
            System.out.println ("Vocales: " +(contaA+contaE+contaI+contaO+contaU));
            System.out.println ("No vocales: " + ((totalCars-(contaA+contaE+contaI+contaO+contaU))));
        teclado.close();
    }
}
