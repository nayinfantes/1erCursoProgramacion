/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD5;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author nayra
 */
/*Escribe un programa Java que abra un fichero de texto para escritura y
escriba varias en él varias líneas de texto.
A continuación, añade el código necesario para que se lea el fichero generado
y escriba el texto leído en pantalla.*/
public class FicheroTexto {
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter ("C:\\a\\fich_texto.txt");
            fw.write("Varias\n");
            fw.write("líneas\n");
            fw.write("de texto\n");
            String txt="Clase de programación\n";
            fw.write (txt);
            fw.close();
        }
        catch (IOException ioe)
        {
            System.err.println ("Error escribiendo fichero.");
            ioe.printStackTrace();
        }
        try
        {
            System.out.println ("\nLeyendo fichero...");
            FileReader fr = new FileReader ("C:\\a\\fich_texto.txt");
            int i;
            while ((i=fr.read()) != -1)
                System.out.print ((char)i);
            fr.close();
        }
        catch (IOException ioe)
        {
            System.err.println ("Error leyendo fichero.");
            ioe.printStackTrace();
        }
    }
}
