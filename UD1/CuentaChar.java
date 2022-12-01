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
/*Escribe un programa que lea caracteres hasta que se introduzca un asterisco.
Después imprime en pantalla el número de caracteres introducido.*/
public class CuentaChar {
    public static void main(String[] args)
    {
    int numCar = 0;
    String a;
    Scanner teclado = new Scanner(System.in);
    do
    {
        numCar++;
        System.out.print ("Escribe un carácter (* para terminar):");
        a = teclado.next();
        //} while (a.charAt(0)!='*');
    } while (!a.equals("*"));
        System.out.println ("Se han introducido " + (numCar-1) + " caracteres.");
        teclado.close();
    }
}
