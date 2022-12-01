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
/*Escribe un programa que solicite la introducción de un año y nos diga si es
bisiesto o no.*/
public class AnioBisiesto {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int anio;
        System.out.println ("Introduce un año: ");
        anio = teclado.nextInt();
        /*
        * Un año es bisiesto si es divisible por 4, a
        * excepción de aquellos años que son divisibles
        * por 100 pero no por 400.
        */
        if ((anio % 4) == 0)
        {
            if ( ((anio % 100)==0) && !((anio % 400)==0) )
            {
            System.out.println ("No es bisiesto.");
            }
            else
            {
            System.out.println ("Bisiesto.");
            }
        }
        else
            {
            System.out.println ("No es bisiesto.");
            }
        teclado.close();
    }
}
