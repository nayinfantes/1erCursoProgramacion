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
/*Haz un programa que lea un número y me diga si es mayor que 50, menor
que 50 o igual a 50.*/
public class MayorMenor50 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println ("Introduce un número: ");
        num = teclado.nextInt();
        if (num<50) 
            System.out.println ("<50");
        else if (num==50) 
            System.out.println ("=50");
        else 
            System.out.println (">50");
        teclado.close();
    }
}
