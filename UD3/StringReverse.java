/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD3;
import java.util.Scanner;
/**
 *
 * @author nayra
 */
/**
* Haz un programa que lea un String y lo
* escriba al revés.
*
* Por ejemplo:
*
* "Caperucita"
* aticurepaC
*
*/
public class StringReverse {
    public static void main(String[] args)
    {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Introduce frase: ");
        cadena=teclado.nextLine();
        // Recorremos la cadena leída desde su última
        // posición hasta la inicial (posición cero)
        for (int i=cadena.length()-1; i>=0; i--)
        System.out.print (cadena.charAt(i));
        teclado.close();
    }
}
