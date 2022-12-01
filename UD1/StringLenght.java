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
/*Escribe un programa que cuente el número de caracteres que tiene una
palabra que haya introducido el usuario.
Consulta la referencia Java para poder localizar algún método que realice esta
función.*/
public class StringLenght {
   public static void main(String[] args)
    {
        String palabra;
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Introduce una palabra: ");
        palabra=teclado.next();
        System.out.println ("Número de caracteres: " + palabra.length());
        teclado.close();
    } 
}
