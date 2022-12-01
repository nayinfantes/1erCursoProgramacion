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
/*Modifica el anterior programa para que sea el usuario quien indique cuántos
números de la serie quiere ver por pantalla.*/
public class Fibonacci2 {
    public static void main(String[] args)
    {
        int valor1=1, valor2=1;
        int suma;
        int veces=3;
        Scanner teclado = new Scanner(System.in);
        int vecesUsuario;
        // Leemos valores que introduce el usuario
        System.out.println ("¿Cuántos elementos de la serie? ");
        vecesUsuario = teclado.nextInt();
        System.out.print(valor1 + " " + valor2);
        do
            {
                suma=valor1+valor2;
                valor1=valor2;
                valor2=suma;
                System.out.print (" " + valor2);
                veces++;
            }
        while (veces<=vecesUsuario);
        teclado.close();
    }
}
