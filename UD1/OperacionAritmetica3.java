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
/*Modifica el programa anterior para que haga las operaciones indicadas hasta
que el usuario introduzca como operandos dos ceros.*/
public class OperacionAritmetica3 {
  public static void main(String[] args)
    {
        int num1, num2;
        String operacion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print ("\nPrimer número: ");
            num1 = teclado.nextInt();
            System.out.print ("Segundo número: ");
            num2 = teclado.nextInt();
            // if (!(num1==0 && num2==0)) {
            System.out.print ("Operación (+ - * /) ");
            operacion = teclado.next();
            switch (operacion.charAt(0))
                {
                    case '+': System.out.println (num1 + " + " + num2 + " = " + (num1+num2)); 
                    break;
                    case '-': System.out.println (num1 + " - " + num2 + " = " + (num1-num2)); 
                    break;
                    case '*': System.out.println (num1 + " * " + num2 + " = " + (num1*num2)); 
                    break;
                    case '/': if (num2!=0) System.out.println (num1 + " / " + num2 + " = " + (num1/num2));
                    else System.out.println ("División por cero.");
                    break;
                    default: System.out.println ("Operación desconocida.");
                }
            // } // if
        } while (!(num1==0 && num2==0));
        teclado.close();
    }
}
