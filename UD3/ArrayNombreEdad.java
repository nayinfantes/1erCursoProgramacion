/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD3;

/**
 *
 * @author nayra
 */
/**
* Crea un programa que declare 2 arrays,
* uno de nombres de personas y otro de
* edades, de 3 posiciones cada uno.
*
* Después, recórrelos imprimiendo cada par
* persona-edad en una sola línea.
*
*/
public class ArrayNombreEdad {
    public static void main(String[] args) 
    {
        String nombres[]= {"David","Alejandro","María"};
        int edades[]= {18,23,21};
        // Imprime los valores de los arrays
        for (int i=0; i<nombres.length; i++)
            System.out.println (nombres[i]+" - "+edades[i]);
    }
}
