/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD2;
import UD2.Coche;
/**
 *
 * @author nayra
 */
/**
* Crea dos objetos de la clase coche y muestra los
* valores de sus atributos.
*/

public class UsoCoche{
    public static void main(String[] args)
    {
        // Crea un objeto Coche utilizando el constructor con
        // todos sus atributos
        Coche miCoche = new Coche ("Audi", "A4", "Blanco");
        miCoche.imprimir();
        // Crea un objeto Coche utilizando el constructor con
        // los atributos marca y modelo.
        // Después establece el color con un setter.
        Coche miOtroCoche = new Coche ("Porsche", "Cayenne");
        miOtroCoche.setColor("Azul");
        miOtroCoche.imprimir();
    }
}
