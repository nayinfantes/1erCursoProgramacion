/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4;
import java.util.Scanner;
/**
 *
 * @author nayra
 */
/*Crea un programa Java que lea el nombre y el año de nacimiento del primer
titular de una cuenta bancaria que se pretende crear.
Si el titular es menor de edad, no puede crearse la cuenta, y se debe lanzar
una nueva excepción con un mensaje oportuno.
Realiza la lectura de los datos en un método que lance la citada excepción,
para que sea recogida y tratada desde el método que lo invocó.*/
public class DatoscuentaBancaria
{
/**
* Lee el nombre y la fecha de nacimiento del primer
* titular de una cuenta bancaria.
*
* Si es menor de edad lanza una excepción.
* *
*/
    public static void leeDatos()
    {
        Scanner teclado = new Scanner(System.in);
        String nombrePrimerTitular;
        int anioNacim=0;
        System.out.print ("Nombre del primer titular: ");
        nombrePrimerTitular=teclado.next();
        System.out.print ("Año de nacimiento del primer titular: ");
        anioNacim = teclado.nextInt();
        teclado.close();
        if (anioNacim >2003) throw new MenorDeEdad ("El primer titular es menor de edad.");
        }
        public static void main(String[] args)
        {
        try
        {
        leeDatos();
        System.out.println ("Datos correctos");
        }
        catch (MenorDeEdad mde)
        {
        System.out.println ("No puede crearse la cuenta bancaria: " + mde.getMessage());

        }
    }
}
