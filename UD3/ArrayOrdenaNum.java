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
* Escribe un programa que cree un array
* de 10 números enteros, lo ordene y
* después lo imprimia.
*
*/
public class ArrayOrdenaNum {
    public static void main(String[] args) 
    {
        int arrayEnteros[]= {32,4,7,6,45,9,12,23,3,57};
        // Imprime los valores del array recorriéndolo
        // con un bucle for
        java.util.Arrays.sort(arrayEnteros);
        for (int i=0; i<arrayEnteros.length; i++)
            System.out.println (arrayEnteros[i]);
    }
}
