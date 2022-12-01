/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author nayra
 */
/*Codifica un programa Java que pida al usuario que introduzca un número
decimal. A continuación, utilizando una función recursiva, escribirá el número
introducido en binario.
Repite estos pasos hasta que se introduzca un cero, momento en el que
finalizará el programa.*/
public class BinarioRecursivo {
    public void binario (int n)
    {
    if (n<2)
    {
    System.out.print (n);
    return;
    }
    else
    {
    binario (n/2);
    System.out.print (n % 2);
    return;
    }
    }
    public static void main(String[] args)
    {
        BinarioRecursivo prr2 = new BinarioRecursivo();
        Scanner teclado = new Scanner (System.in);
        int numDec = -1;
        while (numDec!=0)
        {
            System.out.print ("\nNúmero decimal: ");
            try
            {
            numDec = teclado.nextInt();
            prr2.binario(numDec);
            }
            catch (InputMismatchException ime)
            {
            System.out.println ("Es necesario introducir un número.");
            teclado.next();
            }
        }
        teclado.close();
    }
}
