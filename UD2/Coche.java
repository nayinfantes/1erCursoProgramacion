/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD2;

/**
 *
 * @author nayra
 */
public class Coche {
/**
* Modeliza un coche
*/
    private String marca;
    private String modelo;
    private String color;
    // Constructores
    public Coche (String nuevaMarca, String nuevoModelo)
    {
        this.marca=nuevaMarca;
        this.modelo=nuevoModelo;
    }
    public Coche (String nuevaMarca, String nuevoModelo, String nuevoColor)
    {
        this.marca=nuevaMarca;
        this.modelo=nuevoModelo;
        this.color=nuevoColor;
    }
    // Setters y Getters
    public String getMarca()
    {return (this.marca);}
    public void setMarca(String mar)
    {this.marca=mar;}
    public String getModelo()
    {return (this.modelo);}
    public void setModelo(String mod)
    {this.modelo=mod;}
    public String getColor()
    {return (this.color);}
    public void setColor(String col)
    {this.color=col;}
    // Métodos de la clase
    public void imprimir()
    {
        System.out.println ("\n");
        System.out.println ("Marca: " + marca);
        System.out.println ("Modelo: " + modelo);
        System.out.println ("Color: " + color);
    }
}
