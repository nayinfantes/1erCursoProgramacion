/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD1;

/**
 *
 * @author nayra
 */
/*Escribe un programa que escriba en pantalla los números pares entre el 1 y
el 100.*/
public class Pares1Y100 {
    public static void main(String[] args)
    {
        int i=1;
        /*
        * Utilizando un bucle do-while
        */
        do
            {
                if (i%2 == 0) System.out.println (i);
                i++;
            }
        while (i<=100);
        /*
        * Utilizando un bucle for, que incrementa de uno en
        * uno, por lo que hay que comprobar si el número es
        * par o no.
        */
        for (i=1; i<=100; i++) 
            if (i%2==0) System.out.println (i);
        /*
        * Utilizando un bucle for, que incrementa de 2 en 2.
        * Como empieza en 2, ya sé que itera con números pares,
        * por lo que no tengo que hacer ninguna comprobación más,
        * y directamente escribo el número en pantalla.
        */
        for (i=2; i<=100; i+=2) 
            System.out.println (i);
    }
}
