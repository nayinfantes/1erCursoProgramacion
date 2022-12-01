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
* Lee un string y escribe su tamaño.
*/
public class StringLength {
    public static void main(String[] args)
    {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Cadena: ");
        cadena=teclado.nextLine();
        System.out.println (cadena.length());
        teclado.close();
    }
}
