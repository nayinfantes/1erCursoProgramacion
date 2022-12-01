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
* Escribe un programa que lea la altura
* de N personas y calcule su altura media.
*
* Calcula después cuántas personas tienen una
* altura igual, superior o menor a la media
* e imprime esos valores.
*
*/
public class AlturaMedia {
    public static void main(String[] args) 
    {
        // Alturas en cm
        int alturas[];
        String aux;
        int numAlturas;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("¿Cuántas alturas? ");
        aux=teclado.nextLine();
        numAlturas=Integer.valueOf(aux);
        // Alturas en centímetros
        alturas = new int[numAlturas];
        // Leemos las alturas y hacemos el sumatorio
        int suma=0;
        float alturaMedia=0;
        // Lectura de las alturas
        for (int i=0; i<numAlturas; i++)
        {
            String numAux;
            System.out.print ("Altura "+(i+1)+ " (cm): ");
            numAux=teclado.nextLine();
            alturas[i]=Integer.valueOf(numAux);
            suma+=alturas[i];
        }
        // Calculamos la media de las alturas,
        // haciendo casting para mantener los decimales
        alturaMedia=(float)suma/numAlturas;
        System.out.println ("\nAltura media: "+alturaMedia+" cm");
        // Escribimos las alturas indicando si
        // es la altura media o si está por encima
        // o por debajo
        for (int i=0; i<numAlturas; i++)
        {
            System.out.print ("Altura "+(i+1)+": "+alturas[i]+" cm ");
            if (alturas[i]<alturaMedia) 
                System.out.println ("v");
            else if (alturas[i]>alturaMedia) 
                System.out.println ("^");
            else 
                System.out.println ("=");
        }
        teclado.close();
    }
}
