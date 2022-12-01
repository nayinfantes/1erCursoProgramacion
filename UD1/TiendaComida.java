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
/*Escribe un programa que nos indique cuál es la factura de venta de bocadillos
de un cliente, sabiendo que existen los siguientes bocadillos:
- Jamón: 5,50€
- Tortilla: 4€
- Bacon: 4€
- Lomo: 4,50€*/
public class TiendaComida {
    public static double JAMON=5.50;
    public static double TORTILLA=4.00;
    public static double BACON=4.00;
    public static double LOMO=4.50;

    public static void main(String[] args)
    {
        // Contadores de bocadillos
        int numJ=0, numT=0, numB=0, numL=0;
        // Total factura
        double totalFactura=0;
        String opcion;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println ("\n(J)amón");
            System.out.println ("(T)ortilla");
            System.out.println ("(B)acon");
            System.out.println ("(L)omo");
            System.out.println ("\n(S)alir");
            opcion=teclado.next();
            // Comprobamos la opción introducida
            switch (opcion.charAt(0))
            {
                case 'j': numJ++; break;
                case 't': numT++; break;
                case 'b': numB++; break;
                case 'l': numL++; break;
            }
        } while (opcion.charAt(0)!='s');
        System.out.println ("\nFactura");
        if (numJ>0) 
            System.out.println ("Jamón "+numJ+" x "+JAMON+" = " + (numJ*JAMON)+"€");
        if (numT>0) 
            System.out.println ("Tortilla "+numT+" x "+TORTILLA+" = " + (numT*TORTILLA)+"€");
        if (numB>0) 
            System.out.println ("Bacon "+numB+" x "+BACON+" = " + (numB*BACON)+"€");
        if (numL>0) 
            System.out.println ("Lomo "+numL+" x "+LOMO+" = " + (numL*LOMO)+"€");
        totalFactura = (numJ*JAMON)+(numT*TORTILLA)+(numB*BACON)+(numL*LOMO);
        System.out.println ("Total "+totalFactura+"€");
        teclado.close();
    }
}
