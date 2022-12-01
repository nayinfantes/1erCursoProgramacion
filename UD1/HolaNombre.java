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
/*Realiza un programa que lea un nombre y escriba en pantalla:

Hola <nombre>*/
public class HolaNombre {
    public static void main(String[] args)
    {
        String nombre;
        // Creamos una variable de tipo Scanner para leer el
        // teclado, que envía caracteres a través del stream // System.in
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Nombre: ");
        // Leemos un valor String con el método next()
        nombre = teclado.next();
        System.out.println ("Hola " + nombre);
    }
}
