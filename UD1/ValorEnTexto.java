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
/*Escribe un programa que lea un número del 0 al 9 y escribe su valor en texto.*/
public class ValorEnTexto {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println ("Introduce un número: ");
        num = teclado.nextInt();
        String texto="";

        if (num >= 0 && num <= 9)
        {
            switch (num)
            {
            case 1: texto="Uno"; break;
            case 2: texto="Dos"; break;
            case 3: texto="Tres"; break;
            case 4: texto="Cuatro"; break;
            case 5: texto="Cinco"; break;
            case 6: texto="Seis"; break;
            case 7: texto="Siete"; break;
            case 8: texto="Ocho"; break;
            case 9: texto="Nueve"; break;
            }
            System.out.println (texto);
        }
        else
            {
            System.out.println ("Número no válido (0..9)");
            }
        teclado.close();
    }
}
