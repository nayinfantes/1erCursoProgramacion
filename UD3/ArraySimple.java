/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD3;
import java.util.Arrays;
/**
 *
 * @author nayra
 */
/**
* Escribe un programa que cree un array
* de 10 números enteros.
* Inicialízalo y después recórrelo con
* un bucle for para imprimir sus valores
* por pantalla.
*
*/
public class ArraySimple {
    public static void main(String[] args) {
        int arrayEnteros[]= {3,4,7,6,8,9,3,4,6,7};
        // Imprime los valores del array recorriéndolo
        // con un bucle for
        for (int i=0; i<arrayEnteros.length; i++)
            System.out.println (arrayEnteros[i]);
        // Imprime el array usando toString
        System.out.println (Arrays.toString(arrayEnteros));
        // Imprime el array usando for-each
        for (int elem: arrayEnteros) 
            System.out.println (elem);
    }
}
