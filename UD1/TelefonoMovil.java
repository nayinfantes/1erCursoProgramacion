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
/*Escribe un programa que lea un número de teléfono y nos diga si es un
número móvil o no.
Utiliza el método charAt() de la clase String. Busca su referencia en Internet.*/
public class TelefonoMovil {
  public static void main(String[] args)
    {
        String telefono;
        System.out.print ("Teléfono: ");
        Scanner teclado = new Scanner(System.in);
        telefono = teclado.next();
        if (telefono.charAt(0)=='6' || telefono.charAt(0)=='7')
            System.out.println ("Es un número móvil.");
        else
            System.out.println ("No es un número móvil.");
        teclado.close();
    }  
}
