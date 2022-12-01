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
/*Haz un programa que nos diga si un número introducido por teclado es par o
impar.*/
public class ParImpar {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println ("Introduce un número: ");
        num = teclado.nextInt();
        if (num % 2 == 0) 
            System.out.println ("Par");
        else 
            System.out.println ("Impar");
        teclado.close();
    }
}
