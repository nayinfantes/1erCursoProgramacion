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
* Lee dos cadenas y las escribe
* separadas por un espacio en blanco.
*
*/
public class DosStrings {
    public static void main(String[] args)
    {
        String cad1, cad2;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Una cadena: ");
        cad1=teclado.next();
        System.out.print ("Otra cadena: ");
        cad2=teclado.next();
        System.out.println (cad1 + " " + cad2);
        teclado.close();
    }
}
