/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD5;
import java.io.Serializable;
/**
 *
 * @author nayra
 */
/*Codifica una clase Java llamada Usuario que contenga un atributo nombre y
un atributo transient edad.
Crea un método que devuelva un String con la información de ambos campos
concatenada, de forma que pueda usarse desde cualquier punto de un
programa.
Después crea un programa que utilice esta clase, cree un objeto y lo serialice.
Imprime en pantalla los datos del objeto antes de serializarlo y después, para
poder observar el efecto del modificador transient.*/
public class Usuario implements Serializable
{
    private String nombre;
    private transient int edad; // Atributo transient
    // Constructor
    public Usuario(String no, int ed)
    {
    this.nombre = no;
    this.edad = ed;
    }
    // Método que devuelve un string con la información del objeto
    public String toString()
    {
    return ("Usuario - Nombre: " + this.nombre + " Edad: " + this.edad);
    }
}
