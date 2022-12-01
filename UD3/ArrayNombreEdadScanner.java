/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD3;
import java.util.Scanner;
/**
 *
 * @author nayra
 */
/**
* Crea un programa que declare 2 arrays,
* uno de nombres de personas y otro de
* edades, de 3 posiciones cada uno.
* Los datos deben leerse por teclado.
*
* Después, recórrelos imprimiendo cada par
* persona-edad en una sola línea.
*
*/
public class ArrayNombreEdadScanner {
    public static void main(String[] args) 
    {
        String nombres[];
        nombres=new String[3];
        int edades[];
        edades=new int[3];
        Scanner teclado = new Scanner(System.in);
        // Lectura de los arrays
        for (int i=0; i<3; i++)
        {
            String nombreAux,edadAux;
            System.out.print ("\nNombre "+(i+1)+ ": ");
            nombreAux=teclado.nextLine();
            nombres[i]=nombreAux;
            System.out.print ("Edad "+(i+1)+ ": ");
            edadAux=teclado.nextLine();
            edades[i]=Integer.valueOf(edadAux);
        }
        // Imprime los valores de los arrays
        for (int i=0; i<nombres.length; i++)
            System.out.println (nombres[i]+" - "+edades[i]);
        teclado.close();
    }
}
