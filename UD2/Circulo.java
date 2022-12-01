/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD2;

/**
 *
 * @author nayra
 */
public class Circulo {
    /**
* Modeliza un círculo
*/

    // Constante Pi
    static double PI=3.14159;
    // Atributos
    private double radio;
    // Constructor
    public Circulo(double nuevoRadio)
    {
        this.radio=nuevoRadio;
    }
    // Getters y Setters
    public void setRadio(double nuevoRadio)
        {
        this.radio=nuevoRadio;
        }
    public double getRadio()
        {
        return (radio);
        }
    // Métodos
    public double calcularArea()
        {
        return (PI*(radio*radio));
        }
    public void escribir()
        {
        System.out.println ("\nRadio: "+radio);
        System.out.println ("Área: "+calcularArea());
        }
}
