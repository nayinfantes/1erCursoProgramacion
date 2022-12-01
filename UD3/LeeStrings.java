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
* Lee strings hasta que uno
* tenga 7 caracteres de longitud.
*/
public class LeeStrings {
    public static void main(String[] args)
    {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        do
        {
            System.out.print ("Cadena: ");
            cadena=teclado.nextLine();
            System.out.println (cadena.length());
        } while (cadena.length()!=7);
            System.out.println ("¡Eso es! 7 caracteres");
        teclado.close();
    }
}
