/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD1;

/**
 *
 * @author nayra
 */
/*Haz un programa que declare 2 variables numéricas y escriba el resultado de
las 4 operaciones básicas con el siguiente formato:
<num1> + <num2> = <resultado_suma>
<num1> - <num2> = <resultado_resta>
<num1> x <num2> = <resultado_multiplicación>
<num1> : <num2> = <resultado_división>*/
public class OperacionesMatematicas {
    public static void main(String[] args)
    {
        int num1=6;
        int num2=3;
        System.out.println (num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println (num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println (num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println (num1 + " : " + num2 + " = " + (num1/num2));
    }
}
