/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD5;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
/**
 *
 * @author nayra
 */
/*Codifica una clase Java llamada Usuario que contenga un atributo nombre y
un atributo transient edad.
Crea un método que devuelva un String con la información de ambos campos
concatenada, de forma que pueda usarse desde cualquier punto de un
programa.
Después crea un programa que utilice esta clase, cree un objeto y lo serialice.
Imprime en pantalla los datos del objeto antes de serializarlo y después, para
poder observar el efecto del modificador transient.*/
public class SerializarUsuario {
    public static void main(String[] args)
    {
        // Se crea un objeto Usuario
        Usuario usu = new Usuario ("Marco", 23);
        // Escribimos los datos del objeto antes de serializar
        System.out.println (usu.toString());
        // Serializamos el objeto
        try
        {
            ObjectOutputStream oo = new ObjectOutputStream(new
            FileOutputStream("c:\\a\\usuarios.bin"));
            oo.writeObject(usu);
            oo.close();
        }
        catch (IOException ioe)
        {

            System.err.println ("Error escribiendo en el fichero");
        }
        // Leemos el objeto serializado
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\a\\usuarios.bin"));
            // Se lee el objeto y se hace un casting a la clase Usuario
            usu = (Usuario) in.readObject();
            System.out.println(usu.toString());
            in.close();
        }
        catch (IOException ioe)
        {
            System.err.println ("Error leyendo el fichero");
        }
        catch (ClassNotFoundException cnfe)
        {
            System.err.println ("Error de casting");
        }
    }
}

