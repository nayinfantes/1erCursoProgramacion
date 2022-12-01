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
* Haz un programa que lea un String y cuente
* el número de palabras que tiene.
* Se considera el espacio en blanco como
* separador de palabras.
*
* Por ejemplo:
*
* "Universidad Alfonso X El Sabio"
* Palabras: 5
*
*/
public class CuentaPalabras {
    public static void main(String[] args)
    {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        int numEspacios=0;
        System.out.print ("Introduce frase: ");
        cadena=teclado.nextLine();
        // Quitamos espacios en blanco al inicio y al final
        cadena=cadena.trim();
        // Recorremos la cadena leída para contar los espacios en blanco que haya.
        for (int i=0; i<cadena.length(); i++)
        if (cadena.charAt(i)==' ') numEspacios++;
        // El número de palabras será el número de espacios más uno
        System.out.println (numEspacios + 1 + " palabras.");
        teclado.close();
    }
}
