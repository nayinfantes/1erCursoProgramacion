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
* Escribe un programa que cree un
* array de 5 nombres de personas y
* los imprima por pantalla.
*
*/
public class ArrayNombres {
    public static void main(String[] args) 
    {
        String nombres[]={"David","Alejandro","María","Beatriz","Jaime"};
        // Imprime los valores del array recorriéndolo
        // con un bucle for
        for (int i=0; i<nombres.length; i++)
            System.out.println (nombres[i]);
        // Array ordenado alfabéticamente
        java.util.Arrays.sort(nombres);
        for (int i=0; i<nombres.length; i++)
            System.out.println (nombres[i]);

    }
}
