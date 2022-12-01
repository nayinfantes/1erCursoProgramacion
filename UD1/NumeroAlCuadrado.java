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
/*Haz un programa que lea un número y escriba su cuadrado.*/
public class NumeroAlCuadrado {
    public static void main(String[] args)
    {
        int num;
        // Creamos una variable de tipo Scanner para leer el
        // teclado, que envía caracteres a través del stream // System.in
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Introduce un numero: ");
        // Leemos una valor int con el método nextInt()
        num = teclado.nextInt();
        System.out.println (num*num);
    }
}
