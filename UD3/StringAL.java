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
* Haz un programa que lea un String y me
* diga si comienza por “AL”.
*
*/
public class StringAL {
    public static void main(String[] args)
    {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Cadena: ");
        cadena=teclado.nextLine();
        if (cadena.toUpperCase().startsWith("AL"))
            System.out.println ("Comienza por AL");
        else 
            System.out.println ("NO comienza por AL");
        teclado.close();
    }
}
