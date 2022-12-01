/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD1;

/**
 *
 * @author nayra
 */
/*Haz un programa que escriba en pantalla los primeros 10 números de la serie
de Fibonacci.*/
public class Fibonacci {
    public static void main(String[] args)
    {
        int valor1=1, valor2=1;
        int suma;
        int veces=3;
        System.out.print(valor1 + " " + valor2);
        do
            {
                suma=valor1+valor2;
                valor1=valor2;
                valor2=suma;
                System.out.print (" " + valor2);
                veces++;
            }
        while (veces<=10);
        System.out.println ("");
    }
}
