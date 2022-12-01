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
/*Haz un programa que lea dos números y escriba los dos en pantalla rodeando
entre paréntesis el mayor (si lo hay).
Intenta leer los dos números en una sola línea de entrada.*/
public class ParentesisMayorNum {
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        // La entrada de los números se realiza
        // separándolos por un espacio en la misma línea
        System.out.print ("Escribe dos números: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        if (num1==num2) 
            System.out.println (num1 + " - " + num2);
        else if (num1>num2) 
            System.out.println ("("+num1+ ") - " + num2);
        else 
            System.out.println (num1+ " - ("+ num2+")");
        teclado.close();
    }
}
