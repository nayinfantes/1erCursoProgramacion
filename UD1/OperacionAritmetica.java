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
/*Codifica un programa que lea dos números y una operación aritmética, a
continuación, realiza la operación mostrando así el resultado:

<num1> <operación> <num2> = <resultado>*/
public class OperacionAritmetica {
    public static void main(String[] args)
    {
        int num1, num2;
        String operacion;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Primer número: ");
        num1 = teclado.nextInt();
        System.out.print ("Segundo número: ");
        num2 = teclado.nextInt();
        System.out.print ("Operación (+ - * /) ");
        operacion = teclado.next();
        switch (operacion.charAt(0))
            {
                case '+': System.out.println (num1 + " + " + num2 + " = " + (num1+num2)); break;
                case '-': System.out.println (num1 + " - " + num2 + " = " + (num1-num2)); break;
                case '*': System.out.println (num1 + " * " + num2 + " = " + (num1*num2)); break;
                case '/': System.out.println (num1 + " / " + num2 + " = " + (num1/num2)); break;
                default: System.out.println ("Operación desconocida.");
            }
        teclado.close();
    }
}

