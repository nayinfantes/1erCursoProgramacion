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
/*Construye un programa que le el año de nacimiento de una persona y nos
diga si es mayor de edad o no. Declara una constante con el año actual.*/
public class MayorDeEdad {
    public static final int ANIO_ACTUAL=2020;
    public static void main(String[] args)
    {
        int anioNacimiento;
        // Creamos una variable de tipo Scanner para leer
        // el teclado, que envía caracteres a través del
        // stream System.in
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Año de nacimiento: ");
        // Leemos una valor int con el método nextInt()
        anioNacimiento = teclado.nextInt();
        // Utilizamos un if para comprobar si tiene
        // 18 años o más.
        if ((ANIO_ACTUAL-anioNacimiento) >= 18)
            {
            // Si la condición es cierta, se ejecuta
            // este bloque
            System.out.println ("Mayor de edad");
            }
        else
            {
            // Si la condición es falsa, se ejecuta
            // este bloque
            System.out.println ("Menor de edad");
            }
    }
}
