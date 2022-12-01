/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4;

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
public class MenorDeEdad extends IllegalArgumentException
/**
* Excepción que se lanza cuando la persona es
* menor de edad.
*/
    {
    public MenorDeEdad (String mensaje)
        {
        super (mensaje);
        }
}
