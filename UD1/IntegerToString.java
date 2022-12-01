/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD1;

/**
 *
 * @author nayra
 */
/*Crea un programa que declare una variable del tipo Integer. Asígnale un valor
y después transfiere ese valor a una variable String.
A continuación, imprime por pantalla ambas variables.*/
public class IntegerToString {
    public static void main(String[] args)
    {
        Integer numero=5;
        String valor;
        // toString() devuelve el String que representa el
        // valor de la variable numero
        valor=numero.toString();
        System.out.println ("Integer: " + numero);
        System.out.println ("String: " + valor);
    }
}
